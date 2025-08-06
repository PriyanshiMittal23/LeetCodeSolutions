// Last updated: 6/8/2025, 11:04:48 pm
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans=0;
        for(String s:commands){
            if(s.compareTo("RIGHT")==0){
                // j++;
                ans++;
            }
            else if(s.compareTo("LEFT")==0){
                // j--;
                ans--;
            }
            else if(s.compareTo("UP")==0){
                // i++;
                ans-=n;
            }
            else{
                ans+=n;
            }
            
        }
        return ans;
    }
}