import java.util.Arrays;

class Solution {

    public int lengthOfLIS(int[] nums) {

        int n= nums.length;
        int [] dp= new int [n];

        int max=0;
        for(int num : nums){
            int low=0, high=max;
            while(low<high){
                int mid= low+(high-low)/2;

                if(dp[mid]<num) low= mid+1;
                else high=mid;
            }
            dp[low]=num;
            if(low==max) max++;
        }
        return max;
    }
}