// Last updated: 6/8/2025, 11:08:00 pm
class FindSumPairs {

    private int[] arr1;
    private int[] arr2;
    private HashMap<Integer, Integer> hm;

    public FindSumPairs(int[] nums1, int[] nums2) {
        hm = new HashMap<>();
        for(int a:nums2){
            hm.put(a, hm.getOrDefault(a,0)+1);
        }
        arr1 = nums1;
        arr2 = nums2;
    }
    
    public void add(int index, int val) {
        hm.put(arr2[index], hm.get(arr2[index])-1);
        arr2[index] += val;
        hm.put(arr2[index], hm.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int c = 0;
        for(int a:arr1){
            c+= hm.getOrDefault(tot-a, 0);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */