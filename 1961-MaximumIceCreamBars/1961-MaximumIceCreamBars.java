// Last updated: 6/8/2025, 11:08:03 pm
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if((coins-=costs[i])<0){
                return i;
            }
        }
        return costs.length;
    }
}