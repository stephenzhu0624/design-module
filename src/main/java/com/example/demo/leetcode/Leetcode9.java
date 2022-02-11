package com.example.demo.leetcode;

public class Leetcode9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(x));
        String s = stringBuffer.toString();
        StringBuffer reverse = stringBuffer.reverse();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode9 leetcode9 =new Leetcode9();
        leetcode9.isPalindrome(10);
    }
}
