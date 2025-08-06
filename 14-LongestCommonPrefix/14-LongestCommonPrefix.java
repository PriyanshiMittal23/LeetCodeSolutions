// Last updated: 6/8/2025, 11:15:20 pm
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int f=0;
        int i=0;
        while(i<strs[0].length()){
            char c=strs[0].charAt(i);
            if(strs.length==1){
                s=strs[0];
                return s;
            }
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<=i) {
            		f=0;
            		break;
            	}
                else if(strs[j].charAt(i)==c){
                    f=1;
                }
                else{
                    f=0;
                    break;
                }
            }
            if(f==1){
                s=s+c;
            }
            else{
                break;
            }
            i++;
            f=0;
            
        }
        return s;
        
    }
}