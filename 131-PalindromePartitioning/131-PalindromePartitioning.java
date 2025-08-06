// Last updated: 6/8/2025, 11:13:30 pm
class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<String>l=new ArrayList<String>();
		List<List<String>>l2=new ArrayList<List<String>>();
        return partition(s,l,l2);
        
    }
    public static List<List<String>> partition(String ques,List<String> l,List<List<String>> l2) {
		if(ques.length()==0) {
			l2.add(new ArrayList<>(l));
			return l2;
		}
		for(int i=1;i<=ques.length();i++) {
			String part=ques.substring(0,i);
			if(pallindrome(part)) {
				l.add(part);
				partition(ques.substring(i),l,l2);
				l.remove(l.size()-1);
			}
		}
		return l2;
	}
	public static boolean pallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}