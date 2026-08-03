class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0,j=nums.length-1;
        for(int k =0;k<nums.length;k++)
        {
            if(nums[i]+nums[j]==target) return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]<target) 
            {
                i++;
            }
            else if(nums[i]+nums[j]>target)
            {
                j--;
            }
        }
        return new int[]{};
    }
}