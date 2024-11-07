package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5 та 7
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть набір з символів 0 та 1: ");
        String binary = scan.nextLine();

        System.out.print("Ваш результат: " + binaryStringToInt(binary));


    }

    public static int binaryStringToInt (String s){
        try {
            int binar = Integer.parseInt(s, 2);
            return binar;

        } catch (NumberFormatException e) {
            System.out.println("Вводьте лише 1 та 0");
        }
        return 0;
    }
}