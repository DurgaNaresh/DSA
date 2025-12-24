package com.durga.datastructures.leetcode;

import java.util.*;

/**
 * @Created by DurgaNaresh on @Date 6/27/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ArrayPrograms {
    public static void twoSumMethod1(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method1:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index+1 ;
                result[1] = i+1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        System.out.println("Output is:"+Arrays.toString(result));
    }

    public static int[] twoSumMethod2(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method2:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            Integer diff = target - numbers[i];
            if(hash.containsKey(diff)){
                return new int[]{hash.get(diff)+1, i+1};
            }
            hash.put(numbers[i], i);
        }
        return null;
    }

    public static int[] twoSumMethod3(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method3:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i]))
                return new int[] {map.get(target - numbers[i]) + 1, i + 1};
            else map.put(numbers[i], i);
        }
        return null;
    }

    public static void twoSumMethod4(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method4:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        //Copy the original array and sort it
        int N = numbers.length;
        int[] sorted = new int[N];
        System.arraycopy(numbers, 0, sorted, 0, N);
        Arrays.sort(sorted);
        //find the two numbers using the sorted arrays
        int first = 0;
        int second = sorted.length - 1;
        while(first < second){
            if(sorted[first] + sorted[second] < target){
                first++;
            }
            else if(sorted[first] + sorted[second] > target){
                second--;
            }
            else break;
        }
        int number1 = sorted[first];
        int number2 = sorted[second];
        //Find the two indexes in the original array
        int index1 = -1, index2 = -1;
        for(int i = 0; i < N; i++){
            if((numbers[i] == number1) || (numbers[i] == number2)){
                if(index1 == -1)
                    index1 = i + 1;
                else
                    index2 = i + 1;
            }

        }
        int [] result = new int[]{index1, index2};
        Arrays.sort(result);
        System.out.println("Output is:"+Arrays.toString(result));
    }


    public static void twoSumMethod5(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method5:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                }
            }
        }
        System.out.println("Output is:"+Arrays.toString(ret));
    }

    public static void twoSumMethod6(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method6:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length == 0) {
            return;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            map.putIfAbsent(numbers[i], new ArrayList<>());
            map.get(numbers[i]).add(i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int toFind = target - numbers[i];
            if (map.containsKey(toFind)) {
                for (int j : map.get(toFind)) {
                    if (i != j && !set.contains(numbers[i]) && !set.contains(numbers[j])) {
                        result.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[j])));
                        set.add(numbers[i]);
                        set.add(numbers[j]);
                    }
                }
            }
        }
        System.out.println("Output is:"+ result);

    }

    public static int twoSumMethod7(int[] numbers, int target) {
        System.out.println("Program For twoSum of the Array Method7:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;
        int count = 0;
        while (start < end) {
            if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                count++;
                start++;
                end--;
                while (start < end && numbers[start] == numbers[start - 1]) {
                    start++;
                }
                while (start < end && numbers[end] == numbers[end + 1]) {
                    end--;
                }
            }
        }
        return count;
    }

    public static void MedianOfTwoSortedArraysMethod1(int[] numbers, int target) {
        System.out.println("Program For MedianOfTwoSortedArrays Method1:");
        System.out.println("Input Array:"+Arrays.toString(numbers)+","+"Target is:"+target);
        if (numbers == null || numbers.length == 0) {
            return;
        }
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;
        int count = 0;
        while (start < end) {
            if (start > 0 && numbers[start] == numbers[start - 1]) {
                start++;
                continue;
            }
            if (end < numbers.length - 1 && numbers[end] == numbers[end + 1]) {
                end--;
                continue;
            }
            if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                count++;
                start++;
            }
        }
    }


}
