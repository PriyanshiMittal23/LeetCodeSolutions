// Last updated: 6/8/2025, 11:08:30 pm
class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int c=0;
        // Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
            if(s.charAt(i)==')'){
                ans=Math.max(ans,c);
                c--;
            }
        }
        return ans;
    }
}