package com.laxmikant.mydaggerapp.mrasAPI;

import android.content.Context;

import com.laxmikant.mydaggerapp.Configs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAPI {

    private static final String TAG = RestAPI.class.getSimpleName();

    public static Retrofit initializeRetrofit(Context context) {
        Retrofit retrofit = null;
        try {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addNetworkInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    // Request customization: add request headers
                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Cache-Control", "String.format(\"max-age=%d, no-cached, max-stale=%d\", 1, 0)")
                            .addHeader("Cache-Control", "no-store")
                            .addHeader("Accept", "application/json")
                            .addHeader("Content-Type", "application/json")
                            .cacheControl(CacheControl.FORCE_NETWORK); // <-- this is the important line

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            retrofit = new Retrofit.Builder()
                    .baseUrl(Configs.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(getHttpClientInterceptor().build())
                    .build();

        } catch (Exception e) {

        }
        return retrofit;
    }

    private static OkHttpClient.Builder getHttpClientInterceptor() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builderHttpClient = new OkHttpClient.Builder();
        builderHttpClient.connectTimeout(30, TimeUnit.SECONDS);
        builderHttpClient.readTimeout(30, TimeUnit.SECONDS);
        builderHttpClient.writeTimeout(30, TimeUnit.SECONDS);
        builderHttpClient.addInterceptor(logging);
        builderHttpClient.retryOnConnectionFailure(true);
        return builderHttpClient;
    }
}
