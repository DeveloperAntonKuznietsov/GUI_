package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convidev extends JFrame{
    JLabel jLabel1 = new JLabel("Выбрать файл с данными Convidev.csv");
    JLabel jLabel2 = new JLabel("Обработать файл");
    JLabel jLabel3 = new JLabel("Выбрать место сохранения файла и сохранить");

    JButton jButton1 = new JButton("Загрузить файл");
    JButton jButton2 = new JButton("Обработать");
    JButton jButton3 = new JButton("Сохранить");
    JButton buttonNazad = new JButton("На главную");

    JTextArea jTextArea = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane(jTextArea);
    JPanel jPanel = new JPanel();

    public Convidev(){
        super("Condinev");
        setVisible(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300,700);
        jPanel.setLayout(null);



        jPanel.add(jLabel1).setBounds(25,25,300,25);
        jPanel.add(jButton1).setBounds(335,25,200,25);;
        jPanel.add(jLabel2).setBounds(25,60,300,25);
        jPanel.add(jButton2).setBounds(335,60,200,25);;
        jPanel.add(jScrollPane).setBounds(10,90,1165,425);
        jPanel.add(jLabel3).setBounds(25,525,300,25);
        jPanel.add(jButton3).setBounds(335,525,200,25);
        buttonNazad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Convidev.super.setVisible(false);

            }
        });
        jPanel.add(buttonNazad).setBounds(950,625,200,25);
        add(jPanel);



        validate();

    }
}
