package com.durga.patternPrograms;

import java.util.Scanner;

/**
 * @author DurgaNaresh 3/20/2024 Hard work definitely pays off. There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class NumericPatternPrograms {

  public static void pattern1(int size){
    for(int i = 1; i <= size; i ++){
      for (int j =1; j <= i; j ++){
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void pattern2(int size){
    System.out.println("Pattern 2");
    System.out.println("---------------------");
    for (int i = size; i >= 1; i --){
      for (int j = 1; j <= i; j ++){
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter the Size of pattern");
    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt();
    NumericPatternPrograms.pattern1(size);
    NumericPatternPrograms.pattern2(size);
  }

}
