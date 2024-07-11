package coid.juaracoding.objectstring;

import coid.juaracoding.Coba1;

public class stringExample {
    public static void main(String[] args) {
        Coba1 coba1 = new Coba1();
        Coba1 coba2 = new Coba1();
        System.out.println("Value dari coba1 adalah "+coba1);//214c265e
        System.out.println("Value dari coba1 adalah "+coba2);//448139f0
        coba2 = new Coba1();
        System.out.println("Value dari coba1 adalah "+coba2);//448139f0

        int intX = 0;
        double douX = 0;
        String strPrint = "Saya adalah seorang QA";
        System.out.println("Value dari strPrint adalah : "+strPrint);
    }
}
