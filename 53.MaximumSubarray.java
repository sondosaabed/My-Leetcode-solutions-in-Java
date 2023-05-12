class Solution {
    /* Given an integer array nums, find the subarray with the largest sum, and return its sum.    */
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums,0,nums.length-1);
    }

    private int maxSubArray(int[] nums, int lower, int upper){
        //If the array is null
        if(lower>upper){
            return Integer.MIN_VALUE;
        }
        //the array contains one elemet return it
        if(lower==upper){
            return nums[lower];
        }

        int mid= (lower+upper)/2;
        
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;

        int sum=0;
        /*for(int i=lower;i<=mid;i++){
            sum=sum+nums[i];
            maxLeft=Math.max(maxLeft,sum);
        }*/
        for (int i = mid ; i >= lower; i--) {
            sum += nums[i];
            maxLeft = Math.max(maxLeft, sum);
        }

        sum=0;
        for(int i=mid+1;i<=upper;i++){
            sum=sum+nums[i];
            maxRight=Math.max(maxRight,sum);
        }

        //find max to lfet
        int maxL=maxSubArray(nums,lower,mid);
        int maxR=maxSubArray(nums,mid+1,upper);

        return Math.max((maxLeft+maxRight),Math.max(maxL,maxR));
    }
}
