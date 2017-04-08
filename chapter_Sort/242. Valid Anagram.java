/*
    先判断两个字符串长度是否相等,不相等返回false
    因为题意里说明字符串都是小写字母 新建一个长度为26的数组
    对s里的字母数量进行统计,并存入h的相应位置(每检测到一个 h对应位+1)
    对t里的字母数量进行统计,并存入h的相应位置(每检测到一个 h对应位-1)
    对h进行判断
    如果s和t互为anagram,h的各位都应为0
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] h = new int[26];
        for(int i = 0; i < s.length(); i++) {
            h[s.charAt(i) - 'a']++;
            h[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < h.length; i++) {
            if(h[i] != 0)
            return false;
        }
        return true;
    }
}