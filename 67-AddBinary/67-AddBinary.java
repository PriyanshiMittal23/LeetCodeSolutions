// Last updated: 6/8/2025, 11:14:27 pm
class Solution {
    public String addBinary(String a, String b) {
        int c=0;
        String ans="";
        int p=a.length()-1;
        int q=b.length()-1;
        while(p>=0 && q>=0){
            if(a.charAt(p)=='1' && b.charAt(q)=='1'){
                if(c==1){
                    ans='1'+ans;
                }else{
                    ans='0'+ans;
                    c=1;
                }
            }else if(a.charAt(p)==b.charAt(q)){
                if(c==1){
                    ans='1'+ans;
                    c=0;
                }
                else{
                    ans='0'+ans;
                }
            }else{
                if(c==1){
                    ans='0'+ans;
                }else{
                    ans='1'+ans;
                }
            }
            p--;
            q--;
        }
        while(p>=0){
            if(c==1){
                if(a.charAt(p)=='1'){
                    ans='0'+ans;
                }else{
                    ans='1'+ans;
                    c=0;
                }
            }
            else{
                ans=a.charAt(p)+ans;
            }
            p--;
        }
        while(q>=0){
            if(c==1){
                if(b.charAt(q)=='1'){
                    ans='0'+ans;
                }else{
                    ans='1'+ans;
                    c=0;
                }
            }
            else{
                ans=b.charAt(q)+ans;
            }
            q--;
        }
        if(c==1){
            ans='1'+ans;
        }
        return ans;
    }
}