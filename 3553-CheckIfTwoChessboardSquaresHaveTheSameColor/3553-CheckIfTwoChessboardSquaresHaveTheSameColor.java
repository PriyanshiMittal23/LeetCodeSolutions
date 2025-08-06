// Last updated: 6/8/2025, 11:04:46 pm
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        List<Character>b = new ArrayList<>();
        b.add('a');
        b.add('c');
        b.add('e');
        b.add('g');
        List<Character>w = new ArrayList<>();
        w.add('b');
        w.add('d');
        w.add('f');
        w.add('h');
        int p = Integer.parseInt(coordinate1.charAt(1)+"");
        int q = Integer.parseInt(coordinate2.charAt(1)+"");
        if(b.contains(coordinate1.charAt(0)) && p%2==q%2 && b.contains(coordinate2.charAt(0))){
            return true;
        }else if(w.contains(coordinate1.charAt(0)) && p%2==q%2 && w.contains(coordinate2.charAt(0))){
            return true;
        }
        else if(p%2!=q%2 && ((w.contains(coordinate1.charAt(0))&& b.contains(coordinate2.charAt(0))) ||(w.contains(coordinate2.charAt(0))&& b.contains(coordinate1.charAt(0))) )){
            return true;
        }
        return false;
    }
}