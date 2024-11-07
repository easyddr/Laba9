package org.example;

public class Binary {
    public static void main(String[] args) {
        long num = 10101;
        int decimal = binaryStringToInt(num);

        System.out.println(num + " в звичайній системі числення: " + decimal);
    }

    public static int binaryStringToInt(long num) {
        int number = 0;
        int a = 0;
        long temp;

        while (num != 0) {
            temp = num % 10;
            num /= 10;
            number += (int) (temp * Math.pow(2, a));
            a++;
        }
        return number;
    }
}
