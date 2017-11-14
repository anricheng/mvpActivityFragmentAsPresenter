/*
 * Copyright (c) 2015, 张涛.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aric.chou.mvpactivityfragmentaspresenter.presenter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aric.chou.mvpactivityfragmentaspresenter.View.IViewDelegate;

/**
 * Presenter base class for Activity
 * Presenter层的实现基类
 *
 * @param <T> View delegate class type
 * @author kymjs (http://www.kymjs.com/) on 10/23/15.
 */
public abstract class ActivityPresenter<T extends IViewDelegate> extends AppCompatActivity {
    protected T mViewDelegate;

    public ActivityPresenter() {
        try {
            mViewDelegate = getDelegateClass().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException("create IDelegate error");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("create IDelegate error");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDelegate.create(getLayoutInflater(), null, savedInstanceState);
        setContentView(mViewDelegate.getRootView());
        initView();
    }

    protected void initView(  ) {
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (mViewDelegate == null) {
            try {
                mViewDelegate = getDelegateClass().newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("create IDelegate error");
            } catch (IllegalAccessException e) {
                throw new RuntimeException("create IDelegate error");
            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mViewDelegate.clear();
        mViewDelegate = null;

    }

    protected abstract Class<T> getDelegateClass();

    public void NavigateTo(Class activityClass){
        startActivity(new Intent(this,activityClass));
    }
}
