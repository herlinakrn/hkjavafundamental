package coid.juaracoding.array;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author ITS-NEW a.k.a. Herlina Kurnia Prasetiani
Java Developer
Created on 05/07/2024 20:45
@Last Modified 05/07/2024 20:45
Version 1.0
*/
public class obArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArray[] = {3, 6, 3, 1, 6, 3, 4, 1};

        System.out.print("Masukkan Panjang Array : ");
        int arrLength = scanner.nextInt();
        int intArr1 [] = new int[arrLength];
        for (int i = 0; i < intArr1.length; i++) {
            System.out.print("Masukkan nilai intArr index ke "+i+" : ");
            intArr1[i] = scanner.nextInt();
        }
//        intArr1[0] = scanner.nextInt();
//        intArr1[1] = scanner.nextInt();
//        intArr1[2] = scanner.nextInt();
//        intArr1[3] = scanner.nextInt();
//        intArr1[4] = scanner.nextInt();
//
        for (int i = 0; i < intArr1.length; i++) {
            System.out.println("Nilai dari intArr1 index ke "+i+" adalah -> "+intArr1[i]);
        }
    }


}
