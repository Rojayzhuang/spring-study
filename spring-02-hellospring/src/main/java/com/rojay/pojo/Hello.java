package com.rojay.pojo;

/**
 * @author Rojay
 * @version 1.0.0
 * @createTime 2020年12月18日  15:00:54
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public void show() {
        System.out.println("Hello" + str);
    }
}
