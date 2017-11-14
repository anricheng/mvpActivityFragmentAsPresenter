package com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Fragment;

import android.os.Bundle;

import com.aric.chou.mvpactivityfragmentaspresenter.R;
import com.aric.chou.mvpactivityfragmentaspresenter.View.FragmentViewDelegate;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.Presenter.Fragment
 * Created by Aric on 下午5:03.
 */

public class FirstFragmentPresenter extends FragmentPresenter <FragmentViewDelegate>{

    private static final String OUTDATA="outdata";

    public static FirstFragmentPresenter newInstance(String outData) {

        Bundle args = new Bundle();
        args.putString(OUTDATA,outData);
        FirstFragmentPresenter fragment = new FirstFragmentPresenter();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected Class<FragmentViewDelegate> getDelegateClass() {
        return FragmentViewDelegate.class;
    }

    @Override
    protected void initView() {
        super.initView();
        String outdata = getArguments().getString(OUTDATA);
        mViewDelegate.setTextById(R.id.tv_context,outdata);
    }
}
