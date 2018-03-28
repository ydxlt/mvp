package com.example.admin.mvp.interfaces;

/**
 * Created by admin on 2018/3/28.
 */

public interface IModel<T> {

    /**
     * 请求成功
     * @param data
     */
    void requestSuccess(T data);

    /**
     * 发送请求前
     */
    void beforeRequest();

    /**
     * 请求失败
     * @param msg
     */
    void requestFailure(String msg);
}
