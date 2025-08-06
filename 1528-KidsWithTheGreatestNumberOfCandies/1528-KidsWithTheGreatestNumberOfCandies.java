// Last updated: 6/8/2025, 11:08:55 pm
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return MaxCandy(candies,extraCandies);
    }
    public static List<Boolean> MaxCandy(int[]arr,int ec){
        List<Boolean> l=new ArrayList<>();
        int m=0;
        for(int c:arr){
            if(c>m){
                m=c;
            }
        }
        m=m-ec;
        for(int ans: arr){
            if(ans>=m){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}