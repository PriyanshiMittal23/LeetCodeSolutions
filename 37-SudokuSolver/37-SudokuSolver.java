// Last updated: 6/8/2025, 11:14:59 pm
class Solution {
    public void solveSudoku(char[][] board) {
        SS(board,0,0);
    }
    public static boolean SS(char[][]board,int r,int c) {
		if(c==9) {
			return SS(board,r+1,0);
		}
		if(r==9) {
			// display(board);
			return true;
		}
		if(board[r][c]!='.') {
			return SS(board,r,c+1);
		}
		else {
			for(int i=1;i<=9;i++) {
				if(isPos(board,r,c,i)==true) {
					board[r][c]=(char)(i+'0');
					if(SS(board,r,c+1)){
						return true;
					}
					board[r][c]='.';
				}
			}
		}
		return false;
	}
	public static boolean isPos(char[][]board,int r,int c,int val) {
		char ch=(char)(val+'0');
		int i=0;
		while(i<9) {
			if(board[r][i]==ch) {
				return false;
			}
			i++;
		}
		int j=0;
		while(j<9) {
			if(board[j][c]==ch) {
				return false;
			}
			j++;
		}
		i=r-r%3;
		j=c-c%3;
		for(int a=i;a<i+3;a++) {
			for(int b=j;b<j+3;b++) {
				if(board[a][b]==ch) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void display(char[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
