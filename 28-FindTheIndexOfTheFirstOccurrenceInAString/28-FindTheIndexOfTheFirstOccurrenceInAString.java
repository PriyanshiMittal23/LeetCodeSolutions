// Last updated: 6/8/2025, 11:15:05 pm
class Solution {
    public int strStr(String haystack, String needle) {
        int a=0;
        int b=haystack.length();
        int c=needle.length();
        for(int i=0;i<b;i++){
            if(haystack.charAt(i)==needle.charAt(a)){
                a++;
            }
            else{
                i=i-a;
                a=0;
                
            }
            if(a==c){
                return i-a+1;
            }
        }
        return -1;
    }
}