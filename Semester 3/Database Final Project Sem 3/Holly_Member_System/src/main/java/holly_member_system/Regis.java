package holly_member_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regis {
    
    Connection con1;
    PreparedStatement insert;
    PreparedStatement take;
    String ID;
    
    public void regisAction(String name,String mobile, String gender, String ranks, String dob, String branch, String direction){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Insert Into holly_registration.main(name, ranks, branch)values(?, ?, ?)");
            insert.setString(1, name);
            insert.setString(2, ranks);
            insert.setString(3, branch);
            insert.executeUpdate();
            
            
            take = con1.prepareStatement("Select ID from holly_registration.main");
            ResultSet rs = take.executeQuery();
            while(rs.next()){
                ID = rs.getString("id");
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Insert Into holly_registration." + direction + "(ID, name, mobile, gender, ranks, dob)values(?, ?, ?, ?, ?, ?)");
            insert.setString(1, ID);
            insert.setString(2, name);
            insert.setString(3, mobile);
            insert.setString(4, gender);
            insert.setString(5, ranks);
            insert.setString(6, dob);
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
