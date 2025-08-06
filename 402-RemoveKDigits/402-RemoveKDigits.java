// Last updated: 6/8/2025, 11:11:29 pm
class Solution {
    public String removeKdigits(String num, int k) {
        String sb="";
        if(num.length()<=k){
            return "0";
        }
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && num.charAt(i)<st.peek() && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb=st.pop()+sb;
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb=sb.substring(1);
        }
        return sb;
    }
}