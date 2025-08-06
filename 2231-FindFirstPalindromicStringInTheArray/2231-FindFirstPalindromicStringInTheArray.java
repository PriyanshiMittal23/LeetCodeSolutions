// Last updated: 6/8/2025, 11:07:36 pm
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(IsP(s)){
                return s;
            }
        }
        return "";
    }

    public static boolean IsP(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}