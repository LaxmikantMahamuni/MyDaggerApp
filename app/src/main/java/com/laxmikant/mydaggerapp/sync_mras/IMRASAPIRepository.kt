package com.bookatable.android.sync_mras

import com.google.gson.JsonObject
import com.laxmikant.mydaggerapp.mrasAPI.MRASListResponse
import rx.Observable


/**
 * Created by Laxmikant Mahmauni on 19-10-2018.
 */
interface IMRASAPIRepository {

    fun callMRASAPIAndGetData(apiKey: String, jsonObject: JsonObject): Observable<MRASListResponse>
}