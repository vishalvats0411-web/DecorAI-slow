// Last updated: 08/08/2026, 08:37:11
1class Solution {
2    public boolean isPalindrome(int x) {
3        String st=Integer.toString(x);
4        for(int i=0;i<st.length()/2;i++)
5        {
6            if(st.charAt(i)!=st.charAt(st.length()-1-i)) return false;
7        }
8        return true;
9    }
10}