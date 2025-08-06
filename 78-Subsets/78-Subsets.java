// Last updated: 6/8/2025, 11:14:12 pm
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,list,ans,0);
        return ans;
    }
    public static void subset(int[]nums,List<Integer> list,List<List<Integer>> ans,int i){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        subset(nums,list,ans,i+1);
        list.add(nums[i]);
        subset(nums,list,ans,i+1);
        list.remove(list.size()-1);
    }
}