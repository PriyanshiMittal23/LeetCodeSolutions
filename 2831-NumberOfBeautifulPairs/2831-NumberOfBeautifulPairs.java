// Last updated: 6/8/2025, 11:05:57 pm
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String a=""+nums[i];
                String b=""+nums[j];
                String a1=""+a.charAt(0);
                String b1=""+b.charAt(b.length()-1);
                int c=Integer.parseInt(a1);
                int d=Integer.parseInt(b1);
                if(gcd(c,d)==1){
                    ans++;
                }
                
            }
        }
        return ans;
    }
    public static int gcd(int a,int b){
        // System.out.println(a+" "+b);
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}