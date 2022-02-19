package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int year = 2079;
        int leapYear = checkYear(year);

        // Задача 2
        int clientDvOs = 1;
        int clientDeviceYear = 2023;
        String clientOs = getClientOS(clientDvOs, clientDeviceYear);
        System.out.println(clientOs);

        // Задача 3
        int deliveryDistance = 50;
        int days = getDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + days);

        // Задача 4
        String param = "aabccddefgghiijjkk";
        checkDouble(param);

        // Задача 5
        int[] mass1 = new int[]{3, 2, 1, 6, 5};
        reverseMass(mass1);
        System.out.print(Arrays.toString(mass1));


    }

    // Задача 1
    public static int checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            return year;
        } else {
            System.out.println(year + " год является не високосным");
        }
        return year;
    }

    // Задача 2
    public static String getClientOS(int clientDvOs, int clientDeviceYear) {
        String osName = "Android";
        String yearVersion = "Вам нужно установить обычную версию";
        int currentYear = LocalDate.now().getYear();
        if (clientDvOs == 0) {
            osName = "iOS";
        }
        if (clientDeviceYear == 1) {
            osName = "Android";
        }
        if (clientDeviceYear < currentYear) {
            yearVersion = "Вам нужно установить lite-версию";
        }
        return yearVersion + " для " + osName;
    }

    // Задача 3
    public static int getDistance(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        return days;
    }


    // Задача 4
    public static void checkDouble(String param) {
        int check = 0;
        for (int i = 0; i < param.length() - 1; i++) {
            if (param.charAt(i) == param.charAt(i + 1)) {
                System.out.println("Дубль - " + param.charAt(i));
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Дублей нет");
        }
    }

    // Задача 5
    public static int[] reverseMass(int[] mass1) {
        int Temp;
        for (int i = 0; i <= (mass1.length) / 2; i++) {
            Temp = mass1[mass1.length - i - 1];
            mass1[mass1.length - i - 1] = mass1[i];
            mass1[i] = Temp;
        }
        return mass1;
    }

}
