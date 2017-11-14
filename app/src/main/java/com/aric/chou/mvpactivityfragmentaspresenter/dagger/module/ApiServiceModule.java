package com.aric.chou.mvpactivityfragmentaspresenter.dagger.module;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.dagger.module
 * Created by Aric on 下午6:00.
 */

@Module
public class ApiServiceModule {
    private static final String ENDPOINT="";
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(60 * 1000, TimeUnit.MILLISECONDS).build();
        return okHttpClient;
    }
    @Provides
    @Singleton
    Retrofit provideRetrofit(Application application, OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder().client(okHttpClient).build();
        return retrofit;
    }
}
