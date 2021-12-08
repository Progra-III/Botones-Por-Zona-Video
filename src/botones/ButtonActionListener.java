package botones;
//video 3

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String command= ((JButton) e.getSource()).getActionCommand();       //hago un casting para obtener el nombre

        if(command.equals("NORTH")){
            JOptionPane.showMessageDialog(null, "North button message", "North title", JOptionPane.INFORMATION_MESSAGE);
        }
        if(command.equals("SOUTH")){
            JOptionPane.showMessageDialog(null, "South button message", "South title", JOptionPane.INFORMATION_MESSAGE);
        }
        if(command.equals("EAST")){
            JOptionPane.showMessageDialog(null, "East button message", "East title", JOptionPane.INFORMATION_MESSAGE);
        }
        if(command.equals("WEST")){
            JOptionPane.showMessageDialog(null, "West button message", "West title", JOptionPane.INFORMATION_MESSAGE);
        }
        if(command.equals("CENTER")){
            JOptionPane.showMessageDialog(null, "Center button message", "Center title", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
