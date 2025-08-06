// Last updated: 6/8/2025, 11:14:25 pm
class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        while(l<=h){
            int m=(l+h)/2;
            if(m==(x/m)){
            return m;
        }
        else if(m>(x/m)){
            h=m-1;
        }
        else{
            l=m+1;
        }
        }
        return h;
    }
}