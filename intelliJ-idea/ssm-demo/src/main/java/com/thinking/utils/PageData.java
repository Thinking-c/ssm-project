package com.thinking.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/6/22
 */
public class PageData extends HashMap implements Map {

    private Map mapParam = null;
    private HttpServletRequest request;

    /**
     * get page data
     *
     * @param request
     */
    public PageData(HttpServletRequest request) {
        this.request = request;

        Map returnMap = new HashMap();

        Map properties = request.getParameterMap();
        Iterator iterator = properties.entrySet().iterator();
        String key = "";
        String value = "";
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            key = (String) entry.getKey();
            Object entryValue = entry.getValue();
            if (null == entryValue) {
                value = "";
            } else if (entryValue instanceof String[]) {
                String[] values = (String[]) entryValue;
                for (int i = 0; i < values.length; i++) {
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = entryValue.toString();
            }
            returnMap.put(key, value);
        }
        mapParam = returnMap;
    }

    /**
     * get new hashMap
     */
    public PageData() {
        mapParam = new HashMap();
    }

    @Override
    public Object get(Object key) {
        Object obj = null;
        if (mapParam.get(key) instanceof Object[]) {
            Object[] arr = (Object[]) mapParam.get(key);
            obj = request == null ? arr : (request.getParameter((String) key) == null ? arr : arr[0]);
        } else {
            obj = mapParam.get(key);
        }
        return obj;
    }

    public String getString(Object key){
        return (String) get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return mapParam.put(key, value);
    }

    @Override
    public void clear() {
        mapParam.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return mapParam.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return mapParam.containsValue(value);
    }

    @Override
    public Set<Entry> entrySet() {
        return mapParam.entrySet();
    }

    @Override
    public boolean isEmpty() {
        return mapParam.isEmpty();
    }

    @Override
    public Set keySet() {
        return mapParam.keySet();
    }

    @Override
    public int size() {
        return mapParam.size();
    }

    @Override
    public void putAll(Map m) {
        mapParam.putAll(m);
    }

    @Override
    public Collection values() {
        return mapParam.values();
    }
}
