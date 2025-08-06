// Last updated: 6/8/2025, 11:04:56 pm
class Solution {
    public String compressedString(String word) {
        int c=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<word.length();i++){
            if(c<9 && word.charAt(i)==word.charAt(i-1)){
                c++;
                continue;
            }
            else{
                sb.append(c);
                sb.append(word.charAt(i-1));
                c=1;
            }

        }
        sb.append(c);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}