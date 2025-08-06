// Last updated: 6/8/2025, 11:08:13 pm
class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            char p=s.charAt(i);
            while(i<=j && s.charAt(i)==p){
                i++;
            }
            while(i<=j && s.charAt(j)==p){
                j--;
            }
        }
        return j-i+1;
    }
}