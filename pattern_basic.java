package com.company;

import org.w3c.dom.ls.LSOutput;

import static java.util.Collections.min;

public class pattern_basic {
    public static void main(String[] args) {
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(2);
        pattern21V2(5);
        pattern22(5);
    }


    // *
    // * *
    // * * *
    // * * * *
//        int n = 4;
//        for (int row = 0; row <=4; row++) {
//            for (int column = 0; column < row; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();

    // * * * *
    // * * * *
    // * * * *
    // * * * *


//        int n = 4;
//        for (int row = 0; row <= n; row++) {
//            for (int column = 0; column <n ; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

    //  * * * *
    //  * * *
    //  * *
    //  *

//        int n = 4;
//        for (int rows = 0; rows <n ; rows++) {
//            for (int column = 4; column >rows; column--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4

//        int i = 4;
//        for (int rows = 0; rows <= i; rows++) {
//            for (int column = 1; column <=rows; column++) {
//                System.out.print(column);
//
//            }
//            System.out.println();
//        }

    // * * * *
    // * * *
    // * *
    // *

//        static  void pattern(int n){
//            for (int rows = 1; rows <=n ; rows++) {
//                for (int columns = 0; columns <n-rows+1; columns++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
//    static  void pattern(int n){
//            for (int rows = 1; rows <=n ; rows++) {
//                for (int columns = 1; columns <=n-rows+1; columns++) {
//                    System.out.print(columns + " ");
//                }
//                System.out.println();
//
//            }

    //      *
    //    * * *
    //  * * * * *
    //* * * * * * *

//    static void pattern7(int n) {
//        for (int rows = 1; rows <= n; rows++) {
//            //space loop
//            for (int space = 1; space <= n - rows; space++) {
//                System.out.print("   ");
//
//            }
//            //stars
//            for (int stars = 1; stars <= 2 * rows - 1; stars++) {
//                System.out.print(" * ");
//
//            }
//
//            //space loop
//            for (int space = 1; space <= n - rows; space++) {
//                System.out.print("   ");
//
//
//            }
//            System.out.println();
//
//
//        }
//    }

    // *  *  *  *  *  *  *  *  *
    //    *  *  *  *  *  *  *
    //       *  *  *  *  *
    //          *  *  *
    //             *

//    static void pattern8(int n){
//        for (int rows = 1; rows <= n; rows++) {
//            //space loop
//            for (int space = 1; space <= rows-1; space++) {
//                System.out.print("   ");
//
//            }
//            //stars
//            for (int stars = 1; stars <= 2*n-(2*rows-1); stars++) {
//                System.out.print(" * ");
//
//            }
//
//            //space loop
//            for (int space = 1; space <= rows-1; space++) {
//                System.out.print("   ");
//
//
//            }
//            System.out.println();
//
//
//        }
//    }


    //             *
    //          *  *  *
    //       *  *  *  *  *
    //    *  *  *  *  *  *  *
    // *  *  *  *  *  *  *  *  *
    // *  *  *  *  *  *  *  *  *
    //    *  *  *  *  *  *  *
    //       *  *  *  *  *
    //          *  *  *
    //             *

    //no need to write code. just add uper triangle and lower triangle.

    static void pattern9(int n) {

        for (int rows = 1; rows <= n; rows++) {
            //space loop
            for (int space = 1; space <= n - rows; space++) {
                System.out.print("   ");

            }
            //stars
            for (int stars = 1; stars <= 2 * rows - 1; stars++) {
                System.out.print(" * ");

            }

            //space loop
            for (int space = 1; space <= n - rows; space++) {
                System.out.print("   ");


            }
            System.out.println();


        }


        for (int rows = 1; rows <= n; rows++) {
            //space loop
            for (int space = 1; space <= rows - 1; space++) {
                System.out.print("   ");

            }
            //stars
            for (int stars = 1; stars <= 2 * n - (2 * rows - 1); stars++) {
                System.out.print(" * ");

            }

            //space loop
            for (int space = 1; space <= rows - 1; space++) {
                System.out.print("   ");


            }
            System.out.println();


        }
    }

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*

    static void pattern10(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row;
            if (row > n) {
                stars = 2 * n - row;
            }
            for (int column = 1; column <= stars; column++) {

                System.out.print("* ");
            }
            //System.out.print("* ");
            System.out.println();
        }

    }
    //1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1

    static void pattern11(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int start = 0;
            if (rows % 2 == 0) {
                start = 0;
            } else {
                start = 1;

            }
            for (int column = 1; column <= rows; column++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();

        }
    }
    //1        1
    //    12      21
    //    123    321
    //    1234  4321
    //    1234554321

    static void pattern12(int n) {
        for (int rows = 1; rows <= n; rows++) {
            //numbers
            for (int number = 1; number <= rows; number++) {
                System.out.print(number);
            }
            //spaces
            for (int space = 1; space <= 2 * n - 2 * rows; space++) {
                System.out.print(" ");

            }

            //numbers
            for (int number = rows; number >= 1; number--) {
                System.out.print(number);
            }
            System.out.println();

        }
    }
//     1
//     2 3
//     4 5 6
//     7 8 9 10
//     11 12 13 14 15

    static void pattern13(int n) {
        int count = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();


        }
    }

    // A
    //      AB
    //      ABC
    //      ABCD
    //      ABCDE

    static void pattern14(int n) {

        for (int rows = 0; rows < n; rows++) {
            for (char ch = 'A'; ch <= rows + 'A'; ch++) {
                System.out.print(ch);

            }
            System.out.println();

        }
    }
    // ABCDE
    //      ABCD
    //      ABC
    //      AB
    //      A

    static void pattern15(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (char ch = 'A'; ch <= 'A' + (n - rows - 1); ch++) {
                System.out.print(ch);

            }
            System.out.println();

        }
    }

    // A
    //     B B
    //     C C C
    //     D D D D

    static void pattern16(int n) {
        for (int rows = 0; rows < n; rows++) {
            char ch = (char) (65 + rows);
            for (int column = 0; column <= rows; column++) {
                System.out.print(ch + " ");

            }
            System.out.println();

        }

    }

    //        A
    //         A  B  A
    //      A  B  C  B  A
    //   A  B  C  D  C  B  A
    //A  B  C  D  E  D  C  B  A

    static void pattern17(int n) {
        for (int rows = 1; rows <= n; rows++) {
            //space
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print("   ");

            }
            //alphabet
            char ch = 'A';
            int breakPoint = (2 * rows) / 2;
            for (int alpha = 1; alpha <= 2 * rows - 1; alpha++) {
                System.out.print(ch + "  ");

                if (alpha < breakPoint) {
                    ch++;
                } else {
                    ch--;
                }

            }
            //spaces
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print("   ");

            }
            System.out.println();

        }
    }

    //E
    //D  E
    //C  D  E
    //B  C  D  E
    //A  B  C  D  E
    static void pattern18(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (char column = (char) (69 - (rows - 1)); column <= 'E'; column++) {
                System.out.print(column + "  ");
            }
            System.out.println();

        }
    }


    // *  *  *  *  *  *  *  *  *  *
    // *  *  *  *        *  *  *  *
    // *  *  *              *  *  *
    // *  *                    *  *
    // *                          *
    // *                          *
    // *  *                    *  *
    // *  *  *              *  *  *
    // *  *  *  *        *  *  *  *
    // *  *  *  *  *  *  *  *  *  *
    static void pattern19(int n) {
        for (int rows = 1; rows <= n; rows++) {
            //upper half star
            //star
            for (int star = 1; star <= n - (rows - 1); star++) {
                System.out.print(" * ");
            }
            //space
            for (int space = 1; space <= (2 * rows) - 2; space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= n - (rows - 1); star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {


            //lower half star
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");

            }
            //space
            for (int space = 1; space <= n * 2 - 2 * rows; space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    // *                          *
    //         *  *                    *  *
    //         *  *  *              *  *  *
    //         *  *  *  *        *  *  *  *
    //         *  *  *  *  *  *  *  *  *  *
    //         *  *  *  *        *  *  *  *
    //         *  *  *              *  *  *
    //         *  *                    *  *
    //         *                          *


    static void pattern20(int n) {
        for (int rows = 1; rows <= n; rows++) {
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");

            }
            //space
            for (int space = 1; space <= n * 2 - 2 * rows; space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
        for (int rows = 1; rows <= n - 1; rows++) {
            //upper half star
            //star
            for (int star = 1; star <= (n - 1) - (rows - 1); star++) {
                System.out.print(" * ");
            }
            //space
            for (int space = 1; space <= rows * 2; space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= (n - 1) - (rows - 1); star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

// *  *  *  *
// *        *
// *        *
// *  *  *  *

    static void pattern21(int n) {
        for (int rows = 1; rows <= n; rows++) {
            //star
            for (int star = 1; star <= n - (rows - 1); star++) {
                System.out.print(" * ");
            }
            //space
            for (int space = 1; space <= (2 * rows) - n; space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= n - (rows - 1); star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");
            }
            //space
            for (int space = 1; space <= 2 * n - (2 * rows); space++) {
                System.out.print("   ");
            }
            //star
            for (int star = 1; star <= rows; star++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }


    //        *  *  *  *  *
    //  *           *
    //   *           *
    // *           *
    //  *  *  *  *  *
    static void pattern21V2(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n; col++) {
                if (rows == 1 || col == 1 || rows == n || col == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }

    //5 5 5 5 5 5 5 5 5
    //5 4 4 4 4 4 4 4 5
    //5 4 3 3 3 3 3 4 5
    //5 4 3 2 2 2 3 4 5
    //5 4 3 2 1 2 3 4 5
    //5 4 3 2 2 2 3 4 5
    //5 4 3 3 3 3 3 4 5
    //5 4 4 4 4 4 4 4 5
    //5 5 5 5 5 5 5 5 5

    static void pattern22(int n) {
        int i, j, min;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
//loop for upper right part
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }
////loop for lower left part
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
////loop for lower right part
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();

        }
    }
}













