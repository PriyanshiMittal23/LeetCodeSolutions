// Last updated: 6/8/2025, 11:04:50 pm
class Solution {
    public int minChanges(int n, int k) {
        if(n==k){
            return 0;
        }
        String p=binary(n);
        String q=binary(k);
        if(q.length()>p.length()){
            return -1;
        }
        System.out.println(p+"  "+q);
        int ans=0;
        int i=q.length()-1;
        int j=p.length()-1;
        while(i>=0){
            if(q.charAt(i)!=p.charAt(j) && p.charAt(j)=='1'){
                ans++;
                
            }
            else if(q.charAt(i)!=p.charAt(j) && p.charAt(j)!='1'){
                return -1;
            }
            j--;
            i--;
        }
        while(j>=0){
            if(p.charAt(j--)=='1'){
                ans++;
            }
        }
        return ans;
    }
    
    public String binary(int n){
        String ans="";
        while(n>0){
            ans=n%2+ans;
            n=n/2;
        }
        return ans;
    }
}