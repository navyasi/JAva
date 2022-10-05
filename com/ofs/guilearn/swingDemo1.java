package com.ofs.guilearn;

import javax.swing.*;
import java.awt.*;

public class swingDemo1 {
    public static void main(String [] args){
        JFrame f = new JFrame("User From");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username : "); //l1
        f.add(l1);
        JTextField t1 = new JTextField(20);//t1
        f.add(t1);
        JLabel l2 = new JLabel("Password : "); //l2
        f.add(l2);
        JTextField t2 = new JTextField(20);//t2
        f.add(t2);
        JButton b = new JButton("Submit");
        f.add(b);
    }
}
