// Last updated: 6/8/2025, 11:05:33 pm
class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans=new ArrayList<>();
        for(int i =0;i<variables.length;i++){
            int a=variables[i][0];
            int b=variables[i][1];
            int c=variables[i][2];
            int d=variables[i][3];
            if(modExpo(modExpo(a,b,10),c,d)==target){
                ans.add(i);
            }
                
        }
        return ans;
    }
    public int modExpo(int a,int b,int c){
        if(c== 1){
            return 0;
        }
        int ans= 1;
        a=a %c;
        while(b>0){
            if(b % 2!=0){
                ans =(ans*a)%c;
            }
            b=b>> 1;
            a=(a*a) %c;
        }
        return ans;
    }

}