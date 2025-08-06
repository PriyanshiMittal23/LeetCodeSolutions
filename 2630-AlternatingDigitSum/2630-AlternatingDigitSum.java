// Last updated: 6/8/2025, 11:06:43 pm
class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i%2==0){
                sum=sum+(c-'0');
            }
            else{
                sum=sum-(c-'0');
            }
        }
        return sum;
    }
}