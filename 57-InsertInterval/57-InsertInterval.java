// Last updated: 6/8/2025, 11:14:39 pm
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> al=new ArrayList<>();
        int s=newInterval[0];
        int e=newInterval[1];
        int i=0;
        while(i<intervals.length && intervals[i][1]<s){
            al.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=e){
            s=Math.min(intervals[i][0],s);
            e=Math.max(intervals[i][1],e);
            i++;
        }
        newInterval[0]=s;
        newInterval[1]=e;
        al.add(newInterval);
        while(i<intervals.length){
            al.add(intervals[i]);
            i++;
        }
        return al.toArray(new int[al.size()][2]);


    }
}