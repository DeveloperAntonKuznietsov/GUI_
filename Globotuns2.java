package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Globotuns2 extends JFrame {
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanelGlav = new JPanel();

    JButton buttonNazad = new JButton("На главную");
    JButton zagruzit = new JButton("Загрузить");

    String []month ={"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
    String []platSystem ={"WebMoney","Яндекс.Деньги","PayPal","RBK Money","QIWI","AlertPay","EasyPay","Ukash",
            "Z-PAYMENT","Alertpay","W1","Pecunix"};
    String []typValut ={"$","€","₤","грн.","руб."};
    String []typ1C ={"Прибыли и убытки","Прочие доходы и расходы","Продажи","Уставный капитал","Касса","Материалы"};

    JLabel jLabel1= new JLabel("Месяц: ");
    JLabel jLabel2= new JLabel("Тип платёжной системы: ");
    JLabel jLabel3= new JLabel("Тип валюты: ");
    JLabel jLabel4= new JLabel("Счета 1С: ");


    JComboBox jComboBox1 = new JComboBox(month);
    JComboBox jComboBox2 = new JComboBox(platSystem);
    JComboBox jComboBox3 = new JComboBox(typValut);
    JComboBox jComboBox4 = new JComboBox(typ1C);

    JTable jTable = new JTable(80,8);
    JProgressBar jProgressBar = new JProgressBar();

    public Globotuns2(){
        super("Распределение Глоботюнс");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300,700);
        setVisible(true);

        add(jPanelGlav);
        jPanelGlav.setLayout(new BorderLayout());
        jPanelGlav.add(jPanel1,BorderLayout.NORTH);
        jPanelGlav.add(jPanel2,BorderLayout.CENTER);
        jPanelGlav.add(jPanel3,BorderLayout.SOUTH);

        zagruzit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser("Выберете файл");
                jFileChooser.showOpenDialog(jPanelGlav);

            }
        });


        buttonNazad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Globotuns2.super.setVisible(false);

            }
        });


        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(zagruzit);
       // jComboBox1 = new JComboBox(month);


        jPanel1.add(jLabel1);
        jPanel1.add(jComboBox1);
        jPanel1.add(jLabel2);
        jPanel1.add(jComboBox2);
        jPanel1.add(jLabel3);
        jPanel1.add(jComboBox3);
        jPanel1.add(jLabel4);
        jPanel1.add(jComboBox4);
        jPanel1.revalidate();



        jPanel2.setBounds(0,105,1200,105);
        jPanel2.setLayout(new GridLayout(0,1));
        jPanel2.add(new JScrollPane(jTable));

        jPanel3.add(buttonNazad);


        revalidate();


    }
}
