//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//import javax.swing.border.Border;
//
//public class jlabel {
//    public static void main(String[] args) {
//        // JLabel = a GUI display area for a string of text, an image, or both
//
//        ImageIcon image = new ImageIcon("ig-icon-darker.png");
//        Border border = BorderFactory.createLineBorder(Color.green, 3);
//
//        JLabel label = new JLabel(); //creates a label
//        label.setText("Bro, do you even code?"); //set text of label
//        label.setIcon(image); //set image of label
//        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
//        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
//        label.setForeground(new Color(255,0,0)); //set text color
//        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set text font
//        label.setIconTextGap(100); //set gap between text and image
//        label.setBackground(Color.black); //set background color
//        label.setOpaque(true); //displays background color
//        label.setBorder(border); //sets border
//        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
//        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
//        // label.setBounds(0, 0, 250, 250); //sets boundaries of how we want the label positioned and sized
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // frame.setSize(500,500);
//        // frame.setLayout(null); //undoes all default layouts including position and size for label. set new layout with label.setBounds
//        frame.setVisible(true);
//        frame.add(label); //adds the new label
//        frame.pack(); //basically flexbox. sets label to fit the frame no matter the size changes. must add all components before setting .pack()
//    }
//}
