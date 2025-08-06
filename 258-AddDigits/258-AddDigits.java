// Last updated: 6/8/2025, 11:12:14 pm
class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        String s=num+"";
        int ans=0;
        while(s.length()>1){
            ans=0;
            for(int i=0;i<s.length();i++){
                ans+=Integer.parseInt(s.charAt(i)+"");
            }
            s=ans+"";
        }
        return ans;
    }
}