// Last updated: 6/8/2025, 11:11:44 pm
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int a:nums1){
            hs.add(a);
        }
        for(int a:nums2){
            if(hs.contains(a)){
                al.add(a);
                hs.remove(a);
            }
        }
        int[]ans=new int[al.size()];
        int p=0;
        for(int a:al){
            ans[p++]=a;
        }
        return ans;
    }
}