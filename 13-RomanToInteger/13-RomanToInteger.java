// Last updated: 6/8/2025, 11:15:22 pm
class Solution {
    public int romanToInt(String s) {
       int ans=0;
       int p=0;
       int a=0;
       for(int i=s.length()-1;i>=0;i--){
           switch(s.charAt(i)){
               case 'I' -> a=1;
               case 'V' -> a=5;
               case 'X' -> a=10;
               case 'L' -> a=50;
               case 'C' -> a=100;
               case 'D' -> a=500;
               case 'M' -> a=1000;
           }
           if(a<p){
               ans=ans-a;
           }
           else{
               ans=ans+a;
           }
           p=a;
       }
       return ans;
    }
}