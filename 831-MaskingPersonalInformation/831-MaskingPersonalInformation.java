// Last updated: 13/07/2026, 18:32:26
1class Solution {
2    public String maskPII(String s) {
3        boolean isEmail=false;
4        int n=s.length();
5        if(s.charAt(0)>='a' && s.charAt(0)<='z' || s.charAt(0)>='A' && s.charAt(0)<='Z')
6        {
7            isEmail=true;
8        }  
9        String ans="";
10        if(isEmail)
11        {
12            return convertEmail(s);
13        }
14        return convertNum(s);
15    }
16    public String convertEmail(String s)
17    {
18        String ans="";
19        String [] arr= s.split("@");
20        char ch1=Character.toLowerCase(arr[0].charAt(0)); 
21        char ch2=Character.toLowerCase(arr[0].charAt(arr[0].length()-1)); 
22        return ans=ch1+"*****"+ch2+"@"+arr[1].toLowerCase();
23    }
24        public String convertNum(String s) {
25            StringBuilder digits = new StringBuilder();
26
27            // Extract only digits
28            for (char ch : s.toCharArray()) {
29                if (Character.isDigit(ch)) {
30                    digits.append(ch);
31                }
32            }
33
34            int n = digits.length();
35            int country = n - 10;
36
37            String last4 = digits.substring(n - 4);
38
39            if (country == 0) {
40                return "***-***-" + last4;
41            }
42
43            StringBuilder ans = new StringBuilder("+");
44
45            for (int i = 0; i < country; i++) {
46                ans.append("*");
47            }
48
49            ans.append("-***-***-");
50            ans.append(last4);
51
52            return ans.toString();
53        
54    }
55}