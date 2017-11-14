package com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Activity;

import android.view.View;

import com.aric.chou.mvpactivityfragmentaspresenter.R;
import com.aric.chou.mvpactivityfragmentaspresenter.View.MainActivityViewDelegate;

public class SecondActivityPresenter extends ActivityPresenter<MainActivityViewDelegate> implements View.OnClickListener {

    @Override
    protected Class getDelegateClass() {
        return MainActivityViewDelegate.class;
    }

    @Override
    protected void initView( ) {
        super.initView();
        mViewDelegate.setTextById(R.id.tv_context,"This is second Activity");
        mViewDelegate.addListenerById(R.id.bt_navigate,this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_navigate:
                NavigateTo(ThirdActivityPresenter.class);
        }
    }

}
