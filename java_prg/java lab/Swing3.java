import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Swing3 {
    public static void main(String args[]){
        JFrame win=new JFrame();
        win.setTitle("Java Swing Example-3");

        JLabel lb1=new JLabel("Product Name:");
        lb1.setBounds(80,20,100,20);
        win.add(lb1);

        JTextField name=new JTextField();
        name.setBounds(200,20,200,20);
        win.add(name);

        JLabel lb2=new JLabel("Product Type:");
        lb2.setBounds(80,60,100,20);
        win.add(lb2);

        JRadioButton rb1=new JRadioButton("Local");
        

        JRadioButton rb2=new JRadioButton("Foreign");
        

        rb1.setBounds(200,40,80,50);
        rb2.setBounds(300,40,90,50);

        ButtonGroup bgrp=new ButtonGroup();
        bgrp.add(rb1);
        bgrp.add(rb2);

        win.add(rb1);
        win.add(rb2);

        JLabel lb3=new JLabel("Description:");
        lb3.setBounds(80,100,120,20);
        win.add(lb3);

        JTextArea txtArea=new JTextArea();
        txtArea.setBounds(200,100,200,100);
        win.add(txtArea);
        JButton btn=new JButton("Submit");
        btn.setBounds(200,220,100,30);
        win.add(btn);



        
        win.setSize(800,700);
        win.setLocationRelativeTo(null);
        win.setLayout(null);
        win.setVisible(true);
    }    
}
