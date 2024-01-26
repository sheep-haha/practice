package com.zjh.practice;

public class a {

    public static void search(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }



    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,5,1};
        search(nums,1);
    }

}
