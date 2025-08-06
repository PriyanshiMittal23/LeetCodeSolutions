// Last updated: 6/8/2025, 11:10:44 pm
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length-1;
        if(k+1==1){
            if((n>1) || (n==1 && flowerbed[0]==1)){
                return false;
            }
            else{
                return true;
            }
        }
        if(n!=0 && flowerbed[0]==0 && flowerbed[1]!=1){
            n=n-1;
            flowerbed[0]=1;
        }
        for(int i=1;i<k;i++){
            if(n==0){
                break;
            }
            if(flowerbed[i-1]!=1 && flowerbed[i]==0 && flowerbed[i+1]!=1){
                n=n-1;
                flowerbed[i]=1;
            }
        }
        if(n!=0 && flowerbed[k]==0 && flowerbed[k-1]==0){
            n=n-1;
        }
        if(n==0){
            return true;
        }
        return false;
    }
}