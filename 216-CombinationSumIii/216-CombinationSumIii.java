// Last updated: 6/8/2025, 11:12:34 pm
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer>l=new ArrayList<Integer>();
		List<List<Integer>>l2=new ArrayList<List<Integer>>();
        return CS(k,n,l,1,l2);
    }
    public static List<List<Integer>> CS(int k,int n,List<Integer> l,int a,List<List<Integer>> l2){
        if(k==0 && n==0){
            l2.add(new ArrayList<>(l));
			return l2;
        }
        for(int i=a;i<=9;i++){
            if(k>0 && n>=i){
                l.add(i);
                CS(k-1,n-i,l,i+1,l2);
                l.remove(l.size()-1);
            }
        }
        return l2;
    }
}