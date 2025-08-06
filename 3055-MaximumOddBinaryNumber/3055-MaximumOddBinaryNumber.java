// Last updated: 6/8/2025, 11:05:47 pm
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                o++;
            }
        }
        String sb="";
        for(int i=0;i<s.length()-1;i++){
            if(i<o-1){
                sb=sb+1;
            }
            else{
                sb=sb+0;
            }
        }
        sb=sb+1;
        return sb;
    }
}