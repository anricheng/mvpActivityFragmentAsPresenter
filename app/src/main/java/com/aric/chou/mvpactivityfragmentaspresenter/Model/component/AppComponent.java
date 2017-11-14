package com.aric.chou.mvpactivityfragmentaspresenter.Model.component;

import android.app.Application;

import com.aric.chou.mvpactivityfragmentaspresenter.Model.module.ApiServiceModule;
import com.aric.chou.mvpactivityfragmentaspresenter.Model.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.Model.component
 * Created by Aric on 下午1:54.
 */

@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class})
public interface AppComponent {
    Application getApplication();

}
