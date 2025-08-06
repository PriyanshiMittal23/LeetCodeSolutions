// Last updated: 6/8/2025, 11:15:29 pm
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
       int k=2*(numRows-1);
       int n=s.length() ;
       StringBuilder s1=new StringBuilder();
       for(int i=0;i<numRows;i++){
           int j=i;
           while(j<n){
               s1.append(s.charAt(j));
               if(i!=0 && i!=numRows-1){
                   int a=j+k-(2*i);
                   if(a<n){
                       s1.append(s.charAt(a));
                   }
               }
               j=j+k;
           }
       }
       return s1.toString();
    }
}