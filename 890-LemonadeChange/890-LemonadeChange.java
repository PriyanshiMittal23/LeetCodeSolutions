// Last updated: 6/8/2025, 11:10:08 pm
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int nf=0;
        int nt=0;
        for(int a:bills){
            if(a==5){
                nf++;
            }
            else if(a==10){
                if(nf==0){
                    return false;
                }
                nf--;
                nt++;
            }else{
                if(!(nf>=3 || (nf>=1 && nt>=1))){
                    return false;
                }
                if(nt!=0){
                    nt--;
                    nf--;
                }else{
                    nf-=3;
                }
            }
            
        }
        return true;
    }
}