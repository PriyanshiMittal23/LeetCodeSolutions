// Last updated: 6/8/2025, 11:14:37 pm
class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int count =0;
        while(n>=0){
            if(s.charAt(n)!=' '){
                count++;
            }
            else{
                if(count>0){
                    return count;
                }
            }
            n--;
        }
        return count;
    }
}