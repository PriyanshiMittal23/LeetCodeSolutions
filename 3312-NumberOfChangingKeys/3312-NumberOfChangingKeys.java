// Last updated: 6/8/2025, 11:05:20 pm
class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            int n = (int)(s.charAt(i));
            int m = (int)s.charAt(i+1);
            if(n>=97){
                if(m!=n && m!=(n-32)){
                    c++;
                }
            }
            else{
                if(m!=n && m!=(n+32)){
                    c++;
                }
            }
        }
        return c;
        
    }
}