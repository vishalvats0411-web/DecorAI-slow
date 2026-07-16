// Last updated: 16/07/2026, 11:59:29
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n=nums.length;
4        int max=nums[0];
5        int[] prefixgcd=new int[n];
6        for(int i=0;i<n;i++)
7        {
8            max=Math.max(nums[i],max);
9            prefixgcd[i]=gcd(max,nums[i]);
10        }
11        Arrays.sort(prefixgcd);
12        long sum=0;
13        for(int i=0;i<n/2;i++)
14        {
15            sum+=gcd(prefixgcd[i],prefixgcd[n-i-1]);
16        }
17        return sum;
18
19    }
20    public int gcd(int a,int b)
21    {
22        while(b!=0)
23        {
24            int temp=b;
25            b=a%b;
26            a=temp;
27        }
28        return Math.abs(a);
29    }
30}