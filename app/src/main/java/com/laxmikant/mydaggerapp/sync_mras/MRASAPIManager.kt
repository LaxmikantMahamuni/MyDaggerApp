package com.bookatable.android.sync_mras

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.laxmikant.mydaggerapp.AppConstants
import com.laxmikant.mydaggerapp.Configs
import com.laxmikant.mydaggerapp.mrasAPI.MRASListResponse
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import rx.schedulers.Schedulers
import java.lang.Exception

/**
 * Created by Laxmikant Mahmauni on 19-10-2018.
 */

class MRASAPIManager constructor(private var mrasAPIRepository: IMRASAPIRepository,
                                 private var mapperIMRAS: IMRASResponseMapper)
    : IMRASAPIManager, Observable<MRAS_SyncState>() {

    private lateinit var mrasChangeObserver: Observer<in MRAS_SyncState>
    private lateinit var disposable: Disposable

    public override fun subscribeActual(observer: Observer<in MRAS_SyncState>?) {
        mrasChangeObserver = observer!!
        disposable = CustomDisposable()
    }

    @Throws(Exception::class)
    fun execute() {
        this::mrasChangeObserver.isInitialized.apply {
            when (this) {
                true -> {
                    mrasChangeObserver.onSubscribe(disposable)
                    getMRASData()
                }
                false -> throw Exception("Observer not registered!")
            }
        }
    }

    override fun getMRASData() {

        var jsonObject: JsonObject = JsonObject()

        var jsonArray: JsonArray = JsonArray()
        jsonArray.add("100001")
        jsonArray.add("100005")
        jsonArray.add("100036")
        jsonArray.add("100041")
        jsonArray.add("100064")
        jsonArray.add("100072")
        jsonArray.add("100089")
        jsonArray.add("100090")
        jsonArray.add("100108")
        jsonArray.add("100137")
        jsonArray.add("100149")
        jsonArray.add("100162")
        jsonArray.add("100168")
        jsonArray.add("101012")
        jsonArray.add("101026")


        jsonObject.add("restaurantIds", jsonArray);
        jsonObject.addProperty("dateFrom", "2018-11-03");
        jsonObject.addProperty("timeFrom", "20:00");
        jsonObject.addProperty("dateTo", "2018-11-03");
        jsonObject.addProperty("timeTo", "23:59");
        jsonObject.addProperty("partySize", "2");
        jsonObject.addProperty("languageCode", "en-GB");
        jsonObject.addProperty("partnerCode", AppConstants.ANDROID_CHANNEL_ID);

        mrasAPIRepository.callMRASAPIAndGetData(Configs.API_KEY, jsonObject)
                .subscribeOn(Schedulers.io()).map(mapperIMRAS).subscribe {

                }
    }

    /**
     * insert/update/delete data in database
     */
    private fun mapData(response: MRASListResponse?) {
    }

    class CustomDisposable : Disposable {
        override fun dispose() {

        }

        override fun isDisposed(): Boolean {
            return false
        }
    }
}