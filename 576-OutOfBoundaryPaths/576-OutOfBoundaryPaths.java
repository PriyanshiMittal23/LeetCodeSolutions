// Last updated: 6/8/2025, 11:10:52 pm
class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] ans = new long[maxMove+1][m][n];
        for(long[][]b:ans){
            for(long[]a:b){
                Arrays.fill(a,-1);
            }
        }
        return (int)count(m,n,maxMove,startRow,startColumn,ans)%(1000000007);
    }

    public static long count(int m,int n, int mm, int sr, int sc, long[][][]ans){
        if(sr<0 || sr>=m || sc<0 || sc>=n){
            return 1;
        }
        if(mm==0){
            return 0;
        }
        if(ans[mm][sr][sc]!=-1){
            return ans[mm][sr][sc] %(1000000007);
        }

        long a = count(m,n,mm-1,sr-1,sc,ans)% (1000000007);
        long b = count(m,n,mm-1,sr+1,sc,ans)% (1000000007);
        long c = count(m,n,mm-1,sr,sc+1,ans)% (1000000007);
        long d = count(m,n,mm-1,sr,sc-1,ans)% (1000000007);
        return ans[mm][sr][sc] = (a+b+c+d) % (1000000007);
    }
}