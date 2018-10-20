package com.laxmikant.mydaggerapp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.support.multidex.MultiDexApplication;

import com.bookatable.android.sync_mras.MRASGetDataRequest;

import javax.inject.Inject;


/**
 * An abstract application class to define and instantiate dependency components
 * Created by Hardik on 21-05-2018.
 */
public abstract class DaggerApplication extends MultiDexApplication {

    private static AppComponent appComponent;

    @Inject
    MRASGetDataRequest mrasGetDataRequest;

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent().inject(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppLifeCycleObserver());
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.
                    builder().
                    appModule(new AppModule(this)).
                    build();
        }
        return appComponent;
    }

    /**
     * App lifecycle observer that exposes callback method denoting APP_IN_FOREGROUND Event
     * We initiate/resume DBSync
     */
    class AppLifeCycleObserver implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            mrasGetDataRequest.initRequest();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {

        }
    }
}
