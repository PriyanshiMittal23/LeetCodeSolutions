// Last updated: 6/8/2025, 11:04:54 pm
class Solution {
    public int minimumLength(String s) {
        int[]arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int ans=0;
        for(int a:arr){
            if(a==0){
                continue;
            }
            if(a%2==0){
                ans+=2;
            }else{
                ans++;
            }
        }
        return ans;
    }
}