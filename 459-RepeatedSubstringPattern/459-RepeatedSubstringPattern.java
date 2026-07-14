// Last updated: 14/07/2026, 09:42:37
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n=s.length();
4        for(int i=n/2;i>0;i--)
5        {   
6            if(n%i==0)
7            {
8                String compare="";
9                int appendtimes=n/i;
10                for(int j=1;j<=appendtimes;j++)
11                {
12                    compare+=s.substring(0,i);
13                }
14                if(compare.equals(s))
15                {
16                    return true;
17                }
18            }
19        }
20        return false;
21    }
22}