// Last updated: 6/8/2025, 11:05:59 pm
class Solution {
    public int minimizedStringLength(String s) {
        char[] arr=new char[s.length()];
        for(int a=0;a<s.length();a++){
            arr[a]=s.charAt(a);
        }
        Arrays.sort(arr);
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            c++;
        }
        return c;
    }
}