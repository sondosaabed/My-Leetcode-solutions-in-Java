class Solution {
    public int[] runningSum(int[] nums) {
       // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.
        
      int[] runingSum = new int[nums.length];
        int sumSoFar=0;
        for(int i=0;i<nums.length;i++){
            sumSoFar = sumSoFar+nums[i];
            if(i==nums.length){
                break; 
            }else if(i>0 && i<nums.length){
                runingSum[i]= sumSoFar;
            }else if (i==0){
                runingSum[i]=nums[i];   
            }
        }
        return runingSum;
    }
}
