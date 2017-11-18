package com.monleylu.automationresult.model;
/**
 * 测试结果基类
 * Created by lujian on 2017/11/8.
 */
public class BaseResult {
    /**action result**/
    private boolean success;
    /**message for result **/
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
