// Last updated: 6/8/2025, 11:05:49 pm
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            String str=i+"";
            if(isSym(str)){
                // System.out.println(str);
                ans++;
            }
        }
        return ans;
    }
    public boolean isSym(String str){
        if(str.length()%2!=0){
            return false;
        }
        int a=0;
        int b=str.length()-1;
        int i=0;
        int j=0;
        while(a<b){
             i=i+Integer.parseInt(str.charAt(a)+"");
             j=j+Integer.parseInt(str.charAt(b)+"");
            a++;
            b--;
        }
        if(i==j){
            return true;
        }
        return false;
    }
}