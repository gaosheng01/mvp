package com.example.myapplication1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication1.R;
import com.example.myapplication1.base.BaseActivity;
import com.example.myapplication1.contract.MainContract;
import com.example.myapplication1.model.UserBean;
import com.example.myapplication1.presenter.MainPresenterImpl;
import com.example.myapplication1.utils.net.INetCallBack;
import com.example.myapplication1.utils.net.RetrofitUtils;
import com.example.myapplication1.utils.net.URLConstant;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {

    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;

    @Override
    protected void initData() {
        presenter.login(getUsetName(),getPassword());
    }

    @Override
    protected void initView() {
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPassword=findViewById(R.id.editTextTextPassword);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl(this);
    }

    /**
     * 登录按钮
     * @param view
     */
    public void loginButton(View view){
        if (!TextUtils.isEmpty(getUsetName())&&!TextUtils.isEmpty(getPassword())){
            presenter.login(getUsetName(),getPassword());
        }
    }

    @Override
    public String getUsetName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public void getData(UserBean string) {
        //网络请求返回
    }
}