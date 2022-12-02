package registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regis {
    
    Connection con1;
    PreparedStatement insert;
    
    public void regisAction(String name,String email, String major){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/Student_Major_Registration","root","globe360");
            insert = con1.prepareStatement("Insert Into History(name, email, major)values(?, ?, ?)");
            insert.setString(1, name);
            insert.setString(2, email);
            insert.setString(3, major);
            insert.executeUpdate();

        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
