// Last updated: 6/8/2025, 11:05:00 pm
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int ans=0;
        for(int a:nums){
            if(hs.contains(a)){
                ans^=a;
            }
            hs.add(a);
        }
        return ans;
    }
}