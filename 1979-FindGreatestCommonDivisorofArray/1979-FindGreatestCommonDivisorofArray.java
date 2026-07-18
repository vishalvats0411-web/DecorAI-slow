// Last updated: 18/07/2026, 11:33:45
1class Solution {
2    public int findGCD(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++)
6        {
7            min=Math.min(nums[i],min);
8            max=Math.max(nums[i],max);
9        }
10        return gcd(min,max);
11    }
12    public int gcd(int a,int b)
13    {
14        while(b!=0)
15        {
16            int temp=b;
17            b=a%b;
18            a=temp;
19        }
20        return Math.abs(a);
21    }
22}