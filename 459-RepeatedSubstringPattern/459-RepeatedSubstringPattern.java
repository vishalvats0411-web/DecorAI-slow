// Last updated: 14/07/2026, 14:52:16
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        int n=s.length();
4        if(n!=goal.length())
5            return false;
6        return (s+s).contains(goal);
7    }
8}