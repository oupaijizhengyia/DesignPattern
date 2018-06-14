package com.company;

/**
 * FileName: SpecificEncrypt
 * Author: yeyang
 * Date: 2018/6/14 14:39
 */
public class SpecificEncrypt {
    public String MS5Encrypt(String s){
        byte[] bytes = s.getBytes();
        int a = bytes.length;
        int re = ((a << 2) + 5)*3 % 16;
        return re+"";
    }
}
