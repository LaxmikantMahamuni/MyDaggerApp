package com.laxmikant.mydaggerapp.mrasAPI;

import android.content.Context;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.laxmikant.mydaggerapp.AppConstants;
import com.laxmikant.mydaggerapp.Configs;

import rx.Observable;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class MRASRestaurantListingsDAO {

    private Context context;

    private static MRASRestaurantListingsDAO mrasRestaurantListingsDAO = null;

    private MRASRestaurantListingsDAO(Context context) {
        this.context = context;
    }

    public static MRASRestaurantListingsDAO getInstance(Context context) {
        if (mrasRestaurantListingsDAO == null) {
            mrasRestaurantListingsDAO = new MRASRestaurantListingsDAO(context);
        }
        return mrasRestaurantListingsDAO;
    }

    public Observable<MRASListResponse> getMRASAvailableTimeSlots(JsonArray jsonArray, String partySize, String dateFrom, String dateTo) {
        MRASApiInterface mrasApiInterface = RestAPI.initializeRetrofit(context).create(MRASApiInterface.class);

        JsonObject jsonObject = new JsonObject();
        jsonObject.add("restaurantIds", jsonArray);
        jsonObject.addProperty("dateFrom", dateFrom);
        jsonObject.addProperty("timeFrom", "20:00");
        jsonObject.addProperty("dateTo", dateTo);
        jsonObject.addProperty("timeTo", "23:59");
        jsonObject.addProperty("partySize", partySize);
        jsonObject.addProperty("languageCode", "en-GB");
        jsonObject.addProperty("partnerCode", AppConstants.ANDROID_CHANNEL_ID);

        return mrasApiInterface.getMRASTimeSlotForListing(Configs.API_KEY, jsonObject);
    }
}
