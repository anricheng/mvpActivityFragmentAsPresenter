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
package com.aric.chou.mvpactivityfragmentaspresenter.databind;

import android.os.Bundle;
import android.view.View;

import com.aric.chou.mvpactivityfragmentaspresenter.model.AbsModel;
import com.aric.chou.mvpactivityfragmentaspresenter.presenter.fragment.FragmentPresenter;
import com.aric.chou.mvpactivityfragmentaspresenter.View.IViewDelegate;

public abstract class DataBindFragment<T extends IViewDelegate> extends
        FragmentPresenter<T> {

    protected DataBinder binder;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binder = getDataBinder();
    }

    public abstract DataBinder getDataBinder();

    public <T extends AbsModel> void notifyModelChanged(T data) {
        if (binder != null)
            binder.viewBindModel(mViewDelegate, data);
    }
}
