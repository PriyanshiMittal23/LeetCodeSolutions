// Last updated: 6/8/2025, 11:09:14 pm
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a: arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int a : map.keySet()){
            if(!hs.contains(map.get(a))){
                hs.add(map.get(a));
            }
            else{
                return false;
            }
        }
        return true;

    }
}