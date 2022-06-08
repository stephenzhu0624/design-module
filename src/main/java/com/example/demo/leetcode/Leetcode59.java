package com.example.demo.leetcode;

import java.util.*;

public class Leetcode59 {
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] q = new int[nums.length-1];;

            int j,max;
            for(int i =0;i<=nums.length-k;i++){
                j = 0;
                max = nums[i];
                while(j<k){

                    if(nums[i+j]>max){
                        max = nums[i+j];
                    }

                    j++;
                }
                q[i] = max;


            }
            return q;
        }


    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{1,3,-1,-3,5,3,6,7};
        s.maxSlidingWindow(a,3);
    }
}
