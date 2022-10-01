package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.mypackage.MySecondClass;

public class Application {
    public static void main(String[] args) {
        MyFirstClass.myStaticField = "My Static";
        // System.out.println("Hello Byku!");  //alt enter
                                                // shift shift
        MyFirstClass myFirstClass = new MyFirstClass();
        // mozna tez tak: var myFirstClass = new MyFirstClass(); domysla sie jaka jest klasa
        myFirstClass.firstField2 = "Test";
        myFirstClass.run1();

        MySecondClass mySecondClass =new MySecondClass();
        mySecondClass.run();



    }
}
