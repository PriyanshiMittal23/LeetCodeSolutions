// Last updated: 6/8/2025, 11:07:13 pm
class Solution {
    public String removeStars(String s) {
        return RS(s);
    }
    public static String RS(String s){
        Stack<Integer> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            ans=s.charAt(st.pop())+ans;
        }
        return ans;
    }
}