// Last updated: 6/8/2025, 11:06:50 pm
class Solution {
    public int smallestValue(int n) {
        int ans = n;
        while(ans!=primesum(n)){
            n=primesum(n);
            ans=n;
        }
        return ans;
    }

    public int primesum(int n){
        int ans = 0;
        int i=2;
        while(i<=n && n>0){
            if(n%i==0){
                n=n/i;
                ans+=i;
            }else{
                i++;
            }
        }
        return ans;
    }
}