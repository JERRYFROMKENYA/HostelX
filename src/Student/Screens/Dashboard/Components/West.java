package Student.Screens.Dashboard.Components;

import javax.swing.*;
import java.awt.*;

public class West extends JPanel {
    public static JPanel render() {

        JPanel WEST = new JPanel();
        //Center Content

        WEST.setLayout(new FlowLayout());
        JPanel titlePanel = new JPanel();

//        TITLE PANEL
        titlePanel.setLayout(new BorderLayout(450,1));
//      THE ACTUAL TITLE
        JLabel dashTitle = new JLabel("Dashboard");
        Font tSerif = new Font("San-Serif",Font.BOLD,28);
//        dashTitle.setLocation(9,9);
        dashTitle.setFont(tSerif);
        titlePanel.add(BorderLayout.WEST,dashTitle);

//



        WEST.add(titlePanel);
        return WEST;

    }
}
