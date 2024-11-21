// WAJP to write a square java pattern
package Pattern;

import java.util.Scanner;

public class Patterns {
    public static void Pattern01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j >= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern03(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern04(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j > 0; j--) {
                if (j - n < i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern05(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 1; j <= 2 * n - 1; j++) {

            }
            System.out.println();
        }
    }

    public static void Pattern06(int n) {
        for (int i = 1; i <= 5; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern07(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern08(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count = 1 - count;
            }
            System.out.println();
        }
    }

    public static void Pattern09(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            count = 1 - count;
            System.out.println();
        }
    }

    public static void Pattern10(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern11(int n) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void Pattern12(int n) {
        // **********
        // *        *
        // *        *
        // *        *
        // *        *
        // *        *
        // *        *
        // *        *
        // *        *
        // **********

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    static void Pattern13(int n) {
        // *
        // **
        // * *
        // *  *
        // *   *
        // *    *
        // *     *
        // *      *
        // *       *
        // **********

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == n || j == 1 || j == i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        // **********
        // **       *
        // * *      *
        // *  *     *
        // *   *    *
        // *    *   *
        // *     *  *
        // *      * *
        // *       **
        // **********
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i==j) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        // ***************
        // **           **
        // * *         * *
        // *  *       *  *
        // *   *     *   *
        // *    *   *    *
        // *     * *     *
        // *      *      *
        // *     * *     *
        // *    *   *    *
        // *   *     *   *
        // *  *       *  *
        // * *         * *
        // **           **
        // ***************
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i==j || j == (n-i)+1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Pattern01(num);
        // Pattern02(num);
        // Pattern04(num);
        // Pattern12(num);
        // Pattern13(num);
        pattern15(num);
        sc.close();
    }
}