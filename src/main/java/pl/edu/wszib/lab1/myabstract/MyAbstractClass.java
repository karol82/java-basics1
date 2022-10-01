package pl.edu.wszib.lab1.myabstract;

public abstract class MyAbstractClass {
    // klasa abstrakcyjna, nie mozna utworzyc instancji danej klasy
    protected String myProtectedField;
    protected String myProtectedField2;
    protected void myProtected() {
        System.out.println("myProtectedField = " + myProtectedField);
    }

    protected abstract void myAbstract();

}
