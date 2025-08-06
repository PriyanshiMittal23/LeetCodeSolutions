// Last updated: 6/8/2025, 11:08:38 pm
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]-mid-1<k){
                start=mid+1;
            }
            else{
                end=end-1;
            }
        }
        return start+k;
    }
}