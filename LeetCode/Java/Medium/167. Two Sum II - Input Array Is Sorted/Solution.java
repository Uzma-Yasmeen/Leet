class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0,j=1;
        for(int k =0;k<nums.length-1;k++)
        {
            if(nums[i]+nums[j]==target) return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]<target) i++;
            else j++;
        }
        return new int[]{};
    }
}