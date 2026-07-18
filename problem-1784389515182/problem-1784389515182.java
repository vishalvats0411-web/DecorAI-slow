// Last updated: 18/07/2026, 21:15:15
1class Solution {
2    public long maximumValue(int n, int s, int m) {
3        if(n==1)
4            return s;
5        long up=n/2;
6        long down=(n-2)/2;
7
8
9
10        return s+(up*m)-down;
11    }
12}