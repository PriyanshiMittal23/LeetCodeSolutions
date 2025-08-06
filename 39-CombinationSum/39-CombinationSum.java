// Last updated: 6/8/2025, 11:14:58 pm
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        CS(ans,candidates,target,l,0);
        return ans;
    }

    public List<List<Integer>> CS(List<List<Integer>>ans, int[]arr, int t,List<Integer>l, int i){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int a=i;a<arr.length;a++){
            if(arr[a]<=t){
                l.add(arr[a]);
                CS(ans,arr,t-arr[a],l,a);
                l.remove(l.size()-1);
            }
        }
        return ans;
    }
}