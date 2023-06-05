//package jcombobox;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//public class MyFrame extends JFrame implements ActionListener {
//    JComboBox comboBox;
//    MyFrame() {
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new FlowLayout());
//
//        String[] animals = {"dog", "cat", "bird"};
//
//        comboBox = new JComboBox(animals);
//        comboBox.addActionListener(this);
//
////        comboBox.setEditable(true); // lets user type for option in list
////        System.out.println(comboBox.getItemCount()); // prints current amount of items
////        comboBox.addItem("horse"); // adds item to end of list
////        comboBox.insertItemAt("pig", 0); // adds item at index 0
////        comboBox.setSelectedIndex(0); // automatically has index 0 selected
////        comboBox.removeItem("cat"); // removes item from list
////        comboBox.removeItemAt(0); // removes item at index 0
////        comboBox.removeAll(); // clears entire combobox
//
//        this.add(comboBox);
//        this.pack();
//        this.setVisible(true);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == comboBox) {
//            System.out.println(comboBox.getSelectedItem());
//            System.out.println(comboBox.getSelectedIndex());
//        }
//    }
//}
