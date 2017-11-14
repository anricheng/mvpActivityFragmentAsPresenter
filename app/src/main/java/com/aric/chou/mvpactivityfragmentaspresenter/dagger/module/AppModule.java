package com.aric.chou.mvpactivityfragmentaspresenter.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.dagger.module
 * Created by Aric on 下午6:00.
 */

@Module
public class AppModule {

    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }
}