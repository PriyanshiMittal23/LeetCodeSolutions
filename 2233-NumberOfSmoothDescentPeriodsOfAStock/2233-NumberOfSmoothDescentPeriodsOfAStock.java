// Last updated: 6/8/2025, 11:07:34 pm
class Solution {
    public long getDescentPeriods(int[] prices) {
        return stock(prices);
    }
    public static long stock(int[]arr){
        int a=1;
        long ans=1;
        int b=0;
        while(a<arr.length){
            if(arr[a]+1==arr[a-1]){
                ans+=a-b+1;
            }
            else{
                b=a;
                ans++;
            }
            a++;
        }
        return ans;
    }
}