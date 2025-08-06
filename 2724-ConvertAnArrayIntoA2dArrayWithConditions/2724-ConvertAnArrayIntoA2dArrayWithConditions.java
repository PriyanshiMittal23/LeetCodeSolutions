// Last updated: 6/8/2025, 11:06:21 pm
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] f = new int[nums.length+1];
        List<List<Integer>> list = new ArrayList<>();
        for(int a:nums){
            if(f[a]>=list.size()){
                list.add(new ArrayList<Integer>());
            }
            list.get(f[a]).add(a);
            f[a]++;
        }
        return list;
    }
}