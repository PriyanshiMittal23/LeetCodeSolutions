// Last updated: 6/8/2025, 11:06:59 pm
class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int lo=1;
        int hi=n+1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            int ls=(mid-1)*mid/2;
            int rs=sum-(mid+1)*mid/2;
            if(ls<rs){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        return (lo - 1) * lo / 2 == sum - lo * (lo + 1) / 2 ? lo : -1;
    }
}