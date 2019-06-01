package com.sys.utils;

import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.Converter;
public class DateConverter implements Converter {
    @Override
    public Object convert(Class type, Object value) {
        if(value == null) {
            return null;
        }

        if(!(value instanceof String)) {  //如果要转换的值不为String  就直接返回
            return value;
        }

        String val = (String)value; //将value强制转换为String

        //适应SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return sdf.parse(val);
        } catch (Exception e) {
            return new RuntimeException(e);
        }

    }
}
