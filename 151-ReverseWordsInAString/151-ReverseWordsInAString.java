// Last updated: 6/8/2025, 11:13:12 pm
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		String ans="";
		String []arr=s.split("\s+");
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
			
		}
		return ans.trim();
        
    }
}