// Last updated: 6/8/2025, 11:13:09 pm
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]ans=new int[2];
        int a=0;
        int b=numbers.length-1;
        while(a<b){
            int c= numbers[a]+numbers[b];
            if(c==target){
                ans[0]=a+1;
                ans[1]=b+1;
                return ans;
            }
            else if(c<target){
                a++;
            }
            else{
                b--;
            }
        }
        return ans;
    }
}