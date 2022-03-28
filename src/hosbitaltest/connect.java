package hosbitaltest;

//package hosbitaltest;
//import .*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class connect {
    public static Connection connectdb(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/hos","APP","APP");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, "error can't connect to database", ex);
        }
        return con;
    }
}
