package org.example;

import java.util.Scanner;

public class WordsAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть речення: ");
        String text = scan.nextLine();
        checkAmount(text);
    }

    public static String[] checkAmount(String sentense){
        String[] a = sentense.split(" ");
        System.out.print("Кількість слів у реченні: " + a.length);
        return a;
    }
}
