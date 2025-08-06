// Last updated: 6/8/2025, 11:04:53 pm
class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
        }
        return false;
    }
}