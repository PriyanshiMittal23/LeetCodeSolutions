// Last updated: 6/8/2025, 11:11:39 pm
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        ll= new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        suba(nums,0,1,l);
        return ll;
    }
    static int[]dp;
    static List<Integer> ll;
    public static void suba(int[]nums,int a,int p,List<Integer>l){
        if(a>=nums.length){
            if(l.size()>ll.size()){
                ll.clear();
                ll.addAll(l);
            }
            return;
        }

        if(l.size()>dp[a] && (nums[a]%p==0 || p%nums[a]==0)){
            dp[a]=l.size();
            l.add(nums[a]);
            suba(nums,a+1,nums[a],l);
            l.remove(l.size()-1);
        }

        suba(nums,a+1,p,l);
    }
}