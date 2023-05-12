class Solution {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>0;j--){
                if(nums[i]+nums[j]==target && i!=j){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
}
