// Last updated: 15/07/2026, 22:01:40
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int sumodd=1;
4        int sumeven=2;
5        int totalsumodd=1;
6        int totalsumeven=2;
7        int ans=0;
8        for(int i=1;i<n;i++)
9        {
10            sumodd+=2;
11            sumeven+=2;
12            totalsumodd+=sumodd;
13            totalsumeven+=sumeven;
14            
15        }
16        for(int i=1;i<=n;i++)
17        {
18            if(totalsumodd %i ==0 && totalsumeven%i==0)
19            {
20                ans=i;
21            }
22        }
23        return ans;
24    }
25}