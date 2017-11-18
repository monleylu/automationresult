package com.monleylu.automationresult;

import com.monleylu.ToolUtil;
import com.monleylu.automationresult.model.CommDataModel;
import com.monleylu.automationresult.model.ResultInfo;

import java.util.HashMap;

/**
 * Created by lujian on 2017/11/8.
 */
public class ResultResolveMap {

    //store datatype - class map result
    private HashMap<String,Class> rules;

    /**
     * resolve single result data
     * @param string
     * @return
     */
    public ResultInfo resolveSingleResultInfoData(String string){
        ResultInfo resultInfo = ToolUtil.fromJsonString(string,ResultInfo.class);
        
        if (getRules()==null || getRules().isEmpty()){
            return resultInfo;
        }
        for (int i=0;i<resultInfo.getData().size();i++){
            CommDataModel commDataModel = resultInfo.getData().get(i);
            Class tclass =getRules().get(commDataModel.getDataType());
            if (tclass !=null){
                commDataModel.setData(ToolUtil.decodeData(commDataModel.getData(),tclass));
            }else{
                System.err.println("can not match datatype: " + commDataModel.getDataType());
            }
        }
        return resultInfo;
    }



    public HashMap<String, Class> getRules() {
        return rules;
    }

    public void setRules(HashMap<String, Class> rules) {
        this.rules = rules;
    }
}
