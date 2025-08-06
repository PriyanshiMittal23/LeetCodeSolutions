// Last updated: 6/8/2025, 11:11:17 pm
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        int ans=1;
        int p=0;
        for(int i=1;i<points.length;i++){
            if(points[i][0] > points[p][1]){
                ans++;
                p=i;
            }
        }
        return ans;
    }
}