package top.homework;
/*
 * @author  MaRui
 * @date  2023/11/28 13:12
 * @version 1.0
 */


import javax.swing.*;
import java.awt.*;

/**
 * @author MaRui
 */
public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frm =new JFrame();
        JButton bt1=new JButton();
        JButton bt2=new JButton();
        JButton bt3=new JButton();
        frm.setSize(320,240);
        frm.setLocation(220,160);
        frm.setLayout(new FlowLayout());
        frm.add(bt1);
        frm.add(bt2);
        frm.add(bt3);
        bt1.setSize(80,40);
        bt2.setSize(80,40);
        bt3.setSize(80,40);
        bt1.setText("红色");
        bt2.setText("绿色");
        bt3.setText("蓝色");
        frm.getContentPane().setBackground(new Color(137,207,240));
        bt1.setBackground(Color.red);
        bt2.setBackground(Color.green);
        bt3.setBackground(Color.blue);
        bt1.setLocation(20,80);
        bt2.setLocation(120,80);
        bt3.setLocation(220,80);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
