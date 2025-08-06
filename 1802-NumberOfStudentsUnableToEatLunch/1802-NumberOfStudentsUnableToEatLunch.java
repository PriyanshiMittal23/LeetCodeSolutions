// Last updated: 6/8/2025, 11:08:21 pm
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int z=0;
        int o=0;
        for(int a:students){
            if(a==0){
                z++;
            }
            else{
                o++;
            }
        }
        for(int a:sandwiches){
            if(a==0){
                if(z==0){
                    return o;
                }
                z--;
            }
            else{
                if(o==0){
                    return z;
                }
                o--;
            }

        }
        return 0;
    }
}