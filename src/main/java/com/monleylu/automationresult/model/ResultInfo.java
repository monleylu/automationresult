package com.monleylu.automationresult.model;

import java.util.ArrayList;

/**
 * store detail result ,data area store the data which want to know during automation test
 * Created by lujian on 2017/11/8.
 */
public class ResultInfo extends BaseResult{

    //testcase id and name
    private int id;
    private String name;

    //testcase start time
    private long startTime;
    //testcast stop time
    private long endTime;

    /**which platform,such as pc m app ios app android**/
    private int platform;
    private String platformName;

    /**which type of action ,1 for UI ,2 for interface ,which define in class ResultType**/
    private int type;
    private String typeName;
    //store result detail information, for deep process
    private ArrayList<CommDataModel> data;

    public ResultInfo() {
        startTimer();
    }

    /**
     * start measuring elapsed time for an interval
     */
    public void startTimer(){
        setStartTime(System.currentTimeMillis());
    }

    /**
     * Stops measuring elapsed time for an interval
     */
    public void stopTimer(){
        setEndTime(System.currentTimeMillis());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ArrayList<CommDataModel> getData() {
        return data;
    }

    public void setData(ArrayList<CommDataModel> data) {
        this.data = data;
    }
}
