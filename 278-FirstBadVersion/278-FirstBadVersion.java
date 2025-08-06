// Last updated: 6/8/2025, 11:12:06 pm
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int h=n;
        int l=1;
       
        int r=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isBadVersion(m)==true){
                r=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return r;
        
    }
}