// Last updated: 3/11/2025, 10:02:41 pm
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int rs = neededTime[0];
        int m = neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                rs+=neededTime[i];
                m = Math.max(m, neededTime[i]);
            }else{
                if(m!=rs){
                    ans+= rs-m;
                }
                m=rs=neededTime[i];
            }
        }
        if(m!=rs){
            ans+= rs-m;
        }
        return ans;
    }
}