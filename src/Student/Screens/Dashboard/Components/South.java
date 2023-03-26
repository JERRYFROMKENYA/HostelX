package Student.Screens.Dashboard.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class South extends JPanel implements ActionListener {
    public JPanel render() {
        //Group X Footer

        JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        south=JButton.super();
        String footerText =new String("©️2023 Designed for Hostel X by Group X!");
        JLabel footer= new JLabel(footerText);
        JButton contactUS= new JButton("Contact Us");
        contactUS.addActionListener(this);


        south.add(footer);
        south.add(contactUS);




        return south;

    }
    public void contactx(){


        JOptionPane.showMessageDialog(this,"Created by Group X;" +
                "\n Jerry Ochieng" +
                "\n Liz Wangui" +
                "\n Franciscah Nyaboke" +
                "\n Emmanuel Oyugi" +
                "\n Mitchelle Makena");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        contactx();
    }
}
