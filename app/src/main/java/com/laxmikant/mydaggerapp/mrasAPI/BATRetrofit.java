package com.laxmikant.mydaggerapp.mrasAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.laxmikant.mydaggerapp.Configs;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Laxmikant Mahamuni on 26-03-2018.
 * Edited by Hardik on 04-07-2018
 */

/**
 * Initialize retrofit object for network calls
 */
public class BATRetrofit {
    /**
     * provides retrofit instance for BAT apis
     *
     * @return retrofit instance
     */
    public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Configs.BASE_URL)
                .client(provideHttpClient())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(provideGson()))
                .build();
    }

    /**
     * provides retrofit instance for Places apis
     *
     * @return retrofit instance
     */
    public static Retrofit getRetrofitForPlaces() {
        final String PLACE_URL = "https://maps.googleapis.com/";
        return new Retrofit.Builder()
                .baseUrl(PLACE_URL)
                .client(provideHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(provideGson()))
                .build();
    }

    private static OkHttpClient provideHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(Configs.DEBUG ? HttpLoggingInterceptor.Level.BODY
                : HttpLoggingInterceptor.Level.NONE);


        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .retryOnConnectionFailure(true)
                .build();
    }

    private static Gson provideGson() {
        return new GsonBuilder().setLenient().create();
    }


}
