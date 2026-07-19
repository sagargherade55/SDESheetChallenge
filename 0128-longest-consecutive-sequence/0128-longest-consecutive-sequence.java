class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;
        int longest=0;
        Set<Integer> set= new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int current=num;
                int cnt=1;

                while(set.contains(current+1)){
                    current++;
                    cnt++;
                }
                longest= Math.max(cnt, longest);
            }
        }
        return longest;
    }
}