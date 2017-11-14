package com.aric.chou.mvpactivityfragmentaspresenter.dagger.module;

import com.aric.chou.mvpactivityfragmentaspresenter.View.MainActivityViewDelegate;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.dagger.module
 * Created by Aric on 下午5:59.
 */

@Module
public class ActivityModule {

    @Singleton
    @Provides
    MainActivityViewDelegate provideMainActivityViewDelegate(){
        return  new MainActivityViewDelegate();
    }
}