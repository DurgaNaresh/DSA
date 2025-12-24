package com.durga.patternPrograms;

import java.util.Scanner;

/**
 * @author DurgaNaresh 3/20/2024 Hard work definitely pays off. There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class StartPatternPrograms {

  public static void pattern1(int size){
    System.out.println("Pattern1 ");
    System.out.println("_________________________");
    for(int i = 1; i <= size; i ++){
      for (int j = 1; j <= i; j ++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern2(int size){
    System.out.println("Pattern 2");
    System.out.println("-------------------------");
    for(int i = size; i >= 1; i --){
      for (int j =1; j <= i; j ++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.println("Please Enter the size of Pattern");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    StartPatternPrograms.pattern1(size);
    StartPatternPrograms.pattern2(size);
  }

}
