package com.monleylu;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lujian on 2017/11/8.
 */
public class ToolUtil {
    private static Gson gson = new Gson();

    public static String toJsonString(Object object){
        return  gson.toJson(object);
    }

    public static <T> T  fromJsonString(String src,Class<T> tClass){
        return gson.fromJson(src,tClass);
    }

    public static  Object decodeData(Object object,Class<?> tClass){
        if (object == null){
            return null;
        }
        if (object instanceof List){
            return fromJsonListObj((List<Object>)object,tClass);
        }else {
            return fromJsonObj(object,tClass);
        }
    }

    private static <T> T fromJsonObj(Object object,Class<T> tClass){
        if (object == null){
            return null;
        }
        try {
            String string = toJsonString(object);
            return fromJsonString(string,tClass);
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }

    }

    private static <T> List<T> fromJsonListObj(List<Object> object,Class<T> tClass){
        if (object == null){
            return null;
        }

        try {
            List<T> tmp = new ArrayList<T>();
            for (Object obj:object){
                tmp.add(fromJsonObj(obj,tClass));
            }
            return  tmp;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }
}
