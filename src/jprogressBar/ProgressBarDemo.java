//package jprogressBar;
//
//import java.awt.*;
//import javax.swing.*;
//
//public class ProgressBarDemo {
//    JFrame frame = new JFrame();
//    JProgressBar bar = new JProgressBar(0,500);// can set min and max values
//
//    ProgressBarDemo() {
//        bar.setValue(0);
//        bar.setBounds(0,0,420,50);
//        bar.setStringPainted(true); // adds percentage to progress bar
//        bar.setFont(new Font("MV Boli", Font.BOLD,25));
//        bar.setForeground(Color.red);
//        bar.setBackground(Color.black);
//
//        frame.add(bar);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(420,420);
//        frame.setLayout(null);
//        frame.setVisible(true);
//
//        fill();
//    }
//    public void fill() {
//        int counter = 0;
//
//        while(counter <= 100) {
//            bar.setValue(counter);
//            try {
//                Thread.sleep(50); // pause program for 1 sec after each iteration of while loop
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            counter += 1;
//        }
//        bar.setString("Done!");
//    }
//}
