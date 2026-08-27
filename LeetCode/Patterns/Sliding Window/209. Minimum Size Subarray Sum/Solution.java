class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int i =0;
        int minlen = Integer.MAX_VALUE;
        for(int j =0;j<nums.length;j++)
        {
            sum += nums[j];
            while(sum>=target)
            {
                if(minlen > j-i+1) minlen = j-i+1;;
                sum -= nums[i];
                i++;
            }
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;    
    }
}