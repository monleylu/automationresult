package com.monleylu.automationresult.model;

import java.util.ArrayList;

/**
 * send to bi server dataset
 * Created by lujian on 2017/11/9.
 */
public class ResultInfoSet {

    //set name，such as 跟团接口自动化
    private String name;
    //uuid ,for bi to distinguish diffient data,if is the same ,bi will union data
    private String key ;
    //distinguish diffient department data
    private int departmentID;
    private String departmentName;

    private ArrayList<ResultInfo> data;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public ArrayList<ResultInfo> getData() {
        return data;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setData(ArrayList<ResultInfo> data) {
        this.data = data;
    }
}
