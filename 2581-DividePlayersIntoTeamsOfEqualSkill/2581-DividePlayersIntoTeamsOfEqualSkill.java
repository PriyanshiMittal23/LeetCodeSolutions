// Last updated: 6/8/2025, 11:06:54 pm
class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        Arrays.sort(skill);
        int a =0;
        int b=skill.length-1;
        int m = skill[a]+skill[b];
        while(a<b){
            int c = skill[a]+skill[b];
            if(c!=m){
                return -1;
            }
            ans+=(skill[a]*skill[b]);
            a++;
            b--;
        }
        return ans;
    }
}