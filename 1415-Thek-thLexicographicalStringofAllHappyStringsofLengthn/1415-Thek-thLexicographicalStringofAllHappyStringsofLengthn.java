// Last updated: 14/3/2026, 3:58:04 pm
1class Solution {
2    public String getHappyString(int n, int k) {
3        ArrayList<String> ans = new ArrayList<>();
4        char[]arr = {'a', 'b', 'c'};
5        Happy("",4, arr, ans,n);
6        return k>ans.size()?"":ans.get(k-1);
7    }
8
9    public void Happy(String s, int idx, char[]arr, ArrayList<String> ans, int n){
10        if(s.length()==n){
11            ans.add(s);
12            return;
13        }
14
15        for(int i=0;i<3;i++){
16            if(i!=idx){
17                Happy(s+arr[i], i, arr, ans, n);
18            }
19        }
20    }
21}