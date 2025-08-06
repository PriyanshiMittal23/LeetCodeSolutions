// Last updated: 6/8/2025, 11:11:33 pm
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> stb = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n=0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            }else if(ch=='['){
                st.push(n);
                stb.push(sb);
                sb = new StringBuilder();
                n=0;
            }else if(ch==']'){
                int k= st.pop();
                StringBuilder temp = sb;
                sb = stb.pop();
                for(int i=0;i<k;i++){
                    sb.append(temp);
                }
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}