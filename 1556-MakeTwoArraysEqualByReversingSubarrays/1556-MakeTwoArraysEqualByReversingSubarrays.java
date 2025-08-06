// Last updated: 6/8/2025, 11:08:50 pm
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[]fa=new int[1001];
        int[]ft=new int[1001];
        for(int i=0;i<arr.length;i++){
            fa[arr[i]]++;
            ft[target[i]]++;
        }
        for(int a:target){
            if(fa[a]!=ft[a]){
                return false;
            }
        }
        return true;
    }
}