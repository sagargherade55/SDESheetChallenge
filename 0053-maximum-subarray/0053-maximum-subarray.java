class Solution {
    public int maxSubArray(int[] nums) {
        long max=Long.MIN_VALUE;

        long sum=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            // sum+=nums[i];
            if(sum<=0) sum=nums[i];
            else sum+=nums[i];

            max= sum<max?max:sum;
        }
        return (int) max;
    }
}