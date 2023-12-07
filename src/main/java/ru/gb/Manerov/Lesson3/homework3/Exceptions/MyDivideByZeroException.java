package ru.gb.Manerov.Lesson3.homework3.Exceptions;

public class MyDivideByZeroException extends ArithmeticException {

    public MyDivideByZeroException() {
        super("На ноль делить нельзя");
    }

}
