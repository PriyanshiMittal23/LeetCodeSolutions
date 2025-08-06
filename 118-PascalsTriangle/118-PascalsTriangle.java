// Last updated: 6/8/2025, 11:13:43 pm
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer>list=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int row=0;
        int c=1;
        while(row<numRows){
            int val=1;
            int i=0;
            while(i<c){
                list.add(val);
                val=((row-i)*val)/(i+1);
                i++;
            }
            c++;
            row++;
            ans.add(new ArrayList<>(list));
            list.clear();
        }
        return ans;
    }
}