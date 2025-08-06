// Last updated: 6/8/2025, 11:11:01 pm
class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(int i=1;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0)) && c==word.length()-1){
            return true;
        }
        return false;
    }
}