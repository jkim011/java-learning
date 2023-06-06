//package jFileChooser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.File;
//
//public class MyFrame extends JFrame implements ActionListener {
//    JButton button;
//    MyFrame() {
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new FlowLayout());
//
//        button = new JButton("Select File");
//        button.addActionListener(this);
//
//        this.add(button);
//        this.pack();
//        this.setVisible(true);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == button) {
//            JFileChooser fileChooser = new JFileChooser();
//
//            fileChooser.setCurrentDirectory(new File("."));// "." goes to project folder. can set any path
//
//            int response = fileChooser.showOpenDialog(null); // select file to open. returns as int of 0. returns 1 on close
//            //int response = fileChooser.showOpenDialog(null); //select file to save
//            if(response == JFileChooser.APPROVE_OPTION) {
//                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//                System.out.println(file);
//            }
//        }
//    }
//}
