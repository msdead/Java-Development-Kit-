package ru.gb.Manerov.Lesson2;

import ru.gb.Manerov.Lesson2.lecture2.MainWindow;
import ru.gb.Manerov.Lesson2.seminar2.Homework2;
import ru.gb.Manerov.UI.GeneralMenu;
import ru.gb.Manerov.UI.InterSeminarMenu;

import javax.swing.*;
import java.awt.*;

public class Seminar2Menu extends JFrame implements InterSeminarMenu {
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    private final JButton BTN_SEMINAR_2 = new JButton("Семинар 2");
    private final JButton BTN_HOMEWORK_2 = new JButton("Домашняя работа 2");
    private final JButton BTN_BACK = new JButton("Вернуться в главное меню");
    private final JButton BTN_EXIT = new JButton("Выход из программы");

    @Override
    public void semMenu (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Семинар 2. Меню");
        setResizable(false);

        JPanel panelButton = new JPanel(new GridLayout(1, 2));
        panelButton.add(BTN_BACK);
        panelButton.add(BTN_EXIT);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(2, 1));
        panelTask.add(BTN_SEMINAR_2);
        panelTask.add(BTN_HOMEWORK_2);
        add(panelTask, BorderLayout.CENTER);
        setVisible(true);

        BTN_EXIT.addActionListener(e -> System.exit(0));

        BTN_BACK.addActionListener(e -> {
            new GeneralMenu().generalMenu();
            setVisible(false);
        });

        BTN_SEMINAR_2.addActionListener(e -> {
            new MainWindow();
            setVisible(false);
        });

        BTN_HOMEWORK_2.addActionListener(e -> {
            new Homework2().homework2();
        });
    }
}
