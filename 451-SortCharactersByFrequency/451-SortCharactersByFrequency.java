// Last updated: 6/8/2025, 11:11:19 pm
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        List<Character>ll=new ArrayList(hm.keySet());
        Collections.sort(ll, (a,b)->(hm.get(b)-hm.get(a)));
        StringBuilder st = new StringBuilder();
        for(Object ch : ll){
            for(int i=1;i<=hm.get(ch);i++){
                st.append(ch);
            }
        }
        return st.toString();
    }
	
	
}