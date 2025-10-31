// Last updated: 31/10/2025, 10:06:53 pm
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                ans.add(i);
            }else{
                hs.add(i);
            }
        }
        int[] arr = new int[ans.size()];
        int idx=0;
        for(int i:ans){
            arr[idx++]=i;
        }
        return arr;
    }
}