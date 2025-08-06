// Last updated: 6/8/2025, 11:12:26 pm
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int co = 0;
        int ct = 1;
        int a1 = 0;
        int a2 = 0;
        for(int a:nums){
            if(a==co){
                a1++;
            }else if(a==ct){
                a2++;
            }else if(a1==0){
                co=a;
                a1=1;
            }else if(a2==0){
                ct=a;
                a2=1;
            }else{
                a1--;
                a2--;
            }
        }
        int count = 0;
        int count2 = 0;
        for(int a:nums){
            if(a==co){
                count++;
            }
            if(a==ct){
                count2++;
            }
        }
        List<Integer> l = new ArrayList<>();
        if(count > nums.length/3){
            l.add(co);
        }
        if(count2> nums.length/3 && ct!=co){
            l.add(ct);
        }
        return l;
    }
}