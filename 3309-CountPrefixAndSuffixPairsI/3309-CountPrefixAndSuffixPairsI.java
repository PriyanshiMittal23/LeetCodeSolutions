// Last updated: 6/8/2025, 11:05:23 pm
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                 String s1=words[i];
                String s2=words[j];
                if(s2.length()>=s1.length() && s2.substring(0,s1.length()).compareTo(s1)==0 && s2.substring(s2.length()-s1.length()).compareTo(s1)==0){
                    c++;
                }
            }
        }
        return c;
    }
}