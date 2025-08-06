// Last updated: 6/8/2025, 11:09:09 pm
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Pair []arr = new Pair[nums.length];
        for(int j=0;j<nums.length;j++){
            int m=0;
            Pair p=new Pair();
            p.a=nums[j];
            String s=nums[j]+"";
            for(int i=0;i<s.length();i++){
                m=m*10+mapping[s.charAt(i)-'0'];
            }
            p.m=m;
            arr[j]=p;
        }
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair c, Pair b){
                return c.m-b.m;
            }
        });
        int[]ans = new int[arr.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i].a;
        }
        return ans;
    }

    class Pair{
        int a;
        int m;
    }
}