package com.bookatable.android.sync_mras

import com.laxmikant.mydaggerapp.mrasAPI.MRASListResponse
import com.laxmikant.mydaggerapp.sync_mras.ChangesMapResponse
import java.util.*
import javax.inject.Inject


/**
 * Created by Laxmikant Mahmauni on 19-10-2018.
 */

class MRASResponseMapper @Inject constructor() : IMRASResponseMapper {


    override fun call(response: MRASListResponse?): ChangesMapResponse {
        return mapMRASResponse(response)
    }

    override fun mapMRASResponse(response: MRASListResponse?): ChangesMapResponse {
        val deletedIds = mutableListOf<String>()
        val restaurants = mutableListOf<Objects>()

        return ChangesMapResponse(restaurants, deletedIds, "", 1)
    }
}