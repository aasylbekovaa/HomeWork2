package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(asema(23,12));
        System.out.println(asema(13,18));
        System.out.println(asema(14,20));
        System.out.println(asema(67,35));
        System.out.println(asema(44,28));
    }

    public static String asema(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature > -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return ("можно идти гулять");
        } else {
            return "оставайтесь дома";
        }

    }
}