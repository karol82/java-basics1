package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {
    // modyfikatory dostępu:
    // private
    // bez wpisania to domylsny, dostęp w obrębie pakietu
    // protected dostep do klas dziedziczacych po danej klasie plus dostep w obrebie pakietu
    // public

    private String firstField;
    String firstField2;

        public void run() {
            System.out.println("FirstField = " + firstField);
            System.out.println("FirstField = " + firstField2);
            myProtectedField = "my protected field";
            myProtected();

            //System.out.println("myAbstractField = " + myAbstractField);


        }

    @Override
    protected void myAbstract() {

    }
}
