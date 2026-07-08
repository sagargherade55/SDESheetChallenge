class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        int start=0;
        int end=0;

        int [] result= new int[m+n];
        while (start<m && end<n) {
            
            if (nums1[start]<=nums2[end]) {
                result[index++]=nums1[start++];
            }else{
                result[index++]=nums2[end++];
            }
        }
        while (start<m) {
            result[index++]=nums1[start++];
        }
        while (end<n) {
            result[index++]=nums2[end++];
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}