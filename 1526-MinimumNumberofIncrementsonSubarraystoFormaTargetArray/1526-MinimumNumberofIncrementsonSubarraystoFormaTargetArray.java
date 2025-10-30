// Last updated: 30/10/2025, 10:52:02 pm
class Solution {
    public int minNumberOperations(int[] target) {
        int ans = 0;
        int i = 0;
        while(i<target.length-1 && target[i]<target[i+1]){
            i++;
        }
        ans+= target[i++];
        while(i<target.length){
            if(target[i]>target[i-1]){
                ans+= target[i]-target[i-1];
            }
            i++;
        }
        return ans;
    }
}