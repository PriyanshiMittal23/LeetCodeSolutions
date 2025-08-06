// Last updated: 6/8/2025, 11:13:07 pm
class Solution {
    public String convertToTitle(int columnNumber) {
        String a="";
        while(columnNumber>0){
            columnNumber--;
            a=(char)('A'+ columnNumber%26)+a;
            columnNumber/=26;
        }
        return a;
    }
}