// Last updated: 18/07/2026, 20:45:44
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder t= new StringBuilder();
4        int xcount=0;
5        int ycount=0;
6        for(int i=0;i<s.length();i++)
7            {
8                if(s.charAt(i)==x)
9                     xcount++; 
10                else if(s.charAt(i)==y)
11                        ycount++;
12                else
13                    t.append(s.charAt(i));
14            }
15        while(ycount-->0)
16            {
17                t.append(y);
18            }
19        while(xcount-->0)
20            {
21                t.append(x);
22            }
23        return t.toString();
24    }
25}