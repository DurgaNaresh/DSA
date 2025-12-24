package com.durga.datastructures.geeksforgeeks;

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
        ArrayPrograms.rotateLeftMethod1(Constants.array,2);
        ArrayPrograms.rotateLeftMethod2(Constants.array,3);
        ArrayPrograms.rotateRightMethod1(Constants.array,2);
        ArrayPrograms.rotateRightMethod2(Constants.array,2);
        ArrayPrograms.rotateArrayRotateOneByOne(Constants.array);
        ArrayPrograms.leftRotateUsingJugglingAlgorithm(Constants.array,2,7);
        ArrayPrograms.leftRotateReversalAlgorithm(Constants.array,3);
        ArrayPrograms.leftRotateUsingBlockSwapAlgorithmRecursiveImplementation(Constants.array,2, 7);
        ArrayPrograms.leftRotateUsingBlockSwapAlgorithmIterativeImplementation(2);
        ArrayPrograms.cyclicallyRotateAnArrayMethod1(Constants.array);
        ArrayPrograms.cyclicallyRotateAnArrayMethod2(Constants.array);
        System.out.println(ArrayPrograms.searchAnElementSortedRotatedArrayMethod1
                (Constants.array,3,Constants.array.length));
        System.out.println("Program For Search an element in a sorted and rotated array Method2");
        System.out.println("Input Array:"+ Arrays.toString(Constants.array));
        System.out.println(ArrayPrograms.searchElementSortedAndRotatedArrayMethod2
                (Constants.array,0,Constants.array.length-1,3));
        System.out.println(ArrayPrograms.pairInSortedRotatedMethod1(Constants.array,Constants.array.length,13));
        System.out.println(ArrayPrograms.pairsInSortedRotatedMethod2(Constants.array,Constants.array.length,13));
        ArrayPrograms.maxSum(Constants.array);
        ArrayPrograms.MaximumSumAmongAllRotationsGivenArrayMethod1(Constants.arrayOne,Constants.arrayOne.length);
        ArrayPrograms.MaximumSumAmongAllRotationsGivenArrayMethod2(Constants.arrayOne,Constants.arrayOne.length);
        ArrayPrograms.MaximumSumAmongAllRotationsGivenArrayMethod3(Constants.arrayOne,Constants.arrayOne.length);
        ArrayPrograms.countRotationsMethod1(Constants.arrayOne,Constants.arrayOne.length);
        System.out.println(ArrayPrograms.countRotationsMethod2(Constants.arrayOne,0,Constants.arrayOne.length-1));
        System.out.println(ArrayPrograms.countRotationsMethod3(Constants.arrayOne,Constants.arrayOne.length-1));

    }
}
