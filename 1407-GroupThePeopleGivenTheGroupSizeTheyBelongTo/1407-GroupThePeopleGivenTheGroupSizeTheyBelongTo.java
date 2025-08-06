// Last updated: 6/8/2025, 11:09:00 pm
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>>hm=new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
            int s=groupSizes[i];
            hm.putIfAbsent(s, new ArrayList<>());
            hm.get(s).add(i);
            if(hm.get(s).size()==s){
                ans.add(new ArrayList<>(hm.get(s)));
                hm.get(s).clear();
            }
        }
        return ans;
    }
}