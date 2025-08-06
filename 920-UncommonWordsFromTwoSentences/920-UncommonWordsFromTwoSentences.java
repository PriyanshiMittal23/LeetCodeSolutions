// Last updated: 6/8/2025, 11:10:00 pm
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[]str1 = s1.split(" ");
        String[]str2 = s2.split(" ");
        for(String s:str1){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:str2){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String>ans=new ArrayList<>();
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            if(e.getValue()==1){
                ans.add(e.getKey());
            }
        }
        String[]a=new String[ans.size()];
        int i=0;
        for(String s:ans){
            a[i++]=s;
        }
        return a;
    }
}