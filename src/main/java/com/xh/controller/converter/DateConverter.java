package com.xh.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    Date date  = null;
    public Date convert(String param) {
        Date date  = null;
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = simpleDateFormat.parse(param);
        }catch(Exception e){
            e.printStackTrace();
        }
        return date;
    }
}
