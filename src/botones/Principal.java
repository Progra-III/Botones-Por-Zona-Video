package botones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal{
   static JFrame window = new JFrame();
   static JPanel panel = new JPanel();

    public static void setPanel(){
        panel.setLayout(new BorderLayout());
        //NORTH, SOUTH, CENTRE, WEST, EAST
    }

    public static void setFrame(){
        window.setTitle("Window 1");
        window.setBackground(Color.RED);
        window.getContentPane().add(panel);
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void addButtons(){

        ButtonActionListener btnAction= new ButtonActionListener();

        JButton btn = new JButton("NORTH");
        btn.setActionCommand("NORTH");
        btn.addActionListener(btnAction);
        btn.setPreferredSize(new Dimension(100,100));

        //video 3
        //  btn.addActionListener(new ActionListener() {
        //     @Override
        //    public void actionPerformed(ActionEvent e) {
                //POP OUT MESSAGE
        //        JOptionPane.showMessageDialog(null, "North button message", "North title", JOptionPane.INFORMATION_MESSAGE);
        //    }
        //});
        panel.add(btn,BorderLayout.NORTH);

        btn = new JButton("SOUTH");
        btn.setPreferredSize(new Dimension(100,100));
        btn.setActionCommand("SOUTH");
        btn.addActionListener(btnAction);
        panel.add(btn,BorderLayout.SOUTH);


        btn = new JButton("EAST");
        btn.setPreferredSize(new Dimension(100,100));
        btn.setActionCommand("EAST");
        btn.addActionListener(btnAction);
        panel.add(btn,BorderLayout.EAST);

        btn = new JButton("WEST");
        btn.setPreferredSize(new Dimension(100,100));
        btn.setActionCommand("WEST");
        btn.addActionListener(btnAction);
        panel.add(btn,BorderLayout.WEST);

        btn = new JButton("CENTER");
        btn.setPreferredSize(new Dimension(100,100));
        btn.setActionCommand("CENTER");
        btn.addActionListener(btnAction);
        panel.add(btn,BorderLayout.CENTER);

    }

    public static void createShowGUI(){
        setPanel();
        addButtons();
        setFrame();
    }

    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               createShowGUI();
           }
       });


        //Principal window = new Principal();
        //window.setPanel();
        //window.addButtons();
        //window.setFrame();

    }








}
