// Last updated: 6/8/2025, 11:07:33 pm
class Solution {
    public int minimumCost(int[] cost) {
        int c = 0;
        Arrays.sort(cost);
        int i = cost.length-1;
        while(i-2>=0){
            c+= cost[i]+cost[i-1];
            i-=3;
        }
        while(i>=0){
            c+=cost[i];
            i--;
        }
        return c;
    }
}