// Last updated: 6/8/2025, 11:06:02 pm
class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i)<s.charAt(j)){
                    s=s.substring(0,j)+s.charAt(i)+s.substring(j+1);
                }
                else{
                    s=s.substring(0,i)+s.charAt(j)+s.substring(i+1);
                }
            }
            i++;
            j--;
        }
        return s;
    }
}