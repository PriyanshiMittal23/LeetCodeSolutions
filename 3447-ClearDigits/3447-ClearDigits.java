// Last updated: 6/8/2025, 11:04:59 pm
class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        String ans = "";
        for(char ch: s.toCharArray()){
            if(ch>='0' && ch<='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans= st.pop()+ans;
        }
        return ans;
    }
}