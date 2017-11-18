package com.monleylu.automationresult;

import com.google.gson.Gson;
import com.monleylu.ToolUtil;
import com.monleylu.automationresult.model.*;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import testclass.DataOne;
import testclass.Insurance;
import testclass.TestUnit;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lujian on 2017/11/8.
 */
public class ResultInfoTest {
    Gson gson = new Gson();
    String rootPath = System.getProperty("user.dir");
    @Test
    public void test(){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setSuccess(true);
        resultInfo.setMsg("123");
        resultInfo.setName("add order1");
        resultInfo.setType(ResultType.AutomationType.UI);
        resultInfo.setTypeName(ResultType.AutomationType.UIName);
        resultInfo.setPlatform(ResultType.AutomationPlatform.Wireless);
        resultInfo.setPlatformName(ResultType.AutomationPlatform.WirelessName);
        ArrayList<CommDataModel> commDataModelArrayList = new ArrayList<CommDataModel>();
        resultInfo.setData(commDataModelArrayList);
        //testunit data
        CommDataModel commDataModel  = new CommDataModel();
        TestUnit testUnit = new TestUnit();
        testUnit.setDataOne(new DataOne("aaa",1));
        commDataModel.setDataType(ResultDataType.TestCase);
        commDataModel.setData(testUnit);
        commDataModelArrayList.add(commDataModel);


        //insurance
        CommDataModel commDataModel1 = new CommDataModel();
        ArrayList<Insurance> insuranceArrayList = new ArrayList<Insurance>();
        for (int i = 0; i < 2; i++) {
            insuranceArrayList.add(new Insurance("insurancename" +i,i));
        }
        commDataModel1.setData(insuranceArrayList);
        commDataModel1.setDataType(ResultDataType.INSURANCE);
        commDataModelArrayList.add(commDataModel1);

        resultInfo.setEndTime(System.currentTimeMillis());

        System.out.println("resultinfo : "  + gson.toJson(resultInfo));


    }

    //resolve data
    @Test
    public void test2() throws Exception{

        String resultdata = FileUtils.readFileToString( new File(rootPath +"/src/main/resources/" + "resultinfo"));
        ResultResolveMap resultResolveMap = new ResultResolveMap();
        HashMap<String ,Class> hashMap = new HashMap<String, Class>();
        hashMap.put(ResultDataType.INSURANCE,Insurance.class);
        hashMap.put(ResultDataType.TestCase, TestUnit.class);
        resultResolveMap.setRules(hashMap);
        ResultInfo resultInfo = resultResolveMap.resolveSingleResultInfoData(resultdata);



    }

    /**
     * resultset
     */
    @Test
    public void test3(){

        //data 1
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.startTimer();
        resultInfo.setSuccess(true);
        resultInfo.setMsg("123");
        resultInfo.setName("add order1");
        resultInfo.setType(ResultType.AutomationType.UI);
        resultInfo.setTypeName(ResultType.AutomationType.UIName);
        resultInfo.setPlatform(ResultType.AutomationPlatform.Wireless);
        resultInfo.setPlatformName(ResultType.AutomationPlatform.WirelessName);
        ArrayList<CommDataModel> commDataModelArrayList = new ArrayList<CommDataModel>();
        resultInfo.setData(commDataModelArrayList);
        //testunit data
        CommDataModel commDataModel  = new CommDataModel();
        TestUnit testUnit = new TestUnit();
        testUnit.setDataOne(new DataOne("aaa",1));
        commDataModel.setDataType(ResultDataType.TestCase);
        commDataModel.setData(testUnit);
        commDataModelArrayList.add(commDataModel);


        //insurance
        CommDataModel commDataModel1 = new CommDataModel();
        ArrayList<Insurance> insuranceArrayList = new ArrayList<Insurance>();
        for (int i = 0; i < 2; i++) {
            insuranceArrayList.add(new Insurance("insurancename" +i,i));
        }
        commDataModel1.setData(insuranceArrayList);
        commDataModel1.setDataType(ResultDataType.INSURANCE);
        commDataModelArrayList.add(commDataModel1);

        resultInfo.stopTimer();


        //data2
        ResultInfo resultInfo1 = new ResultInfo();
        resultInfo1.setSuccess(false);
        resultInfo1.setName("add order2");
        resultInfo1.setMsg("false result because do not get data");
        resultInfo1.setType(ResultType.AutomationType.Interface);
        resultInfo1.setTypeName(ResultType.AutomationType.InterfaceName);
        resultInfo1.setPlatform(ResultType.AutomationPlatform.Wireless);
        resultInfo1.setPlatformName(ResultType.AutomationPlatform.WirelessName);
        resultInfo1.setEndTime(System.currentTimeMillis());


        //set
        ResultInfoSet resultInfoSet = new ResultInfoSet();
        ArrayList<ResultInfo> resultInfoArrayList = new ArrayList<ResultInfo>();
        resultInfoArrayList.add(resultInfo);
        resultInfoArrayList.add(resultInfo1);
        resultInfoSet.setName("度假品类自动化测试");
        //resultInfoSet.setKey(UUID.randomUUID().toString());
        //resultInfoSet.setKey();
        resultInfoSet.setDepartmentID(123);
        resultInfoSet.setDepartmentName("在线预订测试组");
        resultInfoSet.setData(resultInfoArrayList);

        System.out.print("Set: " + ToolUtil.toJsonString(resultInfoSet));

    }

    /**
     * resolve result data
     */
    @Test
    public  void test4(){

    }


}
