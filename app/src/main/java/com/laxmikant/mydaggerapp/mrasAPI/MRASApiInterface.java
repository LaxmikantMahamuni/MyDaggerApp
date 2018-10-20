package com.laxmikant.mydaggerapp.mrasAPI;

import com.google.gson.JsonObject;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Laxmikant Mahamuni on 10-08-2018.
 */

public interface MRASApiInterface {

    @POST("availability")
    Observable<MRASListResponse> getMRASTimeSlotForListing(@Header("x-api-key") String API_KEY,
                                                           @Body JsonObject jsonBody);


}
