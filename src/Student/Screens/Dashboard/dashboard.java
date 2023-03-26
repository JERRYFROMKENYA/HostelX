package Student.Screens.Dashboard;

import Student.Screens.Dashboard.Components.East;
import Student.Screens.Dashboard.Components.South;
import Student.Screens.Dashboard.Components.West;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class dashboard extends JPanel implements ActionListener {

    public JPanel main() throws IOException {
        //DASHBOARD/HOME TAB

        /*
        * Main Component Starts
        * Here*/
        JPanel dash = new JPanel();
        dash.setLayout(new BorderLayout());

        //Dependancy Components


        East side= new East();
        JPanel east = side.render();

        West main = new West();
        JPanel west= main.render();


        South footer = new South();
        JPanel south= footer.render();

        //Add Dependancy Components to Main Component
        dash.add(BorderLayout.EAST,east);
        dash.add(BorderLayout.SOUTH,south);
        dash.add(BorderLayout.WEST,west);


       return dash;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
