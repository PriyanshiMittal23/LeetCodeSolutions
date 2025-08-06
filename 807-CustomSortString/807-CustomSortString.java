// Last updated: 6/8/2025, 11:10:13 pm
class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:order.toCharArray()){
            if(hm.containsKey(ch)){
                String str=ch+"";
                ans.append(str.repeat(hm.get(ch)));
                hm.remove(ch);
            }
        }
        for(char ch:hm.keySet()){
            String str=ch+"";
            ans.append(str.repeat(hm.get(ch)));
        }
        return ans.toString();
    }
}