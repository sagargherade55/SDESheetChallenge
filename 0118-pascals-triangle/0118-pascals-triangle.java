class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();

        for(int i=1; i<=numRows; i++){
            List<Integer> temp=generateRow(i);
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer> generateRow(int row){
        List<Integer> rows= new ArrayList<>();
        int ans=1;
        rows.add(ans);

        for(int col=1; col<row; col++){
            ans=ans*(row-col);
            ans=ans/(col);
            rows.add(ans);
        }
        return rows;
    }
}