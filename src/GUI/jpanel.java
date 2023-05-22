//package GUI;
//
//import javax.swing.*;
//import javax.swing.JPanel;
//import java.awt.*;
//
//public class jpanel {
//    public static void main(String[] args) {
//        // JPanel = a GUI component that functions as a container to hold other components
//
//        JLabel label = new JLabel();
//        label.setText("Hello world");
//        label.setVerticalAlignment(JLabel.TOP);
//
//        JPanel redPanel = new JPanel();
//        redPanel.setBackground(Color.red);
//        redPanel.setBounds(0,0,250,250);
//
//        JPanel bluePanel = new JPanel();
//        bluePanel.setBackground(Color.blue);
//        bluePanel.setBounds(250,0,250,250);
//
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBackground(Color.green);
//        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(new BorderLayout());
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setSize(750,750);
//        frame.setVisible(true);
//        frame.add(redPanel); //
//        frame.add(bluePanel); // adding panels created up top
//        frame.add(greenPanel); //
//        greenPanel.add(label); // can add label to panels since they're like components
//
//    }
//}
