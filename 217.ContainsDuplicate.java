class Solution {
    public boolean containsDuplicate(int[] nums) {
      /*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/
        
      /** this solution exceeded time limit so it was commented
        boolean answer = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j >= 0; j--){
                if(nums[i] == nums[j] && i != j){
                    answer = true;
                    break;
                }
            }
        }
        return answer;
        */
      
        //Add the elements of the array into the hashset if it's there return true'
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
