package com.kotlin.usercenter.presenter

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.usercenter.presenter.view.RegisterView

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
class RegisterPresenter:BasePresenter<RegisterView> (){
    fun register(mobile:String,verifyCode:String){
        mView.onRegiterResult(true)
    }
}