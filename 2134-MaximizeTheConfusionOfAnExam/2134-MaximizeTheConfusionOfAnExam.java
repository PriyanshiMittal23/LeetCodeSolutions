// Last updated: 6/8/2025, 11:07:42 pm
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxCA(answerKey,k,'T'),maxCA(answerKey,k,'F'));
    }
    public int maxCA(String str,int k,char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int a=0;
        while(ei<str.length()){
            if(str.charAt(ei)==ch){
                a++;
            }
            while(a>k){
                if(ch==str.charAt(si)){
                    a--;
                }
                si++;
            }

            ans=Math.max(ei-si+1,ans);
            ei++;
        }
        return ans;
    }
}