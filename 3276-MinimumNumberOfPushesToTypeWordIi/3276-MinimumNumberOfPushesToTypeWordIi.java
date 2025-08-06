// Last updated: 6/8/2025, 11:05:26 pm
class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch: word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Integer> l = new ArrayList<>(hm.values());
        Collections.sort(l,Collections.reverseOrder());
        int press = 0;
        for(int i=0;i<l.size();i++){
            press += (i/8+1)*l.get(i);
        }
        return press;
    }
}