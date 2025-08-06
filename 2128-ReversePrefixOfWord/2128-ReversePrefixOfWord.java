// Last updated: 6/8/2025, 11:07:47 pm
class Solution {
    public String reversePrefix(String word, char ch) {
        int a= word.indexOf(ch);
        if(a==-1){
            return word;
        }
        else{
            StringBuilder sb=new StringBuilder();
            for(int i=a;i>=0;i--){
                sb.append(word.charAt(i));
                
            }
            String ans=sb.toString();
            ans=ans+word.substring(a+1);
            return ans;
        }
        
    }
}