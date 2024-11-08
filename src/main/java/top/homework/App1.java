package top.homework;
/*
 * @author  MaRui
 * @date  2023/11/28 13:14
 * @version 1.0
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author MaRui
 */
public class App1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frm =new JFrame();
        JButton bt1=new JButton();
        JButton bt2=new JButton();
        JButton bt3=new JButton();
        JButton bt4=new JButton();
        JButton bt5=new JButton();
        JButton bt6=new JButton();
        JTextField tf1=new JTextField();
        JTextField tf2=new JTextField();
        JTextField tf3=new JTextField();
        JLabel l1=new JLabel("红色");
        JLabel l2=new JLabel("绿色");
        JLabel l3=new JLabel("蓝色");
        JPanel p=new JPanel();
        frm.add(l1);
        frm.add(bt1);
        frm.add(tf1);
        frm.add(bt4);
        frm.add(l2);
        frm.add(bt2);
        frm.add(tf2);
        frm.add(bt5);
        frm.add(l3);
        frm.add(bt3);
        frm.add(tf3);
        frm.add(bt6);
        frm.add(p);

        l1.setSize(50,50);
        l2.setSize(50,50);
        l3.setSize(50,50);
        l1.setBackground(Color.red);
        l2.setBackground(Color.green);
        l3.setBackground(Color.GRAY);
        l1.setLocation(20,50);
        l2.setLocation(20,120);
        l3.setLocation(20,190);
        bt1.setLocation(100,50);
        bt2.setLocation(100,120);
        bt3.setLocation(100,190);
        bt4.setLocation(300,50);
        bt5.setLocation(300,120);
        bt6.setLocation(300,190);

        bt1.setBackground(Color.white);
        bt2.setBackground(Color.white);
        bt3.setBackground(Color.white);
        bt4.setBackground(Color.white);
        bt5.setBackground(Color.white);
        bt6.setBackground(Color.white);
        bt1.setText("+");
        bt2.setText("+");
        bt3.setText("+");
        bt4.setText("-");
        bt5.setText("-");
        bt6.setText("-");
        tf1.setText("220");
        tf2.setText("220");
        tf3.setText("220");
        tf1.setLocation(200,50);
        tf2.setLocation(200,120);
        tf3.setLocation(200,190);
        tf1.setSize(50,50);
        tf2.setSize(50,50);
        tf3.setSize(50,50);


        p.setLocation(0,300);
        p.setSize(450,150);
        p.setBackground(Color.GRAY);
        bt1.setSize(50,50);
        bt2.setSize(50,50);
        bt3.setSize(50,50);
        bt4.setSize(50,50);
        bt5.setSize(50,50);
        bt6.setSize(50,50);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf1.setText(Integer.toString(Integer.parseInt(tf1.getText())+10));
                int c1=Integer.parseInt(tf1.getText());
                if (c1>255) {
                    tf1.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }
        });
        bt2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf2.setText(Integer.toString(Integer.parseInt(tf2.getText())+10));
                int c2=Integer.parseInt(tf2.getText());
                if (c2>255) {
                    tf2.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }

        });
        bt3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf3.setText(Integer.toString(Integer.parseInt(tf3.getText())+10));
                int c3=Integer.parseInt(tf3.getText());
                if (c3>255) {
                    tf3.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }

        });
        bt4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf1.setText(Integer.toString(Integer.parseInt(tf1.getText())-10));
                int c1=Integer.parseInt(tf1.getText());
                if (c1<0) {
                    tf1.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }

        });
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf2.setText(Integer.toString(Integer.parseInt(tf2.getText())-10));
                int c1=Integer.parseInt(tf2.getText());
                if (c1<0) {
                    tf2.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }
        });
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf3.setText(Integer.toString(Integer.parseInt(tf3.getText())-10));
                int c1=Integer.parseInt(tf3.getText());
                if (c1<0) {
                    tf3.setText("0");
                }
                Color c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
                p.setBackground(c);
            }

        });



        frm.setSize(400,500);
        frm.setLocation(220,160);


        frm.setLayout(null);


        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
