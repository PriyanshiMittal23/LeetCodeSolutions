// Last updated: 6/8/2025, 11:06:00 pm
class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        while(i>0 && num.charAt(i)=='0'){
            i--;
        }
        num=num.substring(0,i+1);
        return num;
    }
}