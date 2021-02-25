package com.company.polymorphism;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class exercise {
    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i< arr.length; i++ ){
            if(arr[i] == 0){
                shiftArray(arr, i);
                if(arr.length>i+1) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
    }
    public static void shiftArray(int[] arr, int current) {
        for(int i = arr.length-1 ; i>current ; i--){
            arr[i] = arr[i-1];
        }

    }
    public static void duplicateZeros2(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (arr[i] == 0)
                queue.add(arr[i]);
            arr[i] = queue.remove();
        }
    }

        public static void main (String[]args){
            int arr[] = {1,0,2,3,0,4,5,0};
            duplicateZeros2(arr);
            System.out.println(Arrays.toString(arr));


        }

    public static class Array {

       private static void reverse(int Arr[]) {
           int arr[] = new int[Arr.length];
           int maxIndex = Arr.length-1;
           for (int i=0; i<=maxIndex/2; i++) {
              int temp = Arr[i];
              Arr[i] = Arr[maxIndex-i];
               Arr[maxIndex-i]= temp;
           }


       }
        public static void main(String[] args) {
          int arr[] = {1,2,3,4,5,7};
            reverse(arr);
            System.out.println(Arrays.toString(arr));

        }
    }
}

