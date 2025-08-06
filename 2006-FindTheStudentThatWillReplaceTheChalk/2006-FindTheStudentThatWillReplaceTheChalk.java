// Last updated: 6/8/2025, 11:07:58 pm
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int a:chalk){
            sum+=a;
        }
        int s =(int)(k%sum);
        for(int i=0;i<chalk.length;i++){
            if(s<chalk[i]){
                return i;
            }
            s-=chalk[i];
        }
        return 0;
        
    }
}