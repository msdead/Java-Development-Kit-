package ru.gb.Manerov.UI;

import ru.gb.Manerov.Lesson2.Seminar2Menu;
import ru.gb.Manerov.Lesson3.Seminar3Menu;
import ru.gb.Manerov.Lesson4.homework4.Homework4Menu;
import ru.gb.Manerov.lesson1.lecture1.Seminar1Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralMenu extends JFrame {
    private static final int WINDOW_HEIGHT = 200;
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    private final JButton BTN_SEMINAR_1 = new JButton("Семинар 1");
    private final JButton BTN_SEMINAR_2 = new JButton("Семинар 2");
    private final JButton BTN_SEMINAR_3 = new JButton("Семинар 3");
    private final JButton BTN_HOMEWORK_4 = new JButton("Семинар 4");

    private final JButton BTN_EXIT = new JButton("Выйти из программы");

    public void generalMenu(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Главное меню");
        setResizable(false);

        JPanel panelButton = new JPanel();
        panelButton.add(BTN_EXIT);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(3, 1));
        panelTask.add(BTN_SEMINAR_1);
        panelTask.add(BTN_SEMINAR_2);
        panelTask.add(BTN_SEMINAR_3);
        panelTask.add(BTN_HOMEWORK_4);
        add(panelTask, BorderLayout.CENTER);

        setVisible(true);

        BTN_EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        BTN_SEMINAR_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar1Menu().semMenu();
                setVisible(false);
            }
        });

        BTN_SEMINAR_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar2Menu().semMenu();
                setVisible(false);
            }
        });

        BTN_SEMINAR_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar3Menu().semMenu();
                setVisible(false);
            }
        });

        BTN_HOMEWORK_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Homework4Menu().start();
            }
        });
    }
}
