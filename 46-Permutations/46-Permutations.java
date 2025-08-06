// Last updated: 6/8/2025, 11:14:52 pm
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer>list=new ArrayList<Integer>();
		List<List<Integer>>ans=new ArrayList<List<Integer>>();
        boolean[]arr=new boolean[nums.length];
        return(permutations(nums,list,ans,arr));
    }
    public static List<List<Integer>> permutations(int[]arr,List<Integer> list, List<List<Integer>>ans,boolean[]flag){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
			return ans;
        }
        for(int i=0;i<arr.length;i++){
            if(flag[i]==false){
                flag[i]=true;
                list.add(arr[i]);
                permutations(arr,list,ans,flag);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }
        return ans;
    }
}