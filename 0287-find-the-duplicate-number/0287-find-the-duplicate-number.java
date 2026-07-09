class Solution {
    public int findDuplicate(int[] nums) {
        boolean []  visited= new boolean[nums.length+1];
        
        for(int num : nums){
            if (visited[num]==true) return num;
            else visited[num]=true;
        }
        return 0;
    }
}