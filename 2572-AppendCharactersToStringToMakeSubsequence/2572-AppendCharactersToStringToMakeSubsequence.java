// Last updated: 6/8/2025, 11:06:58 pm
class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        int a=0;
        int b=0;
        while(a<s.length() && b<t.length()){
            if(s.charAt(a)==t.charAt(b)){
                b++;
            }
            a++;
        }
        return t.length()-b;
    }
}