public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-2;++i)
        {
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1,k= nums.length-1;
            while(j<k)
            {
                if(nums[j]+nums[k]<-nums[i])
                {
                    ++j;
                }
                else if (nums[j]+nums[k]>-nums[i])
                {
                    --k;
                }
                else
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    ++j;
                    --k;
                    while(j<k&&nums[k]==nums[k+1]) --k;
                    while(j<k&&nums[j]==nums[j-1]) ++j;
                }
            }
        }
        return result;
    }


}
