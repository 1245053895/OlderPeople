package com.xh.controller.converter;

import org.springframework.core.convert.converter.Converter;

public class StringConvertor implements Converter<String, String>{

    @Override
    public String convert(String params) {
        //  abc
        return params.trim();
    }

}
