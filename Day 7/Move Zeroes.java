class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
    for(int j=0;j<nums.length;j++)
    {
        if(nums[j]!=0)
        {
            nums[i]=nums[j];
            i++;
        }
        if(nums[j]==0)
        {
            count++;
        }
    }
     for( int k=0;k<count;k++)
     {
             nums[i]=0;
             i++;
     }   
    }
}
