// Last updated: 6/8/2025, 11:06:20 pm
class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String s:details){
            String a = s.substring(11,13);
            int age = Integer.parseInt(a);
            if(age>60){
                ans++;
            }
        }
        return ans;
    }
}