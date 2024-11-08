package top.homework;
/*
 * @author  MaRui
 * @date  2023/11/28 13:32
 * @version 1.0
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @author MaRui
 */
public class App2 {
    public static void main(String[] args) {
    JFrame frm =new JFrame();
    JButton bt1=new JButton();
    frm.setSize(500,500);
    frm.setLocation(220,160);
    frm.add(bt1);
    frm.setLayout(null);
    bt1.setSize(80,40);
    bt1.setText("拖动我");
    frm.setVisible(true);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bt1.addMouseMotionListener(new MouseMotionListener() {
        Point point;
        @Override
        public void mouseDragged(MouseEvent e) {
            if(point == null) {
                point = e.getPoint();
            }
            Point relativePoint = new Point(e.getX() - 280, e.getY() - 200);
            Point framePoint = new Point(relativePoint.x + e.getComponent().getLocationOnScreen().x, relativePoint.y + e.getComponent().getLocationOnScreen().y);
            //设置对象窗体位置
            bt1.setLocation(framePoint);
        }

        @Override
        public void mouseMoved(MouseEvent e) {


        }
    });
}
}

