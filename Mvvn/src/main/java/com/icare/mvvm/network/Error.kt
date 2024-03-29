package com.icare.mvvm.network

import com.icare.mvvm.R
import com.icare.mvvm.base.BaseApp


/**
 *
 * @description:     错误枚举类
 * @author:         Mr.He
 * @createDate:     6/17/21 11:19 AM
 * @updateUser:     更新者：Mr.He
 * @updateDate:     6/17/21 11:19 AM
 */
enum class Error(private val code: Int, private val err: String) {

    /**
     * 未知错误
     */
    UNKNOWN(1000, BaseApp.content!!.getString(R.string.lib_1)),
    /**
     * 解析错误
     */
    PARSE_ERROR(1001,  BaseApp.content!!.getString(R.string.lib_2)),
    /**
     * 网络错误
     */
    NETWORK_ERROR(1002,  BaseApp.content!!.getString(R.string.lib_3)),

    /**
     * 证书出错
     */
    SSL_ERROR(1004,  BaseApp.content!!.getString(R.string.lib_4)),

    /**
     * 连接超时
     */
    TIMEOUT_ERROR(1006,  BaseApp.content!!.getString(R.string.lib_5));

    fun getValue(): String {
        return err
    }

    fun getKey(): Int {
        return code
    }

}