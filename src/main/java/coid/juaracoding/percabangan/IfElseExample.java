package coid.juaracoding.percabangan;

public class IfElseExample {
    public static void main(String[] args) {
        int intNum = 2;
        int intX = 0;

        int x = 20;
        if(x%2 == 0 ){
            if(x/100 !=0)
                System.out.println(x+" Genap lebih dari seratus");
        } else{
            if(x/10 !=0)
                System.out.println(x+" Genap Lebih dari sepuluh");
        }

    }
}
