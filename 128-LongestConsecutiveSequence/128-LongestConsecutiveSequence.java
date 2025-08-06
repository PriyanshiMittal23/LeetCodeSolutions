// Last updated: 6/8/2025, 11:13:33 pm
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
            else{
                map.put(nums[i],true);
            }
            if(map.containsKey(nums[i]+1)){
                map.put(nums[i]+1,false);
            }
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)){
                int c=0;
                while(map.containsKey(key)){
                    c++;
                    key++;
                }
                ans=Math.max(ans,c);
            }
            
        }
        return ans; 
    }
}