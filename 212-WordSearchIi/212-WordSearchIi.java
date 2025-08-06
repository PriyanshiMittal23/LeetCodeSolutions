// Last updated: 6/8/2025, 11:12:37 pm
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
		Node root = new Node();
		for(String s : words) {
			insert(root,s);
		}
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(root.child.containsKey(board[i][j])) {
					wordSearch(board,i,j,root);
				}
			}
		}
        return ll;
        
	}
	
	List<String> ll = new ArrayList<>();
	
	private void wordSearch(char[][] board, int i, int j, Node root) {
		if(i<0 || j<0 || i>=board.length || j>=board[0].length || !root.child.containsKey(board[i][j])) {
			return;
		}
		char ch = board[i][j];
		Node curr = root.child.get(ch);
		if(curr.isTerminal!=null) {
			ll.add(curr.isTerminal);
			curr.isTerminal=null;
		}
		board[i][j]='*';
		wordSearch(board,i+1,j,curr);
		wordSearch(board,i-1,j,curr);
		wordSearch(board,i,j+1,curr);
		wordSearch(board,i,j-1,curr);
		board[i][j]=ch;
		
	}

	class Node{
		char data;
		String isTerminal=null;
		HashMap<Character, Node> child=new HashMap<>();
	}

	
	private Node root;
	
	public void insert(Node root, String word) {
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
}