package dataaccess;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        DataAccess d = new DataAccess();

//        ResultSet res = d.select(new String[]{"adminID", "Fname", "Username"},"tbladmin");
//
//        while(res.next())
//            System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));
//        d.closeConn();
//        boolean result=d.insert(new String[]{"username='JERRYFROMKENYA'"},"tbladmin");
//        if (result==true)
//        {
//            System.out.println("Worked");
//        }
//        else
//        {
//            System.out.println("Failed");
//        }
//    }
        boolean result = d.delete(new String[]{"adminID='4'"},"tbladmin");
        if (result == true) {
            System.out.println("Worked");
        } else {
            System.out.println("Tripped");
        }
    }
}
