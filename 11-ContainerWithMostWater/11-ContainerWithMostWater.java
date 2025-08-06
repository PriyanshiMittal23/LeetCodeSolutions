// Last updated: 6/8/2025, 11:15:25 pm
class Solution {
    public int maxArea(int[] height) {
        return MaxA(height);
    }
    public static int MaxA(int[] arr){
        int a=0;
        int b=arr.length-1;
        int ans=0;
        while(a<b){
            int c=(b-a)*Math.min(arr[b],arr[a]);
            if(arr[a]<arr[b]){
                a++;
            }
            else{
                b--;
            }
            ans=Math.max(ans,c);

        }
        return ans;
    }
}