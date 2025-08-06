// Last updated: 6/8/2025, 11:10:48 pm
class Solution {
    public String fractionAddition(String expression) {
        int s=1;
        int i=0;
        int n=0;
        int d=1;
        while(i<expression.length()){
            if(expression.charAt(i)=='-'){
                s=-1;
                i++;
            }else if(expression.charAt(i)=='+'){
                s=1;
                i++;
            }

            int j=i;
            while(j<expression.length() && Character.isDigit(expression.charAt(j))){
                j++;
            }
            int num = s*Integer.parseInt(expression.substring(i,j));
            i=j+1;
            j=i;
            while(j<expression.length() && Character.isDigit(expression.charAt(j))){
                j++;
            }
            int den = Integer.parseInt(expression.substring(i,j));
            int cd = (den/hcf(den,d))*d;
            n = (n*(cd/d))+(num*(cd/den));
            d=cd;
            System.out.println(num+" "+den);
            i=j;
        }
        int hf = hcf(d,n);
        n = n/hf;
        d = d/hf;
        if(d<0){
            n=-1*n;
            d=-1*d;
        }
        return n+"/"+d;
    }

    public int hcf(int a,int b){
        return b==0?a:hcf(b,a%b);
    }
}