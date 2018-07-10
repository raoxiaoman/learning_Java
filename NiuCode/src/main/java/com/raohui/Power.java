package com.raohui;

/**
 * 13 二进制 1101
 * 10^13 = 10^1101 = 10^1000*10^0100*10^0001 = 10^8*10^4*10^1 = 100000000^1 * 10000^1* 10^1
 */
public class Power {
    public double Power(double base, int exponent) {
        boolean isf = false;
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("分母为0");
            }
            exponent = -exponent;
            isf = true;
        }
        double result = 1.0;
        while (exponent != 0) {
            if((exponent & 1) == 1){
                result*=base;
            }
            base*=base; //累乘翻倍，注意：a^{2^7}=a^{2^6} * a^{2^6} ，而不是 a^{2^7}=a^{2^6} * a ，所以这是对的。
            exponent >>= 1;
        }
        return  isf?(1/result):result;
    }
}
