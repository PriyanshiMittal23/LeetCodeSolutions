// Last updated: 6/8/2025, 11:09:37 pm
class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>help=new HashMap<>();
        for(int i=0;i<words[0].length();i++){
            char ch=words[0].charAt(i);
            help.put(ch,help.getOrDefault(ch,0)+1);   
        }
        // System.out.println(help);
        for(int i=1;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(help.containsKey(ch) && help.get(ch)!=0){
                    hm.put(ch,hm.getOrDefault(ch,0)+1);
                    help.put(ch,help.get(ch)-1);
                }
            }
            help=hm;
            hm=new HashMap<>();
        }
        List<String>l=new ArrayList<>();
        for(Map.Entry<Character,Integer> e:help.entrySet()){
            char k = e.getKey();
            int v = e.getValue();
            for(int i=0;i<v;i++){
                l.add(k+"");
            }
        }
        return l;
    }
}