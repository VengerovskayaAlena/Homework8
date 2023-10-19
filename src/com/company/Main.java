package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        double[] variables = {1.57d, 7.654d, 9.986d};
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.println(variables[i1]);
        }
        int[] abc = {3, 7, 4};
        for (int a = 0; a < 3; a++) {
            System.out.println(abc[a]);
        }

        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
            for (; i < 2;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.print(variables[i1]);
            for (; i1 < 2;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();
        for (int a = 0; a < 3; a++) {
            System.out.print(abc[a]);
            for (; a < 2;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(arr[i]);
            for (; i > 0;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();
        for (int i1 = 2; i1 >= 0; i1--) {
            System.out.print(variables[i1]);
            for (; i1 >0;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();
        for (int a = 2; a >= 0; a--) {
            System.out.print(abc[a]);
            for (; a >0;){
                System.out.print(", ");
                break;
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 == 1){
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i]);
            for (; i < 2;){
                System.out.print(", ");
                break;
            }
        }
    }
}
