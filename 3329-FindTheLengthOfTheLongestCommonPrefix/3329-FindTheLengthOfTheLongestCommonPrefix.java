// Last updated: 6/8/2025, 11:05:15 pm
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Node root = new Node();
		for(int s : arr1) {
			insert(root,s+"");
		}
        int ans =0;
        for(int i:arr2){
            ans=Math.max(ans,startsWith(i+"",root));
        }
        return ans;
        
        
    }
    
    static class Node{
		char data;
		String isTerminal=null;
		HashMap<Character, Node> child=new HashMap<>();
	}

	
	private static Node root;
	
	public static void insert(Node root, String word) {
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
			}
			else {
				Node nn=new Node();
				nn.data=ch;
				curr.child.put(ch,nn);
				curr=nn;
			}
		}
		curr.isTerminal=word;
	}
    
    public int startsWith(String prefix,Node root) {
    	Node curr = root;
        int ans=0;
		for(int i=0;i<prefix.length();i++) {
			char ch = prefix.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
                ans++;
			}
			else {
				return ans;
			}
		}
		return ans;
    }
}