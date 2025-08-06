// Last updated: 6/8/2025, 11:04:43 pm
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int a:nums){
            pq.add(a);
        }
        while(k>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==pq.peek()){
                    nums[i]=nums[i]*multiplier;
                    k--;
                    pq.poll();
                    pq.add(nums[i]);
                    break;
                }
            }
        }
        return nums;
    }
}