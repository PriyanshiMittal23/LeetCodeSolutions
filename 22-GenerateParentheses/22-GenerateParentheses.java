// Last updated: 6/8/2025, 11:15:11 pm
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        valid(n,"",0,0,list);
        return list;
    }
    public static void valid(int n,String ans,int c,int o,List<String>list) {
		if(o==n && c==n) {
			list.add(ans);
			return;
		}
		if(o<n) {
			valid(n,ans+"(",c,o+1,list);
		}
		if(c<o) {
			valid(n,ans+")",c+1,o,list);
		}
	}
}