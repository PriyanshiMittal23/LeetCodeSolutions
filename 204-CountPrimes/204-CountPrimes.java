// Last updated: 6/8/2025, 11:12:46 pm
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int a=0;
        boolean[] arr=new boolean[n];
        arr[0]=arr[1]=true;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                a++;
                for(int j=2;j*i<arr.length;j++){
                    arr[j*i]=true;
                }
            }
        }
        return a;
    }
}