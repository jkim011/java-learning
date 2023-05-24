//package OpeningNewWindow;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class LaunchPage implements ActionListener {
//    JFrame frame = new JFrame();
//    JButton myButton = new JButton("New Window");
//
//    LaunchPage() {
//        myButton.setBounds(100,160,200,40);
//        myButton.setFocusable(false);
//        myButton.addActionListener(this);
//
//        frame.add(myButton);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
//        frame.setLayout(null);
//        frame.setVisible(true);
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == myButton) {
//            frame.dispose(); //closes launch page, only keeps new window
//            NewWindow myWindow = new NewWindow();
//        }
//    }
//}
