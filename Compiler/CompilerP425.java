package Compiler;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CompilerP425 {

    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        CompilerP425 gui = new CompilerP425();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("A");
        b.addActionListener(new BListener());

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class BListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (b.getText().equals("A")) {
                b.setText("B");
            } else {
                b.setText("A");
            }
        }
    }
}
