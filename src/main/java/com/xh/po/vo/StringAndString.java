package com.xh.po.vo;

public class StringAndString {
    private String sqlString;

    public String getSqlString() {
        return sqlString;
    }

    @Override
    public String toString() {
        return "StringAndString{" +
                "sqlString='" + sqlString + '\'' +
                '}';
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString;

    }
}
