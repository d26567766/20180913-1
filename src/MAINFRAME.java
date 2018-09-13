import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class MAINFRAME extends JFrame {
    private Container cp;
    private JButton jbtn1=new JButton("ADD");
    private JButton jbtn2=new JButton("DOWN");
    private  JLabel jlb=new JLabel("0");
private int x=0,y=0;
    public MAINFRAME() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(100, 50);
        this.setSize(1800, 1000);
        cp = this.getContentPane();
        jbtn1.setBounds(500,200,400,200);
        jbtn1.setFont(new Font(null,Font.BOLD,70));
        jbtn2.setBounds(1000,200,400,200);
        jbtn2.setFont(new Font(null,Font.BOLD,70));
        jlb.setBounds(925,50,400,200);
        jlb.setFont(new Font(null,Font.BOLD,70));
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jlb);
        this.setTitle("welcome");
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               x=x-5;
               jlb.setLocation(x,y);
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x=x+5;
               jlb.setLocation(x,y);
            }
        });
    }
}