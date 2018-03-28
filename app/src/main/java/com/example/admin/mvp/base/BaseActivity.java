package com.example.admin.mvp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.mvp.interfaces.IPresenter;
import com.example.admin.mvp.interfaces.IView;

/**
 * Created by admin on 2018/3/28.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {

    protected P mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        initView();
        mPresenter = createPresenter();
        mPresenter.attachView(this);
        initData();
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        // 解决因presenter持有activity的引用导致内存泄漏的隐患,同时需要注意可能会因为view别销毁，presenter使用view导致空指针异常的情况
        mPresenter.detachView();
        super.onDestroy();
    }

    protected void initData() {

    }

    protected abstract void initView();

    protected void init() {
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg) {

    }
}
