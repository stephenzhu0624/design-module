package com.example.demo.leetcode;

public class Leetcode58 {

    /**
     * 左旋转字符串
     */
    class Solution {
        public String reverseLeftWords(String s, int n) {
            if(s.isEmpty()){
                return "";
            }
            if(s.length()<n||n==0){
                return s;
            }
            String start = s.substring(0, n);
            String end = s.substring(n, s.length());
            return end+start;
        }
    }
}
