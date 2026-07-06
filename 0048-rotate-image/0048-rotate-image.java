class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
    }
    public static void transpose(int [][] matrix){
        int n=matrix.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                swap(matrix,i,j);
            }
        }
        reverse(matrix);
    }
    public static void swap(int [][]matrix,int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public static void reverse(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
        int start=0;
        int end=matrix[i].length-1;
        while (start<end) {
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;
            end--;
        }
    }
    }
}