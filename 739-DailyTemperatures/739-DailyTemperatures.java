// Last updated: 6/8/2025, 11:10:25 pm
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return temp(temperatures);
    }

    public static int[] temp(int[] t){
        Stack<Integer> st = new Stack<>();
        int[]ans = new int[t.length];
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int a = st.pop();
                ans[a] = i-a;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}