package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //if, else, for, while, foreach те саме шо і на ++

        //sout
//        System.out.print("Вкажіть значення а: ");
//        int a = 10;
//        Scanner in = new Scanner(System.in); // Scanner - щоб виводити з клави
//        a = Integer.parseInt(in.nextLine());
//        System.out.println("a = " + a);
//        boolean b = false;

        while (true) {
            System.out.print("Оберіть дію:\n1. +\n2. -\n3. *\n4. /\n5. Вийти\n>> ");
            int operation = 0;
            char char_operation;
            float num1 = 0, num2 = 0, result = 0;
            Scanner in = new Scanner(System.in);
            try {
                operation = Integer.parseInt(in.nextLine());
                if (operation == 5) {
                    System.out.println("\nДо побачення!");
                    break;
                }
                System.out.print("Введіть перше значення: ");
                num1 = Float.parseFloat(new Scanner(System.in).nextLine());
//                System.out.printf("Перше значення %5.2f%n \n", num1);
                while (true) {
                    System.out.print("Введіть друге значення: ");
                    num2 = Float.parseFloat(new Scanner(System.in).nextLine());
                    if (operation == 4 && num2 == 0) {
                        System.out.println("Ділення на 0 НЕМОЖЛИВЕ!");
                        continue;
                    }
                    break;
                }

                switch (operation) {
                    case 2: {
                        char_operation = '-';
                        result = num1 - num2;
                        break;
                    }
                    case 3: {
                        char_operation = '*';
                        result = num1 * num2;
                        break;
                    }
                    case 4: {
                        char_operation = '/';
                        result = num1 / num2;
                        break;
                    }
                    default: {
                        char_operation = '+';
                        result = num1 + num2;
                        break;
                    }
                }
                System.out.println(num1 + " " + char_operation + " " + num2 + " = " + result + "\n\n");
            } catch (NumberFormatException e) {
                System.out.println("Невірна операція, спробуйте ще раз.");
                continue;
            }
        }
    }
}