package by.basics.cycles.eight;

import java.util.Scanner;

public class SearchNumbers {
    int twoNumber = 0;
    int oneNumber = 0;
    boolean one = false;
    boolean two = false;
    boolean three = false;
    boolean four = false;
    boolean five = false;
    boolean six = false;
    boolean seven = false;
    boolean eight = false;
    boolean nine = false;
    boolean zero = false;


    public static void main(String[] args) {
        SearchNumbers obj = new SearchNumbers ();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number one");
        obj.oneNumber = input.nextInt();
        System.out.println("Enter number two");
        obj.twoNumber = input.nextInt();
        if (obj.oneNumber < obj.twoNumber) {
            int temp = obj.oneNumber;
            obj.oneNumber = obj.twoNumber;
            obj.twoNumber = temp;
        }

        obj.bustOneNumber((double)obj.oneNumber);
    }



    void bustOneNumber(double i) {
        while ((int)i != 0) {
            int a;
            a = (int) i % 10;
            i = (int)i / 10;
            comparisonOneNumberWithTwoNumber(a,twoNumber);
        }
    }

    void comparisonOneNumberWithTwoNumber (int a, double j) {
        while ((int)j != 0) {
            int b;
            b = (int) j % 10;
            j = (int)j / 10;
            if (a == b) {
                switch (a) {
                    case 0:
                        if (zero == false) {
                            System.out.print(" 0 ");
                            zero = true;
                        }
                        break;
                    case 1:
                        if (one == false) {
                            System.out.print(" 1 ");
                            one = true;
                        }
                        break;
                    case 2:
                        if (two == false) {
                            System.out.print(" 2 ");
                            two = true;
                        }
                        break;
                    case 3:
                        if (three == false) {
                            System.out.print(" 3 ");
                            three = true;
                        }
                        break;
                    case 4:
                        if (four == false) {
                            System.out.print(" 4 ");
                            four = true;
                        }
                        break;
                    case 5:
                        if (five == false) {
                            System.out.print(" 5 ");
                            five = true;
                        }
                        break;
                    case 6:
                        if (six == false) {
                            System.out.print(" 6 ");
                            six = true;
                        }
                        break;
                    case 7:
                        if (seven == false) {
                            System.out.print(" 7 ");
                            seven = true;
                        }
                        break;
                    case 8:
                        if (eight == false) {
                            System.out.print(" 8 ");
                            eight = true;
                        }
                        break;
                    case 9:
                        if (nine == false) {
                            System.out.print(" 9 ");
                            nine = true;
                        }
                        break;
                }
            }
        }
    }
}
