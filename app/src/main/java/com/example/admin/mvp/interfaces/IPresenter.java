package com.example.admin.mvp.interfaces;

/**
 * Created by admin on 2018/3/28.
 */

public interface IPresenter<V extends IView>  {

    /**
     * 绑定view
     * @param view
     */
    void attachView(V view);

    /**
     * 取消绑定
     */
    void detachView();
}
