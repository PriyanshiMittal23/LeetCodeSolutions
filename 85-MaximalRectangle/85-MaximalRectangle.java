// Last updated: 6/8/2025, 11:14:07 pm
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[]arr=new int[matrix[0].length];
        int n=matrix.length;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(matrix[i][j]=='1'){
                    arr[j]=arr[j]+1;
                }
                else{
                    arr[j]=0;
                }
            }
            int a=maxArea(arr);
            ans=Math.max(ans,a);
        }
        return ans;
    }
    public static int maxArea(int[]arr){
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                ans=Math.max(ans,h*r);
            }
            else{
                int l=st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
        }
        return ans;
    }
}