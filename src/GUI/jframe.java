//package GUI;
//
//import javax.swing.JFrame;
//import javax.swing.ImageIcon;
//import java.awt.Color;
//
//public class jframe {
//    public static void main(String[] args) {
//        // JFrame = a GUI window to add components to
//
//        JFrame frame = new JFrame(); //creates a frame
//        frame.setTitle("JFrame title goes here"); //sets title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application on close
//        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //does nothing on close so u cant exit out of GUI
//        frame.setResizable(false); //prevent frame from being resized
//        frame.setSize(420,420); //sets x-dimension and y-dimension of frame
//        frame.setVisible(true); //make frame visible
//
//        ImageIcon image = new ImageIcon("serene-logo-new-main.jpg");
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(Color.green); //change background color
//        frame.getContentPane().setBackground(new Color(255,0,255)); //change background color with rgb
//        frame.getContentPane().setBackground(new Color(0xFFFFFF)); //change background color with hexcode
//    }
//}
