package com.raohui;

public class _49_StrToInt {
    public int StrToInt(String str) {
        int n = str.length();
        if(n <= 0){
            return 0;
        }
        long res = 0;
        for (int i = (str.charAt(0) == '+' || str.charAt(0) == '-')?1:0;i<n;i++){
            if(!(str.charAt(i) > '0'  && str.charAt(i) <= '9')){
                return 0;
            }else{
                res = res*10+(str.charAt(i)-'0');
            }
        }
        res = str.charAt(0) == '-'?-res:res;
        return (int) res;

    }
}
