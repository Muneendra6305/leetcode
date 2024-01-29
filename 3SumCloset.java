import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(start<end)
            {
                int result1=nums[i]+nums[start]+nums[end];
                if(target>result1)
                {
                    start+=1;
                }
                else{
                    end-=1;
                }
                if(Math.abs(result1-target)<Math.abs(result-target))
                {
                    result=result1;
                }
            }
        }
        return result;
    }
}
