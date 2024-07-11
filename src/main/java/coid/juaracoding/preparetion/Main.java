package coid.juaracoding.preparetion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int modelYear;
    String modelName;

    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Main myCar = new Main (1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
}