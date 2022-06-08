package com.example.demo.leetcode;

/**
 * 回文串 abba，aba，abcdc,abacdcab
 *
 */
public class Leetcode5 {
    public String longestPalindrome(String s) {
        int length = 0;
        String  arr ="";
        if(s.length()==1){
            return s;
        }
        for(int i = 0;i<s.length();i++){
            for (int j = i + 1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    arr = length < j-i ? s.substring(i,j+1) : arr;
                    length = j - i;
                    break;
                }
            }
        }
        if(length == 0){
            return  s;
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        Leetcode5 l = new Leetcode5();
        String babad = l.longestPalindrome("ac");
        System.out.println(babad);

    }
}
