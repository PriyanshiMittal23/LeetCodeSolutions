// Last updated: 6/8/2025, 11:08:52 pm
class Solution {
    public int maxScore(String s) {
        int a=0;
        int b=0;
        int ans=0;
        if(s.charAt(0)=='0'){
            a++;
        }
        for(int j=1;j<s.length()-1;j++){
            for(int i=j;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    b=b+1;
                }
            }
            ans=Math.max(ans,a+b);
            if(s.charAt(j)=='0'){
                a++;
            }
            b=0;
        }
        if(s.charAt(s.length()-1)=='1'){
            b++;
        }
        return Math.max(ans,a+b);
    }


} 