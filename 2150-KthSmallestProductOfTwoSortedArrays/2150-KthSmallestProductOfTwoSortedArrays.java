// Last updated: 6/8/2025, 11:07:41 pm
class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        return SortedArray(nums1,nums2,k);
    }

    public static long SortedArray(int[]arr1,int[]arr2,long k) {
		long lo=-1000_000_0000l;
		long hi=1000_000_0000l;
		long ans=0;
		while(lo<=hi) {
			long mid=(lo+hi)/2;
			if(countPro(arr1,arr2,mid)>=k) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	private static long countPro(int[] arr1, int[] arr2, long dotPro) {
		// TODO Auto-generated method stub
		long ans=0;
		for(int a:arr1) {
			int c=0;
			if(a>=0) {
				int hi=arr2.length-1;
//				int c=0;
				int lo=0;
				while(lo<=hi) {
					int mid=(lo+hi)/2;
					if((long)a*arr2[mid]<=dotPro) {
						c=mid+1;
						lo=mid+1;
					}
					else {
						hi=mid-1;
					}
				}
				ans+=c;
			}
			else {
				int lo=0;
				int hi=arr2.length-1;
				while(lo<=hi) {
					int mid=(lo+hi)/2;
					if((long)a*arr2[mid]<=dotPro) {
						c=arr2.length-mid;
						hi=mid-1;
					}
					else {
						lo=mid+1;
					}
				}
				ans+=c;
			}
		}
		return ans;
	}
}