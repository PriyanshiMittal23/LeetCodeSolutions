// Last updated: 6/8/2025, 11:06:35 pm
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans=0;
        while(left<=right){
            String str=words[left];
            char a=str.charAt(0);
            char b=str.charAt(str.length()-1);
            if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') &&(b=='a' || b=='e' || b=='i' || b=='o' || b=='u')){
                ans=ans+1;
            }
            left++;
        }
        return ans;
    }
}