package com.durga.datastructures.geeksforgeeks;

/**
 * @Created by DurgaNaresh on @Date 6/27/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ArrayProgramsMainOne {
    public static void main(String[] args) {
        ArrayPrograms.multipleLeftRotationsAnArrayMethod1(Constants.A, Constants.A.length, 2);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod1(Constants.A, Constants.A.length, 3);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod1(Constants.A, Constants.A.length, 4);
        ArrayPrograms.preprocess(Constants.A, Constants.A.length, Constants.temp);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod2(Constants.A.length, 2);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod2(Constants.A.length, 3);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod2(Constants.A.length, 4);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod3(Constants.A, Constants.A.length, 2);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod3(Constants.A, Constants.A.length, 3);
        ArrayPrograms.multipleLeftRotationsAnArrayMethod3(Constants.A, Constants.A.length, 4);
        System.out.println(ArrayPrograms.findMinimumElementSortedAndRotatedArrayMethod1
                (Constants.arrayTwo,0,Constants.arrayTwo.length-1));
        System.out.println(ArrayPrograms.findMinimumElementSortedAndRotatedArrayMethod2
                (Constants.arrayTwo,0,Constants.arrayTwo.length-1));
        ArrayPrograms.reversalAlgorithmRightRotationArray(Constants.arrayThree,Constants.arrayThree.length,3);
        System.out.println(ArrayPrograms.maxHammingMethod1(Constants.arrayTwo,Constants.arrayTwo.length));
        System.out.println(ArrayPrograms.maxHammingMethod2(Constants.arrayTwo,Constants.arrayTwo.length));
        ArrayPrograms.wrapper(Constants.array, Constants.array.length);
        ArrayPrograms.leftRotationArrayOnTimeAndO1SpaceMethod1(Constants.array.length);
        ArrayPrograms.leftRotationArrayOnTimeAndO1SpaceMethod2(Constants.arrayFour.length);
        System.out.println(ArrayPrograms.findElementGivenIndexAfterNumberOfRotations(Constants.array, Constants.ranges,
                Constants.rotations, Constants.index));
        ArrayPrograms.splitArrayAndAddFirstPartEndMethod1(Constants.arrayThree,Constants.arrayThree.length,2);
        ArrayPrograms.splitArrayAndAddFirstPartEndMethod2(Constants.arrayThree,Constants.arrayThree.length,2);
    }
}
