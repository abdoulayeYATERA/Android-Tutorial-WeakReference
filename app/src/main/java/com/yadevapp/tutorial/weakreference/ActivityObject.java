package com.yadevapp.tutorial.weakreference;

import android.content.Context;

import java.lang.ref.WeakReference;

/**
 * Created by abdoulaye on 22/07/2017.
 */

public class ActivityObject {
    private WeakReference<Context> mActivity;

    public ActivityObject(Context activity) {
        mActivity = new WeakReference<>(activity);
    }
}
