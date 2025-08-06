// Last updated: 6/8/2025, 11:15:34 pm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int sol = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,i);
                sol++;
            }
            else{
                int c = map.get(a);
                while(l<=c){
                    map.remove(s.charAt(l));
                    l++;
                    sol--;
                }
                map.put(a,i);
                sol++;
            }
            ans = Math.max(sol,ans);
            
        }
        return ans;
    }
}