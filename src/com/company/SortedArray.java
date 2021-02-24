package com.company;

import java.util.Scanner;

public class SortedArray {
    private static int[] Arr;

    // write code here
    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
         Arr = new int[size];
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        return Arr;
    }

    public static void printArray() {
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Element " + i + " contents " + Arr[i]);
        }
    }

    public static void SortIntegers() {
        int temp;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] < Arr[j]) {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
    }

}
