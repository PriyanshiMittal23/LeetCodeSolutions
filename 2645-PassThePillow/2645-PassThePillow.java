// Last updated: 6/8/2025, 11:06:40 pm
class Solution {
    public int passThePillow(int n, int time) {
        int a=time/(n-1);
        int b=time%(n-1);
        int ans=0;
        if(a%2==0){
            ans=1+b;
        }
        else{
            ans=n-(b);
        }
        return ans;
    }
}