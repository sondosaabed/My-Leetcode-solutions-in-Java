class Solution {
    public int maximumWealth(int[][] accounts) {
        /*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
          A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.*/
        int maxWealthSoFar=0;
        for(int[] customer: accounts){
            int currentWealth=0;
            for(int bank: customer){
                currentWealth=currentWealth+bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentWealth);
        }
        return maxWealthSoFar;
    }
}
