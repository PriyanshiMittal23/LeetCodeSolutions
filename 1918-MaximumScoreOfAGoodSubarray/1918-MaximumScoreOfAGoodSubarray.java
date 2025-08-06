// Last updated: 6/8/2025, 11:08:06 pm
class Solution {
    public int maximumScore(int[] nums, int k) {
        return MaximumRectangle(nums,k);
    }
    public static int MaximumRectangle(int[]arr,int k){
        int ans=0;
        Stack<Integer> sta=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!sta.isEmpty() && arr[i]<arr[sta.peek()]){
                int r=i;
                int h=arr[sta.pop()];
                if(r-1>=k){
                    if(sta.isEmpty()){
                        ans=Math.max(ans,h*r);
                    }
                    else{
                        int l=sta.peek();
                        if(l+1<=k){
                            ans=Math.max(ans,h*(r-l-1));
                        }
                    }
                }
            }
            sta.push(i);
        }
        int r=arr.length;
        while(!sta.isEmpty() && r-1>=k){
            int h=arr[sta.pop()];
            if(sta.isEmpty()){
                ans=Math.max(ans,h*r);
            }
            else{
                int l=sta.peek();
                if(l+1<=k){
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
        }
        return ans;
    }
}