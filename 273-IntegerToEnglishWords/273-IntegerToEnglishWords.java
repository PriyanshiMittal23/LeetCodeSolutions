// Last updated: 6/8/2025, 11:12:08 pm
class Solution {
    String[] ones = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve"," Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
    String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
    String[] thousands = {"", " Thousand", " Million", " Billion"};

    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        return help(num).substring(1);
    }

    public String help(int n){
        if(n<20){
            return ones[n];
        }
        if(n<100){
            return tens[n/10]+help(n%10);
        }
        if(n<1000){
            return help(n/100)+" Hundred"+help(n%100);
        }
        for(int i=3;i>=0;i--){
            if(n>=Math.pow(1000,i)){
                return help((int)(n/Math.pow(1000,i)))+ thousands[i] + help((int)(n%Math.pow(1000,i)));
            }
        }
        return "";
    }
}