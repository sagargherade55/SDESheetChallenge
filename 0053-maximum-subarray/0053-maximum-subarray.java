class Solution {
    public int maxSubArray(int[] nums) {
        long max=Long.MIN_VALUE;

        long sum=Integer.MIN_VALUE;

        for(int num : nums){
            // sum+=nums[i];
            if(sum<=0) sum=num;
            else sum+=num;

            max= sum<max?max:sum;
        }
        return (int) max;
    }
}