package javapracs;
import java.awt.*;
import javax.swing.*;

//F4EAD5 FFFBE9

public class unitConverterUsingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        frame.setLocation(500, 300 );
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.add(panel1);
        frame.add(panel2);
        frame.setTitle("Temperature converter");

        Font titleFont = new Font(Font.MONOSPACED,Font.BOLD,40);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel2.setBackground(Color.decode("#CCD6A6"));
        panel2.setBounds(10, 10, 670, 65);
        JLabel title = new JLabel("Temperature converter");
        title.setFont(titleFont);
        title.setForeground(Color.decode("#FFFBE9"));


        String units[] = {"Celcius","Farenheight","Kelvin"};
        JComboBox comboBox1 = new JComboBox(units);
        JComboBox comboBox2 = new JComboBox(units);
        comboBox1.setBounds(200, 100, 150, 50);

        panel1.setBounds(0, 75, 700, 425);
        panel1.setBackground(Color.black);
        panel2.add(title);
        panel1.add(comboBox1);
    }
}
