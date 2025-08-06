// Last updated: 6/8/2025, 11:06:31 pm
class Solution {
    public int distMoney(int money, int children) {
        int a=money-children;
        if(a<0){
            return -1;
        }
        if(children*8==money){
            return children;
        }
        if(money<8){
            return 0;
        }
        int b=money/8;
        int c=money%8;
        int f=children-b;
        if(children<=b){
            return children-1;
        }
        if((children-b==1) && c==4){
            return children-2;
        }
        if(c>=(children-b)){
            return b;
        }
        int q=b;
        while(c<f){
            c=c+8;
            f=f+1;
            q=q-1;
        }
        return q;
    }
}