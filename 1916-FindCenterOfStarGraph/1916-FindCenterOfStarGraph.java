// Last updated: 6/8/2025, 11:08:07 pm
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        if(c==a || c==b){
            return c;
        }
        return edges[1][1];
    }
}