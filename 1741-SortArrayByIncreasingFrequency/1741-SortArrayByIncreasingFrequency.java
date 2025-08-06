// Last updated: 6/8/2025, 11:08:28 pm
class Solution { 
    public int[] frequencySort(int[] nums) { 
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        for(int a:nums){ 
            hm.put(a,hm.getOrDefault(a,0)+1); 
        } 
        List<Integer> list = new ArrayList<>(hm.keySet()); 
        Collections.sort(list, (a, b) -> { return (hm.get(a) == hm.get(b))? b - a : hm.get(a) - hm.get(b); }); 
        int [] arr = new int[nums.length]; int i=0; 
        for(int l : list){ 
            for(int j=0;j<hm.get(l);j++){ 
                arr[i]=l; i++; 
            } 
        } 
        return arr; 
    } 
}