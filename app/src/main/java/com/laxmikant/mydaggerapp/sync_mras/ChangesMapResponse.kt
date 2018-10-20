package com.laxmikant.mydaggerapp.sync_mras

import java.util.*


/**
 * Created by Hardik on 15-06-2018.
 */
class ChangesMapResponse(val restaurantList: MutableList<Objects>, val deletedIds: MutableList<String>, val lastSequence: String, val pending: Int?)

