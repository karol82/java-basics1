package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface { //implements by zaimplementowac interface

    // modyfikatory dostępu:
    // private
    // bez wpisania to domylsny, dostęp w obrębie pakietu
    // protected dostep do klas dziedziczacych po danej klasie plus dostep w obrebie pakietu
    // public
    public static String myStaticField;
    private String firstField;
    String firstField2;
    @Override
    public void run1() {
        System.out.println("FirstField = " + firstField);
        System.out.println("FirstField2 = " + firstField2);

    @Override
            public void run2(){

        }
    }

}
