// Last updated: 6/8/2025, 11:06:08 pm
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int one = 0;
        for(int a:derived){
            one+=a;
        }

        return one%2==0?true:false;
    }
}