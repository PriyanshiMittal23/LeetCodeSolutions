// Last updated: 6/8/2025, 11:07:39 pm
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s:arr){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        
        int a=0;
        for(String s:arr){
            if(hm.get(s)==1){
                if(k==1){
                    return s;
                }
                k--;
            }
        }
        return "";
    }
}