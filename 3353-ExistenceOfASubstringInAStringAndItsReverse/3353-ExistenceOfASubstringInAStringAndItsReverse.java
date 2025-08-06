// Last updated: 6/8/2025, 11:05:11 pm
class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0;i<s.length()-1;i++){
            String str=s.substring(i,i+2);
            String rev=new StringBuilder(str).reverse().toString();
            if(s.contains(rev)){
                return true;
            }
        }
        return false;
    }
}