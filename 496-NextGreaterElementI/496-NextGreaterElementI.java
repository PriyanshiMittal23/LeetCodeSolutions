// Last updated: 6/8/2025, 11:11:09 pm
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return nectG(nums1,nums2);
    }

    public int[] nectG(int[]arr1, int[]arr2){
        int[]ans = new int[arr1.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int a :arr2){
            while(!st.isEmpty() && st.peek()<a){
                hm.put(st.pop(),a);
            }
            st.push(a);
        }
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                ans[i]=hm.get(arr1[i]);
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;

    }
}