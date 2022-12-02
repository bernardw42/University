package holly_member_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edit {
   
    Connection con1;
    PreparedStatement insert;
    
    public void editAction(String name, String mobile, String gender, String ranks, String dob, Integer id, String direction){
        
        try {
               
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Update holly_registration.main set name=?, ranks=? where id=?");
            insert.setString(1, name);
            insert.setString(2, ranks);
            insert.setInt(3, id);
            insert.executeUpdate();
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Update holly_registration." +direction+" set name=?, mobile=?, gender=?, ranks=?, dob=? where id=?");
            insert.setString(1, name);
            insert.setString(2, mobile);
            insert.setString(3, gender);
            insert.setString(4, ranks);
            insert.setString(5, dob);
            insert.setInt(6, id);
            insert.executeUpdate();
            }
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
