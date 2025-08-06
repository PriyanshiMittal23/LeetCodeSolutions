// Last updated: 6/8/2025, 11:06:56 pm
class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch==' ' && sentence.charAt(i-1)!=sentence.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}