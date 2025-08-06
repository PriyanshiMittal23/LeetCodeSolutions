// Last updated: 6/8/2025, 11:06:36 pm
class Solution {
    public int splitNum(int num) {
        String str= Integer.toString(num);
        String[]arr=str.split("");
        Arrays.sort(arr);
        String num1="";
        String num2="";
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                num1=num1+arr[i];
            }
            else{
                num2=num2+arr[i];
            }
        }
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        return a+b;
    }
}