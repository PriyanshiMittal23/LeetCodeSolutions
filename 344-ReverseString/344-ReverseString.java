// Last updated: 6/8/2025, 11:11:45 pm
class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        while(a<b){
            char ch=s[a];
            s[a]=s[b];
            s[b]=ch;
            a++;
            b--;
        }
        
    }
}