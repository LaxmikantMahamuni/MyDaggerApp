package com.laxmikant.mydaggerapp;

import android.app.Application;

import com.bookatable.android.sync_mras.IMRASResponseMapper;
import com.bookatable.android.sync_mras.MRASAPIManager;
import com.bookatable.android.sync_mras.MRASGetDataRequest;
import com.bookatable.android.sync_mras.MRASResponseMapper;
import com.bookatable.android.sync_mras.MRASSyncRepository;
import com.laxmikant.mydaggerapp.mrasAPI.BATRetrofit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Laxmikant Mahamuni on 22-03-2018.
 */


/**
 * Module annotation specifies this is an injectable class
 */
@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application BATApplication) {
        this.mApplication = BATApplication;
    }


    /**
     * Initialize retrofit object and provide it to application
     */
    @Singleton
    @BATAPI
    @Provides
    public Retrofit provideRetrofit() {
        return BATRetrofit.getRetrofit();
    }


    @Provides
    @Singleton
    public IMRASResponseMapper provideMRASDataMapper() {
        return new MRASResponseMapper();
    }

    @Provides
    @Singleton
    public MRASGetDataRequest provideMRASRequest(MRASAPIManager mrasapiManager) {
        return new MRASGetDataRequest(mrasapiManager);
    }

    @Provides
    @Singleton
    public MRASSyncRepository provideMRASRepository(@BATAPI Retrofit retrofit) {
        return new MRASSyncRepository(retrofit);
    }

    @Provides
    @Singleton
    public MRASAPIManager provideMRASManager(MRASSyncRepository mrasSyncRepository, MRASResponseMapper mrasResponseMapper) {
        return new MRASAPIManager(mrasSyncRepository, mrasResponseMapper);
    }

}
