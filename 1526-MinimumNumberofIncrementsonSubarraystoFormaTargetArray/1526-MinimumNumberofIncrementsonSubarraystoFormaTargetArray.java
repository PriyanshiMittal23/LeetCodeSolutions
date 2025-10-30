// Last updated: 30/10/2025, 10:53:57 pm
class Solution {
    public int minNumberOperations(int[] target) {
        int min = target[0];
        for (int i = 1; i < target.length; i++) {
            min += Math.max(target[i] - target[i - 1], 0);
        }
        return min;
    }
}