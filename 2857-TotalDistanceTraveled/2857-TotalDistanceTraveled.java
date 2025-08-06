// Last updated: 6/8/2025, 11:05:52 pm
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans=0;
        while(mainTank!=0){
            if(mainTank<5){
                ans=ans+mainTank*10;
                return ans;
            }
            else{
                ans=ans+50;
                mainTank=mainTank-5;
                if(additionalTank>0){
                    mainTank++;
                    additionalTank--;
                }
            }
        }
        return ans;
    }
}