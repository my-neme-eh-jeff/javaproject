package javapracs;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class project {

    public static void converter() {

        JFrame f = new JFrame();
        f.setTitle("CONVERTER");
        f.setResizable(false);
        JLabel l1, l2;

        JTextField t1, t2;

        JButton b1, b2, b3, b4;

        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 27, 90, 50);
        l2 = new JLabel("Dollars:");
        l2.setBounds(199, 27, 90, 50);
        l1.setForeground(Color.decode("#A19A89"));
        l2.setForeground(Color.decode("#A19A89"));

        t1 = new JTextField("0");
        t1.setBounds(70, 40, 90, 30);
        t2 = new JTextField("0");
        t2.setBounds(249, 40, 90, 30);

        b1 = new JButton("INR");
        b1.setBounds(80, 90, 70, 30);
        b2 = new JButton("Dollar");
        b2.setBounds(240, 90, 70, 30);
        b3 = new JButton("close");
        b3.setBounds(80, 150, 70, 30);
        b4 = new JButton("Clear");
        b4.setBounds(240, 150, 70, 30);
        b1.setForeground(Color.decode("#E6DDC4"));
        b2.setForeground(Color.decode("#E6DDC4"));
        b3.setForeground(Color.decode("#E6DDC4"));
        b4.setForeground(Color.decode("#E6DDC4"));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(t1.getText());
                double d1 = (d / 65.25);
                String str1 = String.valueOf(d1);
                t2.setText(str1);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d2 = Double.parseDouble(t2.getText());
                double d3 = (d2 * 65.25);
                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        b1.setBackground(Color.decode("#181D31"));
        b2.setBackground(Color.decode("#181D31"));
        b3.setBackground(Color.decode("#181D31"));
        b4.setBackground(Color.decode("#181D31"));
        JPanel panel = new JPanel();
        panel.setBounds(0, 200, 400, 100);
        panel.setBackground(Color.decode("#678983"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setLocation(600, 175);
        Font fff = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        JLabel title1 = new JLabel("Currency ");
        title1.setForeground(Color.decode("#F0E9D2"));
        title1.setFont(fff);
        title1.setBounds(0, 300, 370, 200);
        JLabel title2 = new JLabel("Converter");
        title2.setForeground(Color.decode("#F0E9D2"));
        title2.setFont(fff);
        title2.setBounds(0, 500, 370, 200);
        f.add(panel);
        panel.add(title1);
        panel.add(title2);

        f.setBackground(Color.decode("#181D31"));
        f.setVisible(true);
    }

    public static void main(String args[]) {
        converter();
    }
}
