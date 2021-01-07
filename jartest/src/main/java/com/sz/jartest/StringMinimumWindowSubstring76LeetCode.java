package com.sz.jartest;

import java.util.HashMap;

public class StringMinimumWindowSubstring76LeetCode {
    public static String minWindow(String s, String t) {
        //设置flag ，是为了排除s=a,t=aa的情况
        boolean flag= false;
        int left = 0;
        int lengthOfMin = s.length();
        int minLeft=0;
        int minRight=0;
        HashMap<Character,Integer> hashMap = new HashMap();
        int cnt=0;
        //遍历T串
        for (char c : t.toCharArray())
            hashMap.put( c, hashMap.containsKey(c) ? hashMap.get(c)+1 : 1);
        //遍历S串
        for (int right=0;right<s.length();right++){
            char temp = s.charAt(right);
            if (hashMap.containsKey(temp)){
                cnt =hashMap.get(temp) > 0 ? cnt+1 : cnt;
                hashMap.put(temp,hashMap.get(temp)-1);
            }
            while (cnt==t.length()){
                flag=true;
                if(right-left+1<=lengthOfMin){
                    lengthOfMin = right-left+1;
                    minLeft = left;
                    minRight = right;
                }
                char c = s.charAt(left);
                if (hashMap.containsKey(c)){
                    if (hashMap.get(c)+1>0) cnt--;
                    hashMap.put(c,hashMap.get(c)+1);
                }
                left++;
            }
        }
        if (!flag)return "";
        return s.substring(minLeft,minRight+1);
    }
    public static void main(String[] args) {
        String s ="ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}