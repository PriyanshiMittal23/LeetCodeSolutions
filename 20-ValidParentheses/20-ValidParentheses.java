// Last updated: 6/8/2025, 11:15:14 pm
class Solution {
    public boolean isValid(String s) {
        return vp(s);
    }
    public static boolean vp(String s) {
		int n=s.length();
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<n;i++) {
			char a=s.charAt(i);
			if(a=='(') {
				st.push(1);
			}
			else if(a=='[') {
				st.push(2);
			}
			else if(a=='{') {
				st.push(3);
			}
			else if(a==')') {
				if(st.isEmpty() || st.peek()!=1) {
					return false;
				}
				else {
					st.pop();
				}
			}
			else if(a=='}') {
				if(st.isEmpty() || st.peek()!=3) {
					return false;
				}
				else {
					st.pop();
				}
			}
			else if(a==']') {
				if(st.isEmpty() || st.peek()!=2) {
					return false;
				}
				else {
					st.pop();
				}
			}
		}
		if(!st.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
}