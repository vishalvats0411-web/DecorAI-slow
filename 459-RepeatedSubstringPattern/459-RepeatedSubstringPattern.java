// Last updated: 14/07/2026, 10:02:01
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n=s.length();
4        for(int i=n/2;i>0;i--)
5        {   
6            if(n%i==0)
7            {
8                StringBuilder compare=new StringBuilder();
9                int appendtimes=n/i;
10                String pattern=s.substring(0,i);
11                for(int j=1;j<=appendtimes;j++)
12                {
13                    compare.append(pattern);
14                }
15                if(s.equals(compare.toString()))
16                {
17                    return true;
18                }
19            }
20        }
21        return false;
22    }
23}