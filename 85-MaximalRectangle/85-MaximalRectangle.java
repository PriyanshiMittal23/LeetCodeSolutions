// Last updated: 11/1/2026, 3:38:04 pm
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        int[]arr=new int[matrix[0].length];
4        int n=matrix.length;
5        int ans=0;
6        for(int i=n-1;i>=0;i--){
7            for(int j=0;j<arr.length;j++){
8                if(matrix[i][j]=='1'){
9                    arr[j]=arr[j]+1;
10                }
11                else{
12                    arr[j]=0;
13                }
14            }
15            int a=maxArea(arr);
16            ans=Math.max(ans,a);
17        }
18        return ans;
19    }
20    public static int maxArea(int[]arr){
21        int ans=0;
22        Stack<Integer> st=new Stack<>();
23        for(int i=0;i<arr.length;i++){
24            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
25                int h=arr[st.pop()];
26                int r=i;
27                if(st.isEmpty()){
28                    ans=Math.max(ans,h*r);
29                }
30                else{
31                    int l=st.peek();
32                    ans=Math.max(ans,h*(r-l-1));
33                }
34            }
35            st.push(i);
36        }
37        int r=arr.length;
38        while(!st.isEmpty()){
39            int h=arr[st.pop()];
40            if(st.isEmpty()){
41                ans=Math.max(ans,h*r);
42            }
43            else{
44                int l=st.peek();
45                ans=Math.max(ans,h*(r-l-1));
46            }
47        }
48        return ans;
49    }
50}