// Last updated: 6/8/2025, 11:10:18 pm
class KthLargest {
    int k;
    PriorityQueue<Integer>pq;
    public KthLargest(int k, int[] nums) {
        List<Integer> list= new ArrayList<Integer>();  
        for(int i = 0; i < Math.min(k, nums.length); ++i) list.add(nums[i]);
        pq = new PriorityQueue<>(); pq.addAll(list);
        this.k = k;
        for(int i = k; i < nums.length; ++i) {
            pq.add(nums[i]);
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }

    public int kL(){
        List<Integer>l = new ArrayList<>();
        for(int i=1;i<k;i++){
            l.add(pq.poll());
        }
        int ans=pq.peek();
        for(int a:l){
            pq.add(a);
        }
        return ans;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */