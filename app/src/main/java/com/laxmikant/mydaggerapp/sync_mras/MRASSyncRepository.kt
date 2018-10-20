package com.bookatable.android.sync_mras

import com.google.gson.JsonObject
import com.laxmikant.mydaggerapp.BATAPI
import com.laxmikant.mydaggerapp.mrasAPI.MRASApiInterface
import com.laxmikant.mydaggerapp.mrasAPI.MRASListResponse
import rx.Observable
import retrofit2.Retrofit


/**
 * Created by Laxmikant Mahmauni on 19-10-2018.
 */
class MRASSyncRepository constructor(@BATAPI private val retrofit: Retrofit) : IMRASAPIRepository {
    override fun callMRASAPIAndGetData(apiKey: String, jsonObject: JsonObject): Observable<MRASListResponse> {
        return retrofit.create(MRASApiInterface::class.java).getMRASTimeSlotForListing(apiKey, jsonObject)
    }
}