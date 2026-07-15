// Last updated: 15/07/2026, 17:04:46
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
13        if(kmpSearch(na.toString(),b))
14        {
15            return ans;
16        }
17        na.append(a);
18        if(kmpSearch(na.toString(),b))
19        {
20            return ans+1;
21        }
22        na.append(a);
23        if(kmpSearch(na.toString(),b))
24        {
25            return ans+2;
26        }
27        return -1;
28    }
29    public boolean kmpSearch(String text,String pattern)
30    {
31        int n=text.length();
32        int m=pattern.length();
33        int[]lps =new int[m];
34        lpscompute(pattern ,lps);
35        int i=0;
36        int j=0;
37        while(i<n)
38        {
39            if(text.charAt(i)==pattern.charAt(j))
40            {
41                i++;
42                j++;
43                if(j==m)
44                    return true;
45            }
46            else
47            {
48                if(j!=0)
49                {
50                    j=lps[j-1];
51                }
52                else
53                {
54                    i++;
55                }
56            }
57        }
58        return false;
59    }
60    public void lpscompute(String pattern,int[]lps)
61    {
62        int m=pattern.length();
63        int i=1;
64        lps[0]=0;
65        int length=0;
66        while(i<m)
67        {
68            if(pattern.charAt(i)==pattern.charAt(length))
69            {
70                length++;
71                lps[i]=length;
72                i++;
73            }
74            else
75            {   
76                if(length!=0)
77                {
78                    length=lps[length-1];
79                }
80                else
81                {
82                    length=0;
83                    i++;
84                }
85            }
86        }
87    }
88}