// Last updated: 6/8/2025, 11:06:23 pm
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int a=0;
        int ans=0;
        while(a<s.length()){
            int b=0;
            int c=0;
            while(a<s.length() && s.charAt(a)=='0' ){
                b++;
                a++;
            }
            while(a<s.length() && s.charAt(a)=='1'  ){
                c++;
                a++;
            }
            if(c<=b){
                ans=Math.max(ans,2*c);
            }
            else if(c>b){
                ans=Math.max(ans,2*b);
            }
        }
        return ans;
    }
}