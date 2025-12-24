package com.durga.datastructures.leetcode;

import java.util.HashMap;

/**
 * @Created by DurgaNaresh on @Date 6/28/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class StringPrograms {

    public static int lengthOfLongestSubStringMethodOne(String s){
        if(s.length() == 0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        for(int i=0, j=0; i<s.length(); ++i){
            System.out.println("ValueOne:"+ map.containsKey(s.charAt(i)));
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
                System.out.println("ValueTwo:"+j);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
