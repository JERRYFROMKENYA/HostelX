import java.io.IOException;
import Models.*;
import Login.*;
import Student.*;
public class Main {
    public static void main(String[] args) throws IOException {
                Student s = new Student();
                Admin a = new Admin();
                if(s.isLoggedIn()==false)
                {
                        login.main();
                }

//        studentView.render();

    }


}