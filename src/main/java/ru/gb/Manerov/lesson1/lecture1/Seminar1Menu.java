package ru.gb.Manerov.lesson1.lecture1;

import ru.gb.Manerov.UI.InterSeminarMenu;
import ru.gb.Manerov.lesson1.lecture1.Chat.Chat;
import ru.gb.Manerov.lesson1.lecture1.ServerRun.ServerRun;
import ru.gb.Manerov.lesson1.lecture1.TicTacToe.GameWindow;
import ru.gb.Manerov.UI.GeneralMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seminar1Menu extends JFrame implements InterSeminarMenu {
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    JButton btnTicTacToe = new JButton("Запустить TicTacToe");
    JButton btnChat = new JButton("Запустить чат");
    JButton btnServerRun = new JButton("Запустить сервер");
    JButton btnBack = new JButton("Вернуться в главное меню");
    JButton btnExit = new JButton("Выйти из программы");

    @Override
    public void semMenu (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Семинар 1. Меню");
        setResizable(false);

        JPanel panelButton = new JPanel(new GridLayout(1, 2));
        panelButton.add(btnBack);
        panelButton.add(btnExit);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(3, 1));
        panelTask.add(btnTicTacToe);
        panelTask.add(btnChat);
        panelTask.add(btnServerRun);
        add(panelTask, BorderLayout.CENTER);
        setVisible(true);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GeneralMenu().generalMenu();
                setVisible(false);
            }
        });

        btnTicTacToe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameWindow();
                setVisible(false);
            }
        });

        btnChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Chat();
                setVisible(false);
            }
        });

        btnServerRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ServerRun();
                setVisible(false);
            }
        });

    }

}