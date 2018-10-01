package com.raohui;

public class _53_isNumeric {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        //符号+整数部分+小数部分+eE部分+数字部分
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
}
