// Last updated: 6/8/2025, 11:08:16 pm
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>(){
            @Override
            public int compare(int[]a, int[]b){
                return b[1]-a[1];
            }
        });
        
        int ans=0;
        int i=0;
        while(truckSize>0 && i<boxTypes.length){
            if(truckSize>boxTypes[i][0]){
                ans+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
                i++;
            }else{
                ans+=(truckSize*boxTypes[i][1]);
                truckSize=0;
            }
        }
        return ans;
    }
}