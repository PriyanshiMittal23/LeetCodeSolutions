// Last updated: 6/8/2025, 11:14:41 pm
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        });

        int idx=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[idx][1]){
                intervals[idx][1]= Math.max(intervals[idx][1],intervals[i][1]);
            }else{
                idx++;
                intervals[idx]=intervals[i];
            }
        }
        int[][]arr=new int[idx+1][2];
        for(int i=0;i<arr.length;i++){
            arr[i]=intervals[i];
        }
        return arr;
    }
}