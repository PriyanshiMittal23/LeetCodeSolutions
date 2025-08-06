// Last updated: 6/8/2025, 11:10:27 pm
class Solution { 
    public int monotoneIncreasingDigits(int n) { 
        char[] ans = Integer.toString(n).toCharArray(); 
        int k = ans.length; 
        for(int i = ans.length-1;i>0;i--){ 
            if(ans[i]<ans[i-1]){ 
                k=i; 
                ans[i-1]--; 
            } 
        } 
        for(int i=k;i<ans.length;i++){ 
            ans[i]='9'; 
        } 
        return Integer.parseInt(new String(ans)); 
    } 
}