// Last updated: 6/8/2025, 11:14:04 pm
class Solution {
    public int largestRectangleArea(int[] heights) {
        return maxRec(heights);
    }

    public int maxRec(int[]arr){
        Stack<Integer>st =new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    int a=h*r;
                    ans=Math.max(a,ans);
                }
                else{
                    int l=st.peek();
                    int a=(r-l-1)*h;
                    ans=Math.max(ans,a);
                }

            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            // int r=i;
            if(st.isEmpty()){
                int a=h*r;
                ans=Math.max(a,ans);
            }
            else{
                int l=st.peek();
                int a=(r-l-1)*h;
                ans=Math.max(ans,a);
            }

        }
        return ans;

    }
}