package com.example.myapplication.presenter;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.contract.MainContract;
import com.example.myapplication.model.MainModelImpl;
import com.example.myapplication.model.UserBean;
import com.example.myapplication.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter implements MainContract.IMainPresenter {
    private MainContract.IMainModel mainModel;
    private MainContract.IMainView mainView;
    public MainPresenterImpl(MainContract.IMainView mainView){
        this.mainModel=new MainModelImpl(this);
        this.mainView=mainView;
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData("",new INetCallBack<UserBean>(){
            @Override
            public void onSuccess(UserBean userBean) {
                mainView.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}
