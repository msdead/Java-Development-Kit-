package ru.gb.Manerov.Lesson3.homework3.Exceptions;

public class MyArraysTypeException extends RuntimeException {

    public MyArraysTypeException() {
        super("Типы массивов отличаются");
    }
}
