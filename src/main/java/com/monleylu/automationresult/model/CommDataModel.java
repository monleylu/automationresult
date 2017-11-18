package com.monleylu.automationresult.model;

/**
 * commonal data type model
 * Created by lujian on 2017/11/8.
 */
public class CommDataModel {
    //data to be process
    private Object data;
    //which type of data
    private String dataType;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
