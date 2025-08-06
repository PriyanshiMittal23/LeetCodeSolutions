// Last updated: 6/8/2025, 11:08:24 pm
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            hs.add(ch);
        }
        int ans=0;
        for(String str:words){
            for(char ch:str.toCharArray()){
                if(!hs.contains(ch)){
                    ans--;
                    break; 
                }
            }
            ans++;
        }
        return ans;
    }
}