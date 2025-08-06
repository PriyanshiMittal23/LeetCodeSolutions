// Last updated: 6/8/2025, 11:12:02 pm
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[]arr=new boolean[nums.length+1];
        for(int a:nums){
            if(arr[a]){
                return a;
            }
            else{
                arr[a]=true;
            }
        }
        return 0;
    }
}