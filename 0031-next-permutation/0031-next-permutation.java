class Solution {
    public void nextPermutation(int[] nums) {
        int indx=-1;
        int n=nums.length-1;

        for(int i=n-1; i>=0; i--){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
        }

        if(indx==-1){
            reverse(nums, 0,n);
            return;
        }

        for(int i=n; i>indx; i--){
            if(nums[indx]<nums[i]){
                swap(nums, indx, i);
                break;
            }
        }

        reverse(nums, indx+1, n);
    }
    public void reverse(int [] nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public void swap(int [] nums, int indx, int i){
        int temp=nums[i];
        nums[i]=nums[indx];
        nums[indx]=temp;
    }
}