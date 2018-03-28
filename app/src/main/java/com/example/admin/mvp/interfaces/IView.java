package com.example.admin.mvp.interfaces;

/**
 * Created by admin on 2018/3/28.
 */

public interface IView {
    /**
     * 显示加载中
     * @param msg
     */
    void showLoading(String msg);

    /**
     * 隐藏加载中
     */
    void hideLoading();

    /**
     * 显示错误
     * @param msg
     */
    void showError(String msg);
}
