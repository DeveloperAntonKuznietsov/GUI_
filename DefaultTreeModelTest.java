package com.company;
// Swing пример использования стандартной модели дерева DefaultTreeModel
// и узлов DefaultMutableTreeNode
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultTreeModelTest extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel = new JLabel("Распределение КоллценртJVV");

    final   String     ROOT  = "Отчёты Финансовый департамента";// Массив листьев деревьев
    final   String[]   nodes = new String[]  {"AccentPay", "Adwice","Прочие отчёты и обработки"};
    final   String[][] leafs = new String[][]{{"Анализ очёта...", "Анализ очёта..."},
            {"Лист"},{"Распределение Глоботюнс","Распределение КоллценртJVV","Convidev"}};


    public DefaultTreeModelTest() {         // конструктор
        super("Отчёты Финансовый департамента");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);//разметка
        setBounds(0,0,1300,700);//разметка
        setVisible(true);


        // Создание древовидной структуры
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(ROOT);
        // Ветви первого уровня
        DefaultMutableTreeNode accentPay = new DefaultMutableTreeNode(nodes[0]);
        DefaultMutableTreeNode adwice = new DefaultMutableTreeNode(nodes[1]);
        DefaultMutableTreeNode otchetu = new DefaultMutableTreeNode(nodes[2]);
        // Добавление ветвей к корневой записи
        root.add(accentPay);
        root.add(adwice);
        root.add(otchetu);

        // Добавление к корневой записи новой ветви
        //root.add(new DefaultMutableTreeNode("Фрукты", true));
        // Добавление листьев
        for ( int i = 0; i < leafs[0].length; i++)
            accentPay.add(new DefaultMutableTreeNode(leafs[0][i], false));
        for ( int i = 0; i < leafs[1].length; i++)
            adwice.add(new DefaultMutableTreeNode(leafs[1][i], false));
        for ( int i = 0; i < leafs[2].length; i++)
            otchetu.add(new DefaultMutableTreeNode(leafs[2][i], false));

        // Создание стандартной модели и дерево
        DefaultTreeModel treeModel1 = new DefaultTreeModel(root, true);
        JTree tree1 = new JTree(treeModel1);
        Callcentr callcentr = new Callcentr();
        Convidev convidev = new Convidev();
        Globotuns2 globotuns = new Globotuns2();
        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String t = String.valueOf(tree1.getLastSelectedPathComponent());
                if(t.equals("Распределение КоллценртJVV")) {
                        callcentr.setVisible(true);
                t="s";
                }

                if (t.equals("Convidev"))
                    {
                    convidev.setVisible(true);
                        t="s";
                }

                if(t.equals("Распределение Глоботюнс"))
                {
                        globotuns.setVisible(true);
                    t="s";}


                }

        });

        // Размещение деревьев в интерфейсе
        JPanel contents = new JPanel(new GridLayout(1, 2));
        //tree1.setBounds(0,0,2300,700);
        contents.setBounds(0,0,2300,2700);//разметка
        //contents.setLayout(new FlowLayout());
        contents.add(new JScrollPane(tree1));



        add(contents);

        revalidate();
    }


}
