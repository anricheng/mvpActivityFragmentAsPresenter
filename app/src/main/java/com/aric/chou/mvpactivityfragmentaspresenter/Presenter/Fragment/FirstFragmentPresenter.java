package com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Fragment;

import android.os.Bundle;
import android.view.View;

import com.aric.chou.mvpactivityfragmentaspresenter.R;
import com.aric.chou.mvpactivityfragmentaspresenter.View.MainActivityViewDelegate;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Fragment
 * Created by Aric on 下午5:03.
 */

public class FirstFragmentPresenter extends FragmentPresenter <MainActivityViewDelegate>{

    private static final String OUTDATA="outdata";

    public static FirstFragmentPresenter newInstance(String outData) {

        Bundle args = new Bundle();
        args.putString(OUTDATA,outData);
        FirstFragmentPresenter fragment = new FirstFragmentPresenter();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected Class<MainActivityViewDelegate> getDelegateClass() {
        return MainActivityViewDelegate.class;
    }

    @Override
    protected void initView() {
        super.initView();

        String outdata = getArguments().getString(OUTDATA);

        mViewDelegate.setTextById(R.id.tv_context,outdata);
        mViewDelegate.get(R.id.bt_navigate).setVisibility(View.INVISIBLE);
    }
}
