package com.durga.patternPrograms;

import java.util.Scanner;

/**
 * @author DurgaNaresh 3/20/2024 Hard work definitely pays off. There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class AlphabetPatternPrograms {

  public static char ch;
  private static void pattern1(int size) {
    for(int i = 1; i <= size; i ++){
      ch = 'A';
      for (int j = 1; j <= i; j ++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }

  public static void pattern2(int size){
    System.out.println("Pattern 2");
    System.out.println("__________________");
    for (int i = size; i >=1; i --){
      ch = 'A';
      for(int j = 1; j <= i; j ++){
        System.out.print(ch);
        ch ++;
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.println("Please Enter the size of Pattern");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    AlphabetPatternPrograms.pattern1(size);
    AlphabetPatternPrograms.pattern2(size);
  }



}
