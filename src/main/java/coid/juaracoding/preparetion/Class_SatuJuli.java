package coid.juaracoding.preparetion;

public class Class_SatuJuli {
    public static void main(String[] args) {
//        int intX = Integer.parseInt(args[0]);//4
//        int intY = 11+intX;int intZ ; // ini DEKLARASI VARIABEL
//
//        intZ = 10; // ini INISIALISASI VARIABEL
//
//        int intA = 10; // ini DEKLARASI + INISIALISASI VARIABLE
//
//        int intB = 7*4;

        Cobaan cobaan = new Cobaan();//10
        System.out.println("nilai cobaan saat ini "+cobaan);

        Cobaan cobaan1 = cobaan;//10
        System.out.println("nilai cobaan1 saat ini "+cobaan1);

        cobaan1 = new Cobaan();//40
        System.out.println("nilai cobaan saat ini "+cobaan);//40
        System.out.println("nilai cobaan1 saat ini "+cobaan1);//10
    }
}
