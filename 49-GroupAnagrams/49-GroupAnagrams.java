// Last updated: 6/8/2025, 11:14:48 pm
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Anagram(strs);
    }
    public static String Key(String strs){
        char[] charArray = strs.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public static List<List<String>> Anagram(String[]arr){
        HashMap<String,List<String>> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String key = Key(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
                
            }
            map.get(key).add(arr[i]);
            
        }
        return new ArrayList<>(map.values());
    }
}