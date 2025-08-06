// Last updated: 6/8/2025, 11:13:06 pm
class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(int i=0;i<columnTitle.length();i++){
            int b=(int)(columnTitle.charAt(i)-'A')+1;
            n=n*26+b;
        }
        return n;
    }
}