// Last updated: 6/8/2025, 11:09:12 pm
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(new Pair(1,ch));
                continue;
            }

            if(st.peek().ch==ch){
                Pair p = st.pop();
                p.f=p.f+1;
                if(p.f!=k){
                    st.push(p);
                }
            }else{
                st.push(new Pair(1,ch));
            }
        }

        StringBuilder sb = new StringBuilder();
        int l = st.size();
        for(int i=0;i<l;i++){
            int fr = st.peek().f;
            char c = st.pop().ch;
            for(int j=0;j<fr;j++){
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }

    public class Pair{
        int f;
        char ch;

        Pair(int f, char ch){
            this.f=f;
            this.ch=ch;
        }
    }
}