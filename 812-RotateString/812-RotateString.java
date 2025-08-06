// Last updated: 6/8/2025, 11:10:11 pm
class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal))? true: false;
    }
}