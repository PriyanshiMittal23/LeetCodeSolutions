// Last updated: 6/8/2025, 11:11:36 pm
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList();
		return printlc(0,n,l);
	}
	public static List printlc(int c, int n, List<Integer> l) {
		if(c>n) {
			return l;
		}
        if(c!=0){
            l.add(c);
        }
		
		int i=0;
		if(c==0) {
			i=1;
		}
		for(;i<=9;i++) {
			printlc(c*10+i,n,l);
		}
        return l;  
    }
}