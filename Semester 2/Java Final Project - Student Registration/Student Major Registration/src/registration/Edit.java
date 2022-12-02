package registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edit {
   
    Connection con1;
    PreparedStatement insert;
    
    public void editAction(String name,String email,String major,Integer id){
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Student_Major_Registration","root","globe360");
            insert = con1.prepareStatement("Update History set name=?, email=?, major=? where id=?");
            insert.setString(1, name);
            insert.setString(2, email);
            insert.setString(3, major);
            insert.setInt(4, id);
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
