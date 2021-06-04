package by.basics.line.five;

import java.util.Scanner;

public class ConvertorSeconds {
    public static void main(String[] args) {
        int time;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the value: ");
        time = in.nextInt();
        int hours = (int) (time / 3600);
        int minutes = ((int) (time / 60)) % 60;
        int seconds = time % 60;
        System.out.println(hours + "ч  " + minutes + "мин  " + seconds + "с");
    }
}


