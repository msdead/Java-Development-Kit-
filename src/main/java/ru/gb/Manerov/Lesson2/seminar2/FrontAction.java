package ru.gb.Manerov.Lesson2.seminar2;

public interface FrontAction {
    void front();
    default void cofee() {
        System.out.println("Drink");
    };
}
