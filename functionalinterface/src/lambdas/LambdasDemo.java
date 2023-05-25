package lambdas;

import java.sql.SQLOutput;

public class LambdasDemo {
    public static void print(String message) {

    }


    public static void show() {
        greet(message -> System.out.println(message + " aasdasd"));


    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
