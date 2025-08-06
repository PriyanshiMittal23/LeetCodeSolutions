// Last updated: 6/8/2025, 11:12:19 pm
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return MSW(nums,k);
    }
    public int[] MSW(int[] arr,int k){
        if(arr.length==0 || k<=0){
            return new int[0];
        }
        Deque<Integer> q = new ArrayDeque<>();
        int[]ans = new int[arr.length-k+1];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }

            while(!q.isEmpty() && arr[q.peekLast()]<arr[i]){
                q.pollLast();
            }

            q.offer(i);
            if(i>=k-1){
                ans[a++]=arr[q.peek()];
            }

        }
        return ans;
    }
}