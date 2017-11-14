package com.aric.chou.mvpactivityfragmentaspresenter.View;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.View
 * Created by Aric on 下午2:33.
 */

public abstract class BaseViewDelegate implements IViewDelegate {

    protected final SparseArray<View> mViews = new SparseArray<>();

    protected View rootView;

    public abstract int getRootLayoutId();


    public void clear(){
        mViews.clear();
    }

    @Override
    public void create(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int rootLayoutId = getRootLayoutId();
        rootView = inflater.inflate(rootLayoutId, container, false);
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    public <T extends View> T bindView(int id) {
        T view = (T) mViews.get(id);
        if (view == null) {
            view = (T) rootView.findViewById(id);
            mViews.put(id, view);
        }
        return view;
    }

    public <T extends View> T get(int id) {
        return (T) bindView(id);
    }

    public <T extends View> T addListenerById(int resourceId, View.OnClickListener listener){

        T view = get(resourceId);
        view.setOnClickListener(listener);
        return view ;
    }


    public TextView setTextById(int viewId, String text){

        TextView textView = get(viewId);
        textView.setText(text);
        return textView ;
    }



    public TextView setTextById(int viewId, int stringId){

        TextView textView = get(viewId);
        textView.setText(stringId);
        return textView ;
    }


    public ImageView setImageById(int viewId, int imageId){

        ImageView imageView = get(viewId);
        imageView.setBackgroundResource(imageId);
        return imageView ;
    }

}
