// Last updated: 18/07/2026, 21:19:05
1class Solution {
2    public int minAdjacentSwaps(int[] nums, int a, int b) {
3        long inversions =0;
4        long count1=0;
5        long count2=0;
6        long MOD=1_000_000_007;
7
8        for(int num:nums)
9            {
10                if(num<a)
11                {
12                    inversions+=count1+count2;
13                }
14                else if(num>=a && num<=b)
15                {
16                    inversions+=count2;
17                    count1++;
18                }
19                else
20                {
21                    count2++;
22                }
23                
24            }
25        return (int ) (inversions%MOD);
26    }
27}