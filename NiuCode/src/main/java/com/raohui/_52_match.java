package com.raohui;

public class _52_match {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null){
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str,strIndex,pattern,patternIndex);
    }

    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if(str.length == strIndex && pattern.length == patternIndex){
            return true;
        }
        if(str.length != strIndex && pattern.length == patternIndex){
            return false;
        }
        if(patternIndex+1 < pattern.length && pattern[patternIndex+1] =='*'){
            if((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (pattern[patternIndex] == '.' && strIndex !=str.length)){
                return matchCore(str,strIndex,pattern,patternIndex+2) || matchCore(str,strIndex+1,pattern,patternIndex) || matchCore(str,strIndex+1,pattern,patternIndex+2);

            }else{
                return matchCore(str,strIndex,pattern,patternIndex+2);
            }

        }
        if((strIndex != str.length && str[strIndex] == pattern[patternIndex])|| strIndex !=str.length && pattern[patternIndex] == '.'){
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }
}
