// Last updated: 6/8/2025, 11:06:30 pm
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[]ps = new int[words.length];
        int c=0;
        int idx=0;
        for(String s: words){
            if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1))){
                ps[idx++] = ++c;
            }else{
                ps[idx++] = c;
            }
        }

        int[]ans = new int[queries.length];
        for(int i=0;i<ans.length;i++){
            int r = queries[i][1];
            int l = queries[i][0];
            ans[i]= ps[r];
            if(l!=0){
                ans[i]-=ps[l-1];
            }
        }
        return ans;
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}