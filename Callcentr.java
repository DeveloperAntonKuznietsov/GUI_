package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Callcentr extends JFrame {
    JPanel jPanel = new JPanel();
    String name = "КоллцентрJVV";



    JLabel jLabel1= new JLabel("Файл с данными распределения (xls)");
    JLabel jLabel2= new JLabel("Файл с названиями подразделений (xls)");
    JLabel jLabel3= new JLabel("Сумма распределения расходов (USD)");

    JButton jButton1 = new JButton("Выбрать файл");
    JButton jButton2 = new JButton("Выбрать файл");
    JButton jButton3 = new JButton("Сохранить");
    JButton jButton4 = new JButton("Сгенерировать csv файл");

    JTextField jTextField = new JTextField(20);
    JButton buttonNazad = new JButton("На главную");



    public Callcentr(){
        super( "КоллцентрJVV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        setSize(1300,700);

        jPanel.setLayout(null);

        jPanel.add(jLabel1).setBounds(25,30,300,50);
        jPanel.add(jLabel2).setBounds(25,60,300,50);;
        jPanel.add(jLabel3).setBounds(25,90,300,50);;
        jPanel.add(jButton1).setBounds(525,35,200,25);;
        jPanel.add(jButton2).setBounds(525,68,200,25);;
        jPanel.add(jButton3).setBounds(525,100,200,25);
        jPanel.add(jButton4).setBounds(25,300,200,25);
        jPanel.add(jTextField).setBounds(305,102,200,25);;
        jPanel.add(buttonNazad).setBounds(950,625,200,25);
        buttonNazad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Callcentr.super.setVisible(false);

            }
        });

        add(jPanel);





        revalidate();



    }




}
