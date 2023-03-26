package dataaccess;


import java.sql.*;
import java.util.Arrays;


public class DataAccess {
    private Connection conn;
    private Statement stmt;

    public DataAccess() throws SQLException{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//Public Method for Reading/////////////////////////////////////////////////////////////////////////////////////////
    public ResultSet select(String[] att, String table) throws SQLException {
        String attributes = Arrays.stream(att).toList().toString().replace("[","").replace("]","");
        System.out.println("select "+ attributes +" from "+table+";");
        String SQLStmt=("select "+ attributes +" from "+table+";");
        ResultSet res= stmt.executeQuery(SQLStmt);

        return res;
    };
    /////////////Select Where//////////////////
    public ResultSet select(String[] att,String[] wh, String table) throws SQLException {
        String attributes = Arrays.stream(att).toList().toString().replace("[","").replace("]","");
        String where = Arrays.stream(wh).toList().toString().replace("[","").replace("]","");
        System.out.println("select "+ attributes +" from "+table+" where "+where);
        String SQLStmt=("select "+ attributes +" from "+table+";");
        ResultSet res= stmt.executeQuery(SQLStmt);

        return res;
    };

    //Method to add///////////////////////////////////////////////////////////////////////////////////////////
    public boolean insert(String[] att, String table) throws SQLException {
        String attributes = Arrays.stream(att).toList().toString().replace("[","").replace("]","");
        String sql = "INSERT INTO "+table +" SET "+attributes;

        PreparedStatement statement = conn.prepareStatement(sql);


        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            return true;
        }
        else
        {
            return false;
        }

    }
    ///////////Method to Update///////////////////
    public boolean update(String[] att, String[] wh,String table) throws SQLException {
        String condition=  Arrays.stream(wh).toList().toString().replace("[","").replace("]","");
        String attributes = Arrays.stream(att).toList().toString().replace("[","").replace("]","");
        String sql = "UPDATE "+table+" SET "+attributes+" WHERE "+condition+" ;";

        PreparedStatement statement = conn.prepareStatement(sql);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean delete(String[] wh,String table) throws SQLException {
        String condition=  Arrays.stream(wh).toList().toString().replace("[","").replace("]","");
//        String attributes = Arrays.stream(att).toList().toString().replace("[","").replace("]","");
        String sql = "DELETE FROM "+ table +" WHERE "+condition+";";

        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, "bill");

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            return true;
        }
        else
        {
            return false;
        }

    }



    public void closeConn() throws SQLException {
        conn.close();
    }
}
