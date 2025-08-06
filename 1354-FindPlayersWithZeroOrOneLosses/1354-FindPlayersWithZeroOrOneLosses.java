// Last updated: 6/8/2025, 11:09:06 pm
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int [] a : matches){
            int w = a[0];
            int l = a[1];
            if(!map.containsKey(w)){
                map.put(w,0);
            }
            if(!map.containsKey(l)){
                map.put(l,-1);
            }
            else{
                map.put(l,map.get(l)-1);
            }
        }
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int i : map.keySet()){
            if(map.get(i)==0){
                ans.get(0).add(i);
            }
            else if(map.get(i)==-1){
                ans.get(1).add(i);
            }
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}