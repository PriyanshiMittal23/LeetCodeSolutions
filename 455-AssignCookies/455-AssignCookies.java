// Last updated: 6/8/2025, 11:11:16 pm
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int si = 0;
        int gi = 0;
        int c = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(si<s.length && gi<g.length){
            if(s[si]>=g[gi]){
                c++;
                gi++;
            }
            si++;
        }
        return c;
    }
}