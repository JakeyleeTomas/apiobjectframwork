package com.apiobject.framwork.global;

import java.util.HashMap;

/**
 * @author guji
 * @description 用来存储全局变量
 * @date 2021/1/4 18:54
 */
public class GlobalVariable {
    static private HashMap<String,String> globalVariables =  new HashMap<>();

    public static HashMap<String, String> getGlobalVariables() {
        return globalVariables;
    }

    public static void setGlobalVariables(HashMap<String, String> globalVariables) {
        GlobalVariable.globalVariables = globalVariables;
    }
}
