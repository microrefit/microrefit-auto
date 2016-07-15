package com.microrefit.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

	/**
     * @Desc 
     *      传入String，返回：{result:true,msg:msg}</br>
     *      传入Map<String, Object>，返回：原来对象，并增加{result:true}键值</br>
     *      其他则：返回{result:true,data:object}
     * @author 张秋扬
     * @date 2016年6月16日 下午8:01:56
     */
    @SuppressWarnings("unchecked")
    protected Map<String, Object> successJsonData(Object object) {
        boolean isMap = false;
        Map<String, Object> map;
        if (object instanceof Map<?, ?>) {
            map = (Map<String, Object>) object;
            isMap = true;
        } else {
            map = new HashMap<String, Object>();
        }
        map.put("result", true);
        if (!isMap) {
            if (object instanceof String) {
                map.put("msg", object);
            } else {
                map.put("data", object);
            }
        }
        return map;
    }
    
    /**
     * @Desc 返回     {result:false,msg:msg}
     * @author 张秋扬
     * @date 2016年6月16日 下午7:58:40
     */
    protected Map<String, Object> failureJsonData(String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("result", false);
        map.put("msg", msg);
        return map;
    }
}
