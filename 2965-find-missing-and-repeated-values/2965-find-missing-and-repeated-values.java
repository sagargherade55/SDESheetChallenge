class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int missing=-1, repeating=-1;
        int n= grid.length;

        Map<Integer, Integer> freq=  new HashMap<>();

        for(int [] row : grid){
            for(int num : row){
                freq.put(num, freq.getOrDefault(num, 0)+1);
            }
        }

        for(int i=0; i<=n*n; i++){
            if(!freq.containsKey(i)){
                missing=i;
            }else if(freq.get(i)==2){
                repeating=i;
            }
        }
        return new int []{repeating, missing};
    }
}