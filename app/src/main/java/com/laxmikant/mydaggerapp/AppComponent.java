package com.laxmikant.mydaggerapp;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Laxmikant Mahamuni on 22-03-2018.
 */

/**
 * This interface specifies application components,
 * that which can be injectable components and those who can consume these injections
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
        }
)

public interface AppComponent {

    @BATAPI
    Retrofit retrofitForBAT();

    void inject(DaggerApplication daggerApplication);
}
