// Last updated: 6/8/2025, 11:12:56 pm
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        R(nums,0,nums.length-1);
        R(nums,0,k-1);
        R(nums,k,nums.length-1);
        
        
    }
    public static void R(int[]arr,int a,int b){
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}
