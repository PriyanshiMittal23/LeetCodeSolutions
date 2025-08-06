// Last updated: 6/8/2025, 11:13:35 pm
class Solution {
    public boolean isPalindrome(String s) {
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if(s.charAt(a)==s.charAt(b) || Character.toLowerCase(s.charAt(a))==Character.toLowerCase(s.charAt(b))){
                a++;
                b--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(a))){
                a++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(b))){
                b--;
            }else{
                return false;
            }
        }
        return true;
    }
}