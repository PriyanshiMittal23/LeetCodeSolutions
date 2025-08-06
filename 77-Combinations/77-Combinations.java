// Last updated: 6/8/2025, 11:14:14 pm
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer>l=new ArrayList<Integer>();
		List<List<Integer>>l2=new ArrayList<List<Integer>>();
        return combinations(n,k,l,1,l2);
    }
    public static List<List<Integer>> combinations(int n,int k,List<Integer> l,int a,List<List<Integer>> l2) {
		if(k==0) {
			l2.add(new ArrayList<>(l));
			return l2;
		}
		for(int i=a;i<=n;i++) {
			l.add(i);
			combinations(n,k-1,l,i+1,l2);
			l.remove(l.size()-1);
		}
		return l2;
	}

}