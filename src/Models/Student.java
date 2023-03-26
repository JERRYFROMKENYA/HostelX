package Models;
public class Student {

    private boolean loggedIn;
    private int studentNo;

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean logged) {
        loggedIn = logged;
    }

}
