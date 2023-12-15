package ru.gb.Manerov.Lesson4.homework4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class Employee {
    private int idNumber;
    private ArrayList<String> phonesNumber;
    private String name;
    private int experience;

    public boolean addPhone(String phoneNumber) {
        boolean flag = false;
        if (!phonesNumber.contains(phoneNumber)) {
            phonesNumber.add(phoneNumber);
            flag = true;
        }
        return flag;
    }
}
