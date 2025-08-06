// Last updated: 6/8/2025, 11:04:57 pm
class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int a = (k)/n;
        int b = (k)%n;
        if(a%2==0){
            return b;
        }else{
            return n-b;
        }
    }
}