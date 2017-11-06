package com.xh.controller.converter;

/**
 * Created by KAIRUN on 2017/11/6.
 */

import org.springframework.core.convert.converter.Converter;

import org.springframework.core.convert.converter.Converter;

public class StringConvertor implements Converter<String, String> {

    @Override
    public String convert(String params) {
        //  abc
        return params.trim();
    }

}
