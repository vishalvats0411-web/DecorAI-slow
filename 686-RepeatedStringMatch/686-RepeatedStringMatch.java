// Last updated: 15/07/2026, 12:34:27
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        int lena=a.length();
4        int lenb=b.length();
5        int n=(lenb/lena);
6        StringBuilder na=new StringBuilder();
7        int ans=n;
8        while(n>0)
9        {
10            na.append(a);
11            n--;
12        }
13        if(na.toString().contains(b))
14        {
15            return ans;
16        }
17        na.append(a);
18        if(na.toString().contains(b))
19        {
20            return ans+1;
21        }
22        na.append(a);
23        if(na.toString().contains(b))
24        {
25            return ans+2;
26        }
27        return -1;
28    }
29}