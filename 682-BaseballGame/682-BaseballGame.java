// Last updated: 6/8/2025, 11:10:31 pm
class Solution {
    public int calPoints(String[] operations) {
        return count(operations);
    }
    public static int count(String[] arr){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("C")){
                st.pop();
            }
            else if(arr[i].equals("D")){
                int a=st.peek();
                st.push(2*a);
            }
            else if(arr[i].equals("+")){
                int a=st.pop();
                int b=st.peek();
                int c=a+b;
                st.push(a);
                st.push(c);
            }
            else{
                int a=Integer.parseInt(arr[i]);
                st.push(a);
            }
        }
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
        return ans;
    }
}