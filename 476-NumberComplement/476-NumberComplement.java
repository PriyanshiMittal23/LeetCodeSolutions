// Last updated: 6/8/2025, 11:11:13 pm
class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        // System.out.println((1 << bitLength)-1);
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
}