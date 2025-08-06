// Last updated: 6/8/2025, 11:07:14 pm
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] sh = new int[s.length()];
        for(int[]a:shifts){
            int si=a[0];
            int ei=a[1];
            int d =a[2];
            int val = d == 0 ? -1 : 1;
            for(int i=si;i<=ei;i++){
                sh[i]+=val;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)+(sh[i]%26);
            // System.out.println(a+" "+sh[i]);
            if(a<97){
                a+=26;
            }else if(a>122){
                a-=26;
            }
            char ch = (char)(a);
            sb.append(ch);
        }
        return sb.toString();
    }
}