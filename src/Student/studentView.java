package Student;


import Admin.createStudent;
import Models.Student;

import javax.swing.*;
import java.io.IOException;


public class studentView extends JFrame {


    public static JFrame render() throws IOException {
        JFrame dBoard = new JFrame("Student");
        dBoard.setVisible(true);
        dBoard.setSize(1024, 768);
        dBoard.setIconImage(new ImageIcon("./icons/X-logos.jpeg").getImage().getScaledInstance(80,80,0));
//        Menu Component
        //Student Object
        Student currStudent= new Student();
        currStudent.setLoggedIn(true);

        if(currStudent.isLoggedIn()==false)
        {
            dBoard.getContentPane().add(new createStudent().getMain());
        } else if (currStudent.isLoggedIn()==true) {
            dBoard.getContentPane().add(new studentDashboard().getMain());
        }




        return dBoard;


    }

}