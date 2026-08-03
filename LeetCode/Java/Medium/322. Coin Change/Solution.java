class Solution {
    public int coinChange(int[] coins, int amount) {

       Arrays.sort(coins);
        int n = coins.length;
        int count = 0;

       for(int i=n-1;i>=0;i--)
       {
        
        if(amount>= coins[i])
        {
            count += (amount/coins[i]);
            amount = amount - coins[i]*(amount/coins[i]);
            
        }
        if(amount==0) return count;
       }
      
        return -1;
    }
}