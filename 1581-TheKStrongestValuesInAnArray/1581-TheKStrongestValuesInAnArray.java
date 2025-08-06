// Last updated: 6/8/2025, 11:08:44 pm
class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[]l=new int[k];
        int c=0;
        int n=arr[(arr.length-1)/2];
        int a=0;
        int b=arr.length-1;
        if(arr.length==1 || arr.length==k){
            return arr;
        }
        while(c<k && a<b ){
            if(Math.abs(arr[a]-n)> Math.abs(arr[b]-n)){
                l[c++]=arr[a];
                a++;
            }
            else{
                l[c++]=arr[b];
                b--;
            }
        }
        return l;
    }
}