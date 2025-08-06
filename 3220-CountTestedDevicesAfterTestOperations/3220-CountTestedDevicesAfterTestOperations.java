// Last updated: 6/8/2025, 11:05:37 pm
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans=0;
        for(int i:batteryPercentages){
            if(i-ans>0){
                ans++;
            }
        }
        return ans;
    }
}