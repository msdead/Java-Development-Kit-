package ru.gb.Manerov.Lesson3.Seminar3;

public class Seminar3 {
    public void sem3() {

        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 29384759823476L;
        MyList<Number> myList = new MyList<>(numArray);
        myList.printList();

        for (Number number :
                myList) {
            System.out.println(number);
        }
    }

}
