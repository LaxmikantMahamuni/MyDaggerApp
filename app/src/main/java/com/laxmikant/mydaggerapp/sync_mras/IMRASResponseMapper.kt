package com.bookatable.android.sync_mras

import com.laxmikant.mydaggerapp.mrasAPI.MRASListResponse
import com.laxmikant.mydaggerapp.sync_mras.ChangesMapResponse
import rx.functions.Func1


/**
 * Created by Laxmikant Mahmauni on 19-10-2018.
 */
interface IMRASResponseMapper : Func1<MRASListResponse, ChangesMapResponse> {
    fun mapMRASResponse(response: MRASListResponse?): ChangesMapResponse
}