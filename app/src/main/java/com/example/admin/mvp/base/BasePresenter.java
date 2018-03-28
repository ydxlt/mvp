package com.example.admin.mvp.base;

import com.example.admin.mvp.interfaces.IPresenter;
import com.example.admin.mvp.interfaces.IView;

/**
 * Created by admin on 2018/3/28.
 */

public class BasePresenter<V extends IView> implements IPresenter<V> {

    private V mView;

    @Override
    public void attachView(V view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    protected V getView() {
        return mView;
    }
}
