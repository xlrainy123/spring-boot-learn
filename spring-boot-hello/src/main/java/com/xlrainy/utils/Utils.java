package com.xlrainy.utils;
import org.springframework.stereotype.Service;

@Service
public class Utils {

    private int start = 0;
    private int maxLen = 0;
    public String longestPalindrome(String str){
        if (str == null || str.length() == 1) {
            return str;
        }
        for (int i = 0; i < str.length()-1; i++){
            handlerEven(str,i,i+1);  //偶数
            handlerEven(str,i,i);
        }
        return str.substring(start, maxLen-start);
    }

    public void handlerEven(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if (maxLen < right - left - 1){
            maxLen = right - left - 1;
            start = left+1;
        }
    }
}
