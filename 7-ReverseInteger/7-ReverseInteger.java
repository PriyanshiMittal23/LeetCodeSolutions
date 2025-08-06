// Last updated: 6/8/2025, 11:15:28 pm
class Solution {
    public int reverse(int x) {
        long ans=0;
        while(x!=0){
            int r=x%10;
            x=x/10;
            ans=(long)(ans*10 +r);
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            ans=0;
        }
        return (int)(ans);
    }
}