// Last updated: 6/8/2025, 11:08:10 pm
class Solution {
    public String mergeAlternately(String word1, String word2) {
        return Merge(word1,word2);
    }
    public static String Merge(String w,String t){
        int a=0;
        int b=0;
        String ans="";
        while(a<w.length() && b<t.length()){
            ans=ans+w.charAt(a)+t.charAt(b);
            a++;
            b++;
        }
        if(a<w.length()){
            ans=ans+w.substring(a);
        }
        if(b<t.length()){
            ans=ans+t.substring(b);
        }
        return ans;
    }
}