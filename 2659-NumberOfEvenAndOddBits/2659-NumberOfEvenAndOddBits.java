// Last updated: 6/8/2025, 11:06:33 pm
class Solution {
    public int[] evenOddBit(int n) {
        String str="";
        int[]ans=new int[2];
        if(n==2){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        while(n>0){
            int a=n%2;
            n=n/2;
            str=str+a;
        }
        //System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                if(i%2==0){
                    ans[0]++;
                }
                else{
                    ans[1]++;
                }
            }
        }
        return ans;
    }
}