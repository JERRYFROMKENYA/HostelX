package Student.Screens.Dashboard.Components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class East extends JPanel {
    public static String today() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 5 && hour < 12) {
            return ("Good morning!");
        } else if (hour >= 12 && hour < 17) {
            return ("Good afternoon!");
        } else if (hour >= 17 && hour < 21) {
            return ("Good evening!");
        } else {
            return ("Good night!");
        }
    }
    public static JPanel render() throws IOException {
        JPanel east = new JPanel();
        east.setLayout(new GridLayout(3,1));

        //  GREETINGS & ID SECTION
        //Date object
        String Greeting = today();
//        System.out.println(Greeting);
        String userX=new String("User X");
        JLabel dashGreeting = new JLabel(Greeting+"\t \n"+userX);
        Font tSerifSmall = new Font("San-Serif",Font.ITALIC,14);
        dashGreeting.setFont(tSerifSmall);
//       dashGreeting.setAlignmentX(2.55);
        JPanel greetingWrapper= new JPanel(new FlowLayout(FlowLayout.RIGHT,0,1));
        greetingWrapper.add(dashGreeting);
        // user pic
        BufferedImage image= ImageIO.read(new File("./GroupX.png"));
        Image userIcon = image.getScaledInstance(96, 96, Image.SCALE_DEFAULT);
        Icon uIcon = new ImageIcon(userIcon);
        JLabel userIconLabel = new JLabel(uIcon);
        //Notification Panel
        JPanel nPanel=new JPanel();
        nPanel.setLayout(new GridLayout(2,2));

        String [] notifications={"x","j","y","t"};

        JList nList = new JList(notifications);

        greetingWrapper.add(userIconLabel);
        east.add(BorderLayout.EAST,greetingWrapper);
        nPanel.add(nList);
        east.add(nPanel);




        return east;

    }
}
