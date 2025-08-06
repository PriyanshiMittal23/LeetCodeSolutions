// Last updated: 6/8/2025, 11:09:17 pm
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int f = 1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==s.charAt(i-1)){
                f++;
            }else{
                f=1;
            }
            if(f<=2){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}