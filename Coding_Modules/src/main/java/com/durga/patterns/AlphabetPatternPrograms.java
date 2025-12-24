package com.durga.patterns;

import java.util.Scanner;

/**
 * @Created by DurgaNaresh on @Date 6/28/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class AlphabetPatternPrograms {
    public static void pattern1()
    {
            int alphabet = 65;
            System.out.println("** Printing the pattern1... **");
            for (int i = 0; i <= 5; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern2()
    {
            int alphabet = 65;
            System.out.println("** Printing the pattern2... **");
            for (int i = 0; i <= 5; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) alphabet + " ");
                }
                alphabet++;
                System.out.println();
            }
        }

    public static void pattern3()
    {
            System.out.println("** Printing the pattern3... **");

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j <= i - 1; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern4()
    {
            System.out.println("** Printing the pattern4... **");
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern5()
    {
            System.out.println("** Printing the pattern5... **");
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = i; j >= 0; j--)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = i; j >= 0; j--)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern6()
    {
            System.out.println("** Printing the pattern6... **");

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern7()
    {
            int alphabet = 65;
            System.out.println("** Printing the pattern7... **");
            for (int i = 0; i <= 5; i++)
            {
                for (int j = 5; j >= i; j--)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern8()
    {
            System.out.println("** Printing the pattern8... **");
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 5; j >= i; j--)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern9()
    {
            System.out.println("** Printing the pattern9... **");

            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern10()
    {
            int alphabet = 65;
            System.out.println("** Printing the pattern10... **");
            for (int i = 0; i <= 5; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) alphabet + " ");
                    alphabet++;
                }
                System.out.println();
            }
        }

    public static void pattern11()
    {
            System.out.println("** Printing the pattern11... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = i; j >= 0; j--)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern12()
    {
            System.out.println("** Printing the pattern12... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                int temp = i;
                for (int j = i; j >= 0; j--)
                {
                    System.out.print((char) (alphabet + temp) + " ");
                    temp = temp + 5;
                }
                System.out.println();
            }
        }

    public static void pattern13()
    {
            System.out.println("** Printing the pattern13... **");
            for (int i = 1; i <= 6; i++)
            {
                int alphabet = 65;
                for (int j = 6; j > i; j--)
                {
                    System.out.print(" ");
                }

                int temp = 1;
                for (int k = 1; k <= i; k++)
                {
                    System.out.print((char) (alphabet - 1 + temp) + " ");
                    temp = temp * (i - k) / (k);
                }
                System.out.println();
            }
        }

    public static void pattern14()
    {
            System.out.println("** Printing the pattern14... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                for (int k = i - 1; k >= 0; k--)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern15()
    {
            System.out.println("** Printing the pattern15... **");

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 5 - i; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern16()
    {
            System.out.println("** Printing the pattern16... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 5; j >= i; j--)
                {
                    System.out.print(" ");
                }

                for (int k = 0; k <= i; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = -1; j <= i; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 4 - i; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern17()
    {
            System.out.println("** Printing the pattern17... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = i; k <= 5; k++)
                {
                    System.out.print((char) (alphabet + k));
                }
                System.out.println();
            }
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = i; k <= 5; k++)
                {
                    System.out.print((char) (alphabet + k));
                }
                System.out.println();
            }
        }

    public static void pattern18()
    {
            System.out.println("** Printing the pattern18... **");

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = i; k <= 5; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = i; k <= 5; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }

        }

    public static void pattern19()
    {
            System.out.println("** Printing the pattern19... **");
            for (int i = 5; i >= 0; i--)
            {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = i; k <= 5; k++)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }

        }

    public static void pattern20()
    {
            System.out.println("** Printing the pattern20... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++)
                {
                    System.out.print((char) (alphabet + k));
                }
                for (int l = i - 1; l >= 0; l--)
                {
                    System.out.print((char) (alphabet + l));
                }
                System.out.println();
            }
        }

    public static void pattern21()
    {
            System.out.println("** Printing the pattern21... **");

            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 5; j > i; j--)
                {
                    System.out.print('A' + " ");
                }

                for (int k = 0; k <= i; k++)
                {
                    System.out.print((char) (alphabet + i) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern22()
    {
            System.out.println("** Printing the pattern22... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = i; j <= 5; j++)
                {
                    System.out.print((char) (alphabet + j) + " ");
                }
                for (int k = 5 - 1; k >= i; k--)
                {
                    System.out.print((char) (alphabet + k) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern23()
    {
            System.out.println("** Printing the pattern... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 5; j > i; j--)
                {
                    System.out.print(" ");
                }

                for (int k = 0; k <= i; k++)
                {
                    System.out.print((char) (alphabet + i) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern24()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the String from the user
            System.out.println("Enter the String which needs to be printed ");

            String input = scanner.nextLine();
            System.out.println("** Printing the pattern... **");

            for (int i = 1; i <= input.length(); i++)
            {
                for (int j = input.length(); j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = i * 2 - 1; k >= 1; k--)
                {
                    System.out.print(input.charAt(i - 1));
                }
                System.out.println("");
            }
        }

    public static void pattern25()
    {
            int currentRow = 1;
            int counter = 1;
            int rows = 5;
            int alphabet = 65;

            System.out.println("** Printing the pattern25... **");
            for (int i=1; i<= rows; i++)
            {
                if (i % 2 == 0)
                {
                    int reverse = currentRow + counter - 1;
                    for (int j = 0; j<i; j++)
                    {
                        System.out.print((char) (reverse + alphabet -1)+" ");
                        reverse--;
                        counter++;
                    }
                }
                else
                {
                    for (int j = 1; j<=i; j++)
                    {
                        System.out.print((char) (counter + alphabet - 1)  +" ");
                        counter++;
                    }
                }
                System.out.println();
                currentRow++;
            }
        }

    public static void pattern26()
    {
            int currentRow = 1;
            int counter = 1;
            int rows = 5;
            int alphabet = 65;

            System.out.println("** Printing the pattern26... **");

            for (int i=1; i<= rows; i++)
            {
                if (i % 2 == 0)
                {
                    for (int j = 1; j<=i; j++)
                    {
                        System.out.print((char) (counter + alphabet - 1)  +" ");
                        counter++;
                    }
                }
                else
                {
                    int reverse = currentRow + counter - 1;
                    for (int j = 0; j<i; j++)
                    {
                        System.out.print((char) (reverse + alphabet -1)+" ");
                        reverse--;
                        counter++;
                    }
                }
                System.out.println();
                currentRow++;
            }
        }

    public static void pattern27()
    {
            System.out.println("** Printing the pattern27... **");
            for (int i = 0; i < 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j < 5; j++)
                {
                    System.out.print((char) (alphabet + i+j));
                }
                System.out.println();
            }
        }

    public static void pattern28()
    {
            System.out.println("** Printing the pattern... **");
            for (int i = 0; i <= 5; i++)
            {
                int alphabet = 65;
                for (int j = 0; j < 5-i; j++)
                {
                    System.out.print((char) (alphabet + j));
                }
                for (int k = 5-i-2; k >= 0; k--)
                {
                    System.out.print((char) (alphabet + k));
                }
                System.out.println();
            }
        }

    public static void pattern29()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();

            System.out.println("## Printing the pattern29 ##");

            int alphabet = 65;

            for(int i=0;i<= rows;i++)
            {
                for(int j=0;j<=rows-i;j++)
                {
                    System.out.print((char)(alphabet+j));
                }
                for(int k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=rows-i; l>=0; l--)
                {
                    if(l!=rows)
                        System.out.print((char)(alphabet+l));
                }
                System.out.println();
            }
        }

    public static void pattern30()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern30 ##");

            int alphabet = 65;

            for(int i=0;i<= rows;i++)
            {
                for(int j=0;j<=rows-i;j++)
                {
                    System.out.print((char)(alphabet+j));
                }
                for(int k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=rows-i; l>=0; l--)
                {
                    if(l!=rows)
                        System.out.print((char)(alphabet+l));
                }
                System.out.println();
            }

            for(int i=rows-1;i>=0 ;i--)
            {
                for(int j=0;j<=rows-i;j++)
                {
                    System.out.print((char)(alphabet+j));
                }
                for(int k=1;k<=i*2-1; k++)
                {
                    System.out.print(" ");
                }
                for(int l=rows-i; l>=0; l--)
                {
                    if(l!=rows)
                        System.out.print((char)(alphabet+l));
                }
                System.out.println();
            }

        }

    public static void pattern31()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int temp = (rows * (rows - 1)) / 2;
            int alphabet = 65;

            for (int i = 1; i < rows; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print((char) (alphabet + temp - 1) + " ");
                    temp--;
                }
                System.out.println();
            }
        }

    public static void pattern32()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int temp = (rows * (rows - 1)) / 2;
            int alphabet = 65;

            for (int i = 1; i < rows; i++)
            {
                temp = temp - i;
                for (int j = 1; j <= i; j++)
                {
                    System.out.print((char) (alphabet + temp + j - 1) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern33()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int alphabet = 65;
            int k;

            for (int i = 1; i <= rows; i++)
            {
                k = i;
                for (int j = 1; j <= i; j++)
                {
                    System.out.print((char) (alphabet + k - 1) + " ");
                    k = k + rows - j;
                }
                System.out.println();
            }
        }

    public static void pattern34()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int alphabet = 65;
            int temp = 1;
            for (int i = 1; i <= rows / 2 + 1; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print((char) (alphabet + (temp * j) - 1) + " ");
                }
                System.out.println();
                temp++;
            }
            for (int i = 1; i <= rows / 2; i++)
            {
                for (int j = 1; j <= rows / 2 + 1 - i; j++)
                {
                    System.out.print((char) (alphabet + (temp * j) - 1) + " ");

                }
                System.out.println();
                temp++;
            }
        }

    public static void pattern35()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int alphabet = 65;
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    int i1 = alphabet + j * rows - (j - 1) * j / 2;
                    if (j % 2 == 0)
                        System.out.print((char) (i1 + i - j) + " ");
                    else
                        System.out.print((char) (i1 + rows - 1 - i) + " ");
                }
                System.out.println();
            }
        }

    public static void pattern36()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int alphabet = 65;
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < rows; j++)
                {
                    if (j % 2 == 0)
                        System.out.print((char) (alphabet + (rows * (j)) + i) + " ");
                    else
                        System.out.print((char) (alphabet + (rows * (j + 1)) - i - 1) + " ");
                }
                System.out.print("\n");
            }
        }

    public static void pattern37()
    {
            // Create a new Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed to in the pattern ");

            int rows = scanner.nextInt();
            System.out.println("## Printing the pattern ##");

            int alphabet = 65;
            int temp = 0;
            for (int i = rows; i >= 1; i--)
            {
                for (int j = rows; j >= i; j--)
                {
                    System.out.print((char) (alphabet + j - 1) + " ");
                    temp = j;
                }
                for (int k = rows - i + 1; k < rows; k++)
                {
                    System.out.print((char) (alphabet + temp - 1) + " ");
                }
                System.out.println();
            }
        }
}
