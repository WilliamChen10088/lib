package com.icare.mvvm.network

import com.icare.mvvm.R
import com.icare.mvvm.base.BaseApp


/**
 *
 * @description:     自定义错误信息异常
 * @author:         Mr.He
 * @createDate:     6/17/21 11:20 AM
 * @updateUser:     更新者：Mr.He
 * @updateDate:     6/17/21 11:20 AM
 */
class AppException : Exception {

    var errorMsg: String //错误消息
    var errCode: Int = 0 //错误码
    var errorLog: String? //错误日志

    constructor(errCode: Int, error: String?, errorLog: String? = "") : super(error) {
        this.errorMsg = error ?: BaseApp.content!!.getString(R.string.lib_1)
        this.errCode = errCode
        this.errorLog = errorLog?:this.errorMsg
    }

    constructor(error: Error,e: Throwable?) {
        errCode = error.getKey()
        errorMsg = error.getValue()
        errorLog = e?.message
    }
}