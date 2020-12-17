package com.example.myapplication.contract;

import com.example.myapplication.model.UserBean;
import com.example.myapplication.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel{
        <T> void getLoginData(String url,INetCallBack<T> callBack);
    }

    public interface IMainPresenter{
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView{
        String getUsetName();
        String getPassword();
        void getData(UserBean string);
    }
}
