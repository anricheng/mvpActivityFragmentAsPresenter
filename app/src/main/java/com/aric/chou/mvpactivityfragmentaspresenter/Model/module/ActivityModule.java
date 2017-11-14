package com.aric.chou.mvpactivityfragmentaspresenter.Model.module;

import com.aric.chou.mvpactivityfragmentaspresenter.View.MainActivityViewDelegate;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.Model.module
 * Created by Aric on 下午3:07.
 */
@Module
public class ActivityModule {

    @Singleton
    @Provides
    MainActivityViewDelegate provideMainActivityViewDelegate(){
        return  new MainActivityViewDelegate();
    }
}
