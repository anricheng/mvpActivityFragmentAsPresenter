package com.aric.chou.mvpactivityfragmentaspresenter.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * com.aric.chou.mvpactivityfragmentaspresenter.View
 * Created by Aric on 下午2:25.
 */

public interface IViewDelegate {
    void create(LayoutInflater i, ViewGroup v, Bundle b);
    View getRootView();
    void clear();
}