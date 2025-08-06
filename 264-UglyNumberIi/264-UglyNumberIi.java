// Last updated: 6/8/2025, 11:12:11 pm
class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        int i2=0;
        int i3=0;
        int i5=0;
        for(int i=1;i<n;i++){
            int next = Math.min(l.get(i2)*2,Math.min(l.get(i3)*3,l.get(i5)*5));
            l.add(next);
            if(l.get(i2)*2==next){
                i2++;
            }
            if(l.get(i3)*3==next){
                i3++;
            }
            if(l.get(i5)*5==next){
                i5++;
            }
        }
        System.out.println(l);
        return l.get(n-1);
    }
}