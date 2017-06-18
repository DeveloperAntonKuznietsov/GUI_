package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Globotuns extends JFrame {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();

    JPanel glavPanel = new JPanel();

    JTable jTable = new JTable(80,8);

    JButton buttonNazad = new JButton("На главную");
    JButton zagruzit = new JButton("Загрузить");
    JComboBox jComboBox1 = new JComboBox();
    JComboBox jComboBox2 = new JComboBox();

    public Globotuns(){
        super("Распределение Глоботюнс");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1300,700);
        add(glavPanel);
        glavPanel.setLayout(new GridLayout(0,1));

        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,1300,700);
        zagruzit.setBounds(950,0,200,25);
        jComboBox1.setBounds(200,0,100,25);
        jComboBox2.setBounds(350,0,100,25);
        jPanel1.add(jComboBox1);
        jPanel1.add(jComboBox2);
        jPanel1.add(zagruzit);


        glavPanel.add(jPanel1).setVisible(true);

        jPanel3.add(jTable);
        jPanel3.setLayout(new GridLayout(0,1));
        glavPanel.add(new JScrollPane(jPanel3));

        jPanel2.setLayout(null);
        jPanel2.setBounds(0,0,1300,200);
        jPanel2.add(buttonNazad).setBounds(950,0,200,25);

        glavPanel.add(jPanel2).setVisible(true);

        revalidate();


    }
}
//10,60,1300-35,600-150