// Last updated: 6/8/2025, 11:12:53 pm
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        while(n!=0){
            n=(n&(n-1));
            ans++;
        }
        return ans;
    }
}