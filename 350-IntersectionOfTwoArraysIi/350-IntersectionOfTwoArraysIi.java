// Last updated: 6/8/2025, 11:11:42 pm
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i:nums2 ){
            if(map.containsKey(i) && map.get(i)>0){
                l.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[]ans=new int[l.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}
