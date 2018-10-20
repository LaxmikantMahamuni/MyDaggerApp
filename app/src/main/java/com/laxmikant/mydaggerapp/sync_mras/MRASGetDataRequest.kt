package com.bookatable.android.sync_mras

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import com.bookatable.android.sync_mras.MRAS_SyncState.BROKEN
import com.bookatable.android.sync_mras.MRAS_SyncState.PAUSE
import com.bookatable.android.sync_mras.MRAS_SyncState.DONE
import com.bookatable.android.sync_mras.MRAS_SyncState.OPERATIVE
import javax.inject.Inject

/**
 * Request initiator class that communicates with Sync Manager to begin/resume Restaurant sync
 * Created by Hardik on 15-06-2018.
 */
open class MRASGetDataRequest @Inject constructor(var serviceManager: MRASAPIManager) : Observer<MRAS_SyncState> {
    private var currentState: MRAS_SyncState = MRAS_SyncState.PAUSE
    private var disposable: Disposable? = null

    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
        disposable = d
        currentState = OPERATIVE
    }

    override fun onNext(t: MRAS_SyncState) {
        currentState = t
    }

    override fun onError(e: Throwable) {
        currentState = BROKEN
    }

    /**
     * starts or resumes sync request possibly when app state changes to foreground
     * we check the syncing progress, if it was ideal or failed due to some reason we again resume it
     */
    fun initRequest() {

        when (currentState) {
            BROKEN, PAUSE -> {
                serviceManager.subscribeActual(this)
                serviceManager.execute()
            }
            OPERATIVE -> {
                //do nothing
            }
            DONE -> {
                //do nothing
                disposable?.dispose()
            }
        }
    }
}
