// Last updated: 6/8/2025, 11:11:14 pm
class Solution {
    public int hammingDistance(int x, int y) {
        int ans = (x^y);
        return countOnes(ans);
    }
    public int countOnes(int x){
        int ans = 0;
        while(x!=0){
            x = (x&(x-1));
            ans++;
        }
        return ans;
    }
}