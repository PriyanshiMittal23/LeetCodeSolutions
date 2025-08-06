// Last updated: 6/8/2025, 11:14:56 pm
class Solution {
    public List<List<Integer>> combinationSum2(int[]candidates,int target) {
        ArrayList<Integer>l=new ArrayList<Integer>();
		List<List<Integer>>l2=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        return combinations(candidates,l,target,l2,0);
    }
    public static List<List<Integer>> combinations(int[]nums,List<Integer> l,int a,List<List<Integer>> l2,int b) {
		if(a==0) {
			l2.add(new ArrayList<>(l));
			return l2;
		}
		for(int i=b;i<nums.length;i++) {
			if(a>=nums[i]){
                if(i==b || nums[i]!=nums[i-1]) {
				l.add(nums[i]);
				combinations(nums,l,a-nums[i],l2,i+1);
				l.remove(l.size()-1);
                }
            }
		}
		return l2;
	}
}