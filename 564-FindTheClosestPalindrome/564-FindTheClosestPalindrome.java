// Last updated: 6/8/2025, 11:10:55 pm
class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        if(num<=10){
            return (num-1)+"";
        }
        if(num==11){
            return "9";
        }

        long left = Long.parseLong(n.substring(0,(n.length()+1)/2));
        int le = n.length();
        long[] values = new long[5];
        values[0] = pallindrome(left,le%2==0);
        values[1] = pallindrome(left-1, le%2==0);
        values[2] = pallindrome(left+1,le%2==0);
        values[3] = (long)(Math.pow(10,le-1))-1;
        values[4] = (long)(Math.pow(10,le))+1;
        long ans = 0;
        long minDiff = Long.MAX_VALUE;
        for(long a : values){
            if(a==num){
                continue;
            }
            long diff = Math.abs(num-a);
            if(diff<minDiff || (diff==minDiff && a<ans)){
                ans = a;
                minDiff=diff;
            }
        }
        return ans+"";

    }

    public long pallindrome(long left, boolean isEven){
        long ans = left;
        if(!isEven){
            left/=10;
        }

        while(left>0){
            ans = ans*10+left%10;
            left/=10;
        }
        return ans;
    }
}