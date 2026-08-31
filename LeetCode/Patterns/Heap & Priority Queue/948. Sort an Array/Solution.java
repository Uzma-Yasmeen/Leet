class Solution {
    public static void mergeSort(int[] nums,int start, int end)
    {
        if(start<end)
        {
            int mid = start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,end,mid);
        }
    }
    public static int[] merge(int nums[],int start,int end,int mid)
    {
        int n1 = mid-start+1;
        int n2 = end-mid;

        int leftarray[] = new int[n1];
        int rightarray[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            leftarray[i] = nums[start+i]; 
        }

        for(int i=0;i<n2;i++)
        {
            rightarray[i] = nums[mid+i+1];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(leftarray[i]<=rightarray[j])
            {
                nums[k]=leftarray[i];
                i++;
            }
            else
            {
                nums[k]=rightarray[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            nums[k]=leftarray[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            nums[k]=rightarray[j];
            j++;
            k++;
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length-1;
        mergeSort(nums,low,high);
        return nums;
    }
}