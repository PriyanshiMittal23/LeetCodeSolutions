// Last updated: 6/8/2025, 11:06:14 pm
class Solution {
    public int buyChoco(int[] prices, int money) {
        int a=money;
        int b=0;
        int c=2;
        Arrays.sort(prices);
        while(b<prices.length && a>=prices[b] && c>0){
            a=a-prices[b];
            c--;
            b++;
        }
        if(c==0){
            return a;
        }
        return money;
    }
}