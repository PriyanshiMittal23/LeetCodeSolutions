// Last updated: 6/8/2025, 11:11:23 pm
class Solution {
    public int compress(char[] chars) {
        int a=0;
        int b=1;
        String s="";
        while(b<chars.length){
            if(chars[a]==chars[b]){
                b++;
            }
            else{
                s=s+chars[a];
                if((b-a)!=1){
                    s=s+(b-a);
                }
                a=b;
                b++;
            }
        }
        s=s+chars[a];
        if(b-a!=1){
            s=s+(b-a);
        }
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}