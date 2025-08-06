// Last updated: 6/8/2025, 11:12:28 pm
class Solution {
    int i;
    public int calculate(String s) {
        i=0;
        return cal(s);
    }
    

    public int cal(String s){
        int n = 0;
        int ans=0;
        int si=1;
        while(i<s.length()){
            char ch = s.charAt(i++);
            if(ch>='0' && ch<='9'){
                n = n*10 + (ch-'0');
            }
            else if(ch=='('){
                n=cal(s);
            }
            else if(ch==')'){
                return ans+si*n;
            }
            else if(ch=='+' || ch=='-'){
                ans+=si*n;
                si= ch=='+'?1:-1;
                n=0;
            }

        }
        return ans+n*si;
    }
}