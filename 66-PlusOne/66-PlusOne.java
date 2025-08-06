// Last updated: 6/8/2025, 11:14:29 pm
class Solution {
    public int[] plusOne(int[] digits) {
        int c=1;
        int i=digits.length-1;
        while(c==1 && i>=0){
            int k=digits[i];
            k++;
            c=k/10;
            digits[i]=k%10;
            i--;
        }
        if(c==1){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
        
    }
}