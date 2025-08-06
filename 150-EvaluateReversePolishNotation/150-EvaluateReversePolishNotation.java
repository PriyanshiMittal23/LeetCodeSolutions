// Last updated: 6/8/2025, 11:13:15 pm
class Solution {
    public int evalRPN(String[] tokens) {
        return evaluate(tokens);
    }
    public static int evaluate(String [] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(a*b);
            }
            else if(arr[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
            else if(arr[i].equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(arr[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        return st.peek();
    }
}