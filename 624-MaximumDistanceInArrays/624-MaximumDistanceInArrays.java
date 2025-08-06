// Last updated: 6/8/2025, 11:10:39 pm
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int ans = Integer.MIN_VALUE;

        for(int i=1;i<arrays.size();i++){
            int mi = arrays.get(i).get(0);
            int mxi = arrays.get(i).get(arrays.get(i).size()-1);
            ans = Math.max(ans, Math.abs(mxi-min));
            ans = Math.max(ans, Math.abs(max-mi));
            min = Math.min(min,mi);
            max = Math.max(max,mxi);
        }
        return ans;
    }
}