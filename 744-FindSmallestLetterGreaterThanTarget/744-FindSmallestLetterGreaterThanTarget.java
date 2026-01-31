// Last updated: 31/1/2026, 7:34:23 pm
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int a = 0;
4        int b = letters.length-1;
5        char ans = letters[b];
6        boolean f = false;
7        while(a<=b){
8            int mid = (a+b)/2;
9            if(target < letters[mid]){
10                ans = (char)(Math.min(ans, letters[mid]));
11                b=mid-1;
12                f = true;
13            }else{
14                a=mid+1;
15            }
16
17        }
18        if(!f){
19            ans = letters[0];
20        }
21        return ans;
22    }
23}