package ru.gb.Manerov.Lesson3.homework3.Task3;

public class Task3 {
    private final ArraysComporator ARRAYS_COMPORATOR = new ArraysComporator();
    private Integer[] array1;
    private Integer[] array2;

    public void task3() {

        array1 = new Integer[]{1, 2, 3, 4, 5};
        array2 = new Integer[]{1, 2, 3, 4, 5};

        System.out.println(ARRAYS_COMPORATOR.compareArrays(array1, array2));
    }
}
