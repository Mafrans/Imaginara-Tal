package me.mafrans.imaginaratal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComplexDouble a = new ComplexDouble(3, 2);
        ComplexDouble b = new ComplexDouble(4, 1);
        ComplexDouble c = ComplexDouble.add(a, b);
        ComplexDouble d = ComplexDouble.mult(a, b);



        printlns(a, b, c, d);
    }

    public static void printlns(Object... objs) {
        for(Object obj : objs) {
            System.out.println(obj.toString());
        }
    }
}
