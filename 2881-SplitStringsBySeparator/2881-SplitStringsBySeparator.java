// Last updated: 6/8/2025, 11:05:51 pm
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
        List<String>ans=new ArrayList<>();
        for(String s:words){
            int a=0;
            for(int i=0;i<s.length();++i){
                if(s.charAt(i)==separator){
                    String p=s.substring(a,i);
                    if(p.equals("")){
                        a=i+1;
                        
                    }
                    else{
                        ans.add(p);
                        a=i+1;
                    }
                }
                
            }
            String d=s.substring(a,s.length());
            if(d.equals("")==false){
                ans.add(d);
            }
            
        }
        
        return ans;
    }
}