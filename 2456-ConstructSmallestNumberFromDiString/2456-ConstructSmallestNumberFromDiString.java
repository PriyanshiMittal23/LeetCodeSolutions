// Last updated: 6/8/2025, 11:07:19 pm
class Solution {
    public String smallestNumber(String pattern) {
        int[]ans=new int[pattern.length()+1];
        int count =1;
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length()||pattern.charAt(i)=='I'){
                ans[i]=count;
                count++;
                for(int j=i-1;j>=0 && pattern.charAt(j)!='I';j--){
                    ans[j]=count;
                    count++;
                }
            }
        }
        String str="";
        for(int i=0;i<ans.length;i++){
            str=str+ans[i];
        }
        return str;
        
    }
}