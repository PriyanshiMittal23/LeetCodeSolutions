// Last updated: 6/8/2025, 11:06:09 pm
class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] arr=new boolean[n];
        List<Integer>l =new ArrayList<>();
        int j=0;
        int a=1;
        while(arr[j%n]!=true){
            arr[j%n]=true;
            j=j+(a)*k;
            a++;
        }
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            if(arr[i]==false){
                
                l.add(i+1);
            }
        }
        // System.out.println(l);
        int[]ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}