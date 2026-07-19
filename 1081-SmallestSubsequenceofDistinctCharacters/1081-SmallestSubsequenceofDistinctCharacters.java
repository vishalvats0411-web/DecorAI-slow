// Last updated: 19/07/2026, 16:35:57
1class Solution {
2    public String smallestSubsequence(String s) {
3
4        int n = s.length();
5
6        int[] lastIdx = new int[26];
7
8        for (int i = 0; i < n; i++) {
9            lastIdx[s.charAt(i) - 'a'] = i;
10        }
11
12        boolean[] visited = new boolean[26];
13        Stack<Character> st = new Stack<>();
14
15        for (int i = 0; i < n; i++) {
16
17            char ch = s.charAt(i);
18
19            if (visited[ch - 'a'])
20                continue;
21
22            while (!st.isEmpty()
23                    && st.peek() > ch
24                    && lastIdx[st.peek() - 'a'] > i) {
25
26                visited[st.pop() - 'a'] = false;
27            }
28
29            st.push(ch);
30            visited[ch - 'a'] = true;
31        }
32
33        StringBuilder sb = new StringBuilder();
34
35        while (!st.isEmpty()) {
36            sb.append(st.pop());
37        }
38
39        return sb.reverse().toString();
40    }
41}