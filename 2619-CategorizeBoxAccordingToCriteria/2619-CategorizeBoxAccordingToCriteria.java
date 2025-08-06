// Last updated: 6/8/2025, 11:06:47 pm
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int a=(int)(Math.pow(10,4));
        long v= (long)length*(long)width*(long)height;
        System.out.print(v);
        int h=0;
        int b=0;
        if(length>=a|| width>=a|| height>=a||mass>=a ||v>=(long)(Math.pow(10,9))){
            b=1;
        }
        if(mass>=100){
            h=1;
        }
        if(h==1 && b==1){
            return "Both";
        }
        else if(h==0 && b==0){
            return "Neither";
        }
        else if(h==0 && b==1){
            return "Bulky";
        }
        return "Heavy";
        
    }
}