// Last updated: 6/8/2025, 11:09:03 pm
class Solution {
    public String minRemoveToMakeValid(String s) {
        int c=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                c++;
                ans+='(';
            }
            else if(ch==')'){
                if(c>0){
                    ans+=')';
                    c--;
                }
            }
            else{
                ans+=ch;
            }
        }
        for(int i=ans.length()-1;i>=0 && c>0;i--){
            if(ans.charAt(i)=='('){
                ans=ans.substring(0,i)+ans.substring(i+1);
                c--;
            }
        }
        return ans;
    }
}