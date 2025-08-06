// Last updated: 6/8/2025, 11:07:16 pm
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                w++;
            }
        }
        ans=w;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W' && blocks.charAt(i-k)=='B'){
                w++;
            }else if(blocks.charAt(i)=='B' && blocks.charAt(i-k)=='W'){
                w--;
            }
            ans = Math.min(w,ans);
        }
        return ans;
    }
}