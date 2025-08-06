// Last updated: 6/8/2025, 11:15:17 pm
class Solution {
    static String[]key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        keypad(digits,"",list);
        return list;
    }
    public static void keypad(String digits,String ans,List<String>list){
        if(digits.length()==0){
            list.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        String s=key[ch-'0'];
        for(int i=0;i<s.length();i++){
            keypad(digits.substring(1),ans+s.charAt(i),list);
        }
    }
}