// Last updated: 6/8/2025, 11:08:42 pm
class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        Arrays.sort(salary);
        double ans=0;
        for(int i=1;i<n-1;i++){
            ans=ans+salary[i];
        }
        return ans/(n-2);
    }
}