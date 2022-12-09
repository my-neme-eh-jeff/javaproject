package javapracs;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI extends Frame {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("geegee");
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.setLocation(500, 300);
        frame.add(panel);
        JButton button1 = new JButton("yooo");
        panel.add(button1);
        button1.setSize(100,50 );
        button1.setLocation(50, 50);
        panel.setBackground(Color.GREEN);
        JTextField textField = new JTextField();
        JLabel label = new JLabel("geeeege");
        panel.add(label);
        panel.add(textField);
        textField.setLocation(200, 200);
        textField.setSize(30,30);
        label.setLocation(300, 400);
        label.setSize(40,40);
        ButtonGroup grp = new ButtonGroup();
        JCheckBox checkBox = new JCheckBox("YES");
        JCheckBox checkBox2 = new JCheckBox("no");   
        checkBox.setBackground(Color.BLACK);
        grp.add(checkBox2);
        grp.add(checkBox);     
        panel.add(checkBox);
        Font f1= new Font(Font.SANS_SERIF,Font.BOLD,3);
        checkBox.setLocation(300, 100);
        checkBox.setSize(80,80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(checkBox2);
        checkBox2.setLocation(390, 100);
        checkBox2.setSize(80,80);
        button1.setForeground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //REMEBER THIS PART!!!!!!!!!!!!!!!!!
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
                textField.setText("1");
            }
        });        
      
        JRadioButton ooo = new JRadioButton();
        panel.add(ooo);
        ooo.setLocation(300, 200);
        ooo.setSize(80,50);
        JTextField text = new JTextField();
        panel.add(text);
        text.setLocation(100, 400);
        text.setSize(80,50);
    }

  
}
