package coid.juaracoding.array;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author ITS-NEW a.k.a. Herlina Kurnia Prasetiani
Java Developer
Created on 05/07/2024 21:19
@Last Modified 05/07/2024 21:19
Version 1.0
*/
public class arrayMultiDimensi {

    public static void main(String[] args) {
//        int intArr [] = new int[5];
//        int intArr2 [][] = new int[2][3];
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < intArr2.length; i++) {
//            for (int j = 0; j < intArr2[i].length; j++) {
////                System.out.println("Nilai intArr2 Baris ke "+i+" dan Kolom ke "+j+" adalah ");
//                System.out.print("Masukkan Nilai Baris ke "+i+" dan Kolom ke "+j+" : ");
//                intArr2[i][j] = scanner.nextInt();
//            }
//        }
//
//        for (int i = 0; i < intArr2.length; i++) {
//            for (int j = 0; j < intArr2[i].length; j++) {
//                System.out.println("Nilai intArr2 Baris ke "+i+" dan Kolom ke "+j+" adalah "+ intArr2[i][j]);
//            }
//        }
//
//        for (int i = 0; i < intArr2.length; i++) {
//            for (int j = 0; j < intArr2[i].length; j++) {
//                System.out.print("||"+ intArr2[i][j]);
//            }
//            System.out.println("||");
//        }

        int[][] angkaKu = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.print("||" + angkaKu[i][j]);
            }
            System.out.println("||");
        }
    }
}
