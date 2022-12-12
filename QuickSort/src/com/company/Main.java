package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(15);
        quickSort(myArray, 0, 14);
        printArray(myArray);
    }
    //4534 434 2 35 2 354 56 7 46 9 1 1 111 3 25436
    //15 14 13 12 11 10 9 8 7 6 5 4 3 2 1

    public static void quickSort(int[] array, int first, int last) {
        int i = first, j = last, pivote = array[(first + last) / 2], auxiliar;

        do {
            while (array[i] < pivote) i++;
            System.out.println("--------i: "+i);
            while (array[j] > pivote) j--;
            System.out.println("--------j: "+j+"\n");

            if (i <= j) {
                auxiliar = array[j];
                array[j] = array[i];
                array[i] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);

        if (first < j) {
            System.out.println(first+"<"+j);
            quickSort(array, first, j);
        }

        if (last > i) {
            System.out.println(last+">"+i);
            quickSort(array, i, last);
        }
    }
    public static int[] getIntegers(int n){
        int [] array = new int[n];
        for (int x=0;x<n;x++){
            array[x]= sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int x:array) {
            System.out.println(x);
        }
    }
}
