package Step_01_Learn_the_basic.Lec_02_Build_up_Logical_Thinking;

//import java.util.Scanner;

/*

Patterns:
- To print pattern we always we nested loops.
- Somehow connect the rows to the columns by forming a logic.
- Observe symmetry in the pattern or check if a pattern is a combination of
  two or more similar patterns.

 */

public class Patterns {

    // Pattern 1:
    // Input: num = 3
    // Output:
    // * * *
    // * * *
    // * * *
    static void pattern1(int num) {
        for (int row = 0; row < num; row++) { // Outer loop for rows
            for (int col = 0; col < num; col++) { // Inner loop for columns
                System.out.print("*"); // Print a single star
            }
            System.out.println(); // Move to the next line after each row
        }

        // Two pointer approach
        System.out.println("Two pointer approach:");
        int rows = 4;
        int cols = 4;

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    // Pattern 2:
    // Input: num = 3
    // Output:
    // *
    // * *
    // * * *
    static void pattern2(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3:
    // Input: num = 3
    // Output:
    // 1
    // 1 2
    // 1 2 3
    static void pattern3(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4:
    // Input: num = 3
    // Output:
    // 1
    // 2 2
    // 3 3 3
    static void pattern4(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    // Pattern 5:
    // Input: num = 5
    // Output:
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern5(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 6:
    // Input: num = 4
    // Output:
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    static void pattern6(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // Pattern 7:
    // Input: num = 5
    // Output:
    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    static void pattern7(int num) {
        for (int row = 0; row < num; row++) {
            for (int colSpace = 0; colSpace < num - row - 1; colSpace++) {
                System.out.print("  ");
            }

            for (int colStar = 0; colStar < 2 * row + 1; colStar++) {
                System.out.print("* ");
            }

            for (int colSpace = 0; colSpace < num - row - 1; colSpace++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    // Pattern 8:
    // Input: num = 5
    // Output:
    // * * * * * * * * *
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *
    static void pattern8(int num) {
        for (int row = 0; row < num; row++) {
            for (int colSpace = 0; colSpace < row; colSpace++) {
                System.out.print("  ");
            }

            for (int colStar = 0; colStar < num * 2 - (row * 2 + 1); colStar++) {
                System.out.print("* ");
            }

            for (int colSpace = 0; colSpace < row; colSpace++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    // Pattern 9:
    // Input: num = 5
    // Output:
    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    // * * * * * * * * *
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *
    static void pattern9Upper(int num) {
        for (int row = 0; row < num; row++) {
            for (int upperColSpace = 0; upperColSpace < num - row - 1; upperColSpace++) {
                System.out.print("  ");
            }
            for (int upperColStar = 0; upperColStar < row * 2 + 1; upperColStar++) {
                System.out.print("* ");
            }
            for (int upperColSpace = 0; upperColSpace < num - row - 1; upperColSpace++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern9Lower(int num) {
        for (int row = 0; row < num; row++) {
            for (int lowerSpace = 0; lowerSpace < row; lowerSpace++) {
                System.out.print("  ");
            }
            for (int lowerStar = 0; lowerStar < num * 2 - (row * 2 + 1); lowerStar++) {
                System.out.print("* ");
            }
            for (int lowerSpace = 0; lowerSpace < row; lowerSpace++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Pattern 10:
    // Input: num = 5
    // Output:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    //    1 = 1
    //    2 = 3
    //    3 = 5
    //    4 = 7
    //    5 = 9
    //    6 = 11
    static void pattern10(int num) {
        for (int row = 1; row <= num * 2 - 1; row++) {
            int stars = row;

            if (row > num) stars = 2 * num - row;

            for (int col = 1; col <= stars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of test cases:");
//        int test = sc.nextInt();
//
//        for (int i = 0; i < test; i++) {
//            System.out.println("Enter the number:");
//            int num = sc.nextInt();
//
//            pattern1(num); // Pattern1 -> Rectangular Start Pattern
//        }
//
//        sc.close();

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9Upper(5);
//        pattern9Lower(5);
        pattern10(5);
    }
}
