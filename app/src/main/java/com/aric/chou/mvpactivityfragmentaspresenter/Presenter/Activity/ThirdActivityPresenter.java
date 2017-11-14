package com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Activity;

import android.support.v4.app.FragmentTransaction;

import com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Fragment.FirstFragmentPresenter;
import com.aric.chou.mvpactivityfragmentaspresenter.R;
import com.aric.chou.mvpactivityfragmentaspresenter.View.ThirdActivityViewDelegate;

public class ThirdActivityPresenter extends ActivityPresenter<ThirdActivityViewDelegate>{

    @Override
    protected Class<ThirdActivityViewDelegate> getDelegateClass() {
        return ThirdActivityViewDelegate.class;
    }

    @Override
    protected void initView() {
        super.initView();
        mViewDelegate.setTextById(R.id.tv_third,"This is Third Activity");

        FragmentTransaction mTransaction = getSupportFragmentManager().beginTransaction();

        mTransaction.replace(R.id.fl_container, FirstFragmentPresenter.newInstance("This is the data from Avtivity")).commit();
    }
}
