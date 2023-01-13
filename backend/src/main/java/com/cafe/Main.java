package com.cafe;

import java.util.Scanner;

public class Main {
    public static int [] sortZero(int n, int[] arr){
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<n){
            arr[j]=0;
            j++;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(arr.length);
        for (int x : sortZero(n, arr)) {
            System.out.println(x);
        }

    }
}
