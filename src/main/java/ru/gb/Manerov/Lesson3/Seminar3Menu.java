package ru.gb.Manerov.Lesson3;

import ru.gb.Manerov.Lesson3.Seminar3.Seminar3;
import ru.gb.Manerov.Lesson3.homework3.Task2.ProgramCalc;
import ru.gb.Manerov.Lesson3.homework3.Task3.Task3;
import ru.gb.Manerov.Lesson3.homework3.Task4.Task4;
import ru.gb.Manerov.UI.GeneralMenu;
import ru.gb.Manerov.UI.InterSeminarMenu;

import javax.swing.*;
import java.awt.*;

public class Seminar3Menu extends JFrame implements InterSeminarMenu {
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    private final JButton BTN_SEMINAR_3 = new JButton("Задача 1");
    private final JButton BTN_HOMEWORK_3_2 = new JButton("Задача 2");
    private final JButton BTN_HOMEWORK_3_3 = new JButton("Задача 3");
    private final JButton BTN_HOMEWORK_3_4 = new JButton("Задача 4");
    private final JButton BTN_BACK = new JButton("Вернуться в главное меню");
    private final JButton BTN_EXIT = new JButton("Выход из программы");

    @Override
    public void semMenu() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Семинар 1. Меню");
        setResizable(false);

        JPanel panelButton = new JPanel(new GridLayout(1, 2));
        panelButton.add(BTN_BACK);
        panelButton.add(BTN_EXIT);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(4, 1));
        panelTask.add(BTN_SEMINAR_3);
        panelTask.add(BTN_HOMEWORK_3_2);
        panelTask.add(BTN_HOMEWORK_3_3);
        panelTask.add(BTN_HOMEWORK_3_4);
        add(panelTask, BorderLayout.CENTER);
        setVisible(true);

        BTN_EXIT.addActionListener(e -> System.exit(0));

        BTN_BACK.addActionListener(e -> {
            new GeneralMenu().generalMenu();
            setVisible(false);
        });

        BTN_SEMINAR_3.addActionListener(e -> {
            new Seminar3().sem3();
        });

        BTN_HOMEWORK_3_2.addActionListener(e -> {
            new ProgramCalc().programCalc();
        });

        BTN_HOMEWORK_3_3.addActionListener(e -> {
            new Task3().task3();
        });

        BTN_HOMEWORK_3_4.addActionListener(e -> {
            new Task4().task4();
        });
    }
}
