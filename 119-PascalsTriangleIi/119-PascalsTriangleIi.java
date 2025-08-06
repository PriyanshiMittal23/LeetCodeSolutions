// Last updated: 6/8/2025, 11:13:41 pm
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<Integer>();
        int i=0;
        long val=1;
        while(i<=rowIndex){
            list.add((int)(val));
            val=((rowIndex-i)*val)/(i+1);
            i++;
        }
        return list;
    }
}