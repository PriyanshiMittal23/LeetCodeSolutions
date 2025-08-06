// Last updated: 6/8/2025, 11:05:03 pm
class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p=Integer.MAX_VALUE;
        int[]ans={nums2[0]-nums1[0],nums2[0]-nums1[2],nums2[0]-nums1[1]};
        for(int a:ans){
            int d=0;
            int n2=0;
            for(int i=0;i<nums1.length && n2<nums1.length-2;i++){
                if(nums2[n2]-nums1[i]!=a){
                    d++;
                }
                else{
                    n2++;
                }
                if(d>2){
                    break;
                }
            }
            if(n2==nums1.length-2){
                p=Math.min(p,a);
            }

        }
        return p;
    }
}