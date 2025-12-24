package com.durga.datastructures.leetcode;

import java.util.Arrays;

/**
 * @Created by DurgaNaresh on @Date 6/27/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ArrayProgramsMain {
    public static void main(String[] args) {
        ArrayPrograms.twoSumMethod1(Constants.numbers,9);
        System.out.println("OutPut is:" + Arrays.toString(ArrayPrograms.twoSumMethod2
                (Constants.numbers, 13)));
        System.out.println("OutPut is:" + Arrays.toString(ArrayPrograms.twoSumMethod3
                (Constants.numbers, 26)));
        ArrayPrograms.twoSumMethod4(Constants.numbers,13);
        ArrayPrograms.twoSumMethod5(Constants.numbers,13);
        ArrayPrograms.twoSumMethod6(Constants.numbers,13);
        System.out.println("OutPut is:" + ArrayPrograms.twoSumMethod7(Constants.numbers,15
        ));
    }
}
