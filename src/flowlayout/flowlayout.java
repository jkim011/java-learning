//package flowlayout;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class flowlayout {
//    public static void main(String[] args) {
//        // Layout Manager = Defines the natural layout for components within a container
//        // FlowLayout = places components in a row, sized at their preferred size.
//        //              If the horizontal space in the container is too small, the FlowLayout class uses the next available row
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Default is .CENTER, .TRAILING sets it to right, .LEADING sets it to left
//                                                                              // Numbers set horizontal and vertical spacing between components
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(100,250));
//        panel.setBackground(Color.lightGray);
//        panel.setLayout(new FlowLayout());
//
//        panel.add(new JButton("1")); //setting it FlowLayout in panel will have components flow within the panel specifically
//        panel.add(new JButton("2"));
//        panel.add(new JButton("3"));
//        panel.add(new JButton("4"));
//        panel.add(new JButton("5"));
//        panel.add(new JButton("6"));
//        panel.add(new JButton("7"));
//        panel.add(new JButton("8"));
//        panel.add(new JButton("9"));
//
//        frame.add(panel);
//
//        frame.setVisible(true);
//
//    }
//}
