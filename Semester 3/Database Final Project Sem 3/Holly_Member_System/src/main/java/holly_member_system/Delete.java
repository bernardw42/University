package holly_member_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Delete {
    
    Connection con1;
    PreparedStatement insert;
    PreparedStatement insert2, take;
    String originbranch,origin;
    
    public void deleteAction(Integer id){
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            take = con1.prepareStatement("Select branch from main where id=?");
            take.setInt(1,id);
            ResultSet rs = take.executeQuery();
            while(rs.next()){
               originbranch = rs.getString("branch");
            }

            switch (originbranch){
                case "ITC Kuningan": origin = "itc";
                case "ITC Mangga Dua": origin = "mangdu";
                case "Mall Ambassador": origin = "ambassador";
                case "BSD City": origin = "bsd";
                case "Lippo Mall Puri": origin = "puri";
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Delete from holly_registration.main where id=?");

            insert.setInt(1, id);            
            insert.executeUpdate();         
            
            insert2 = con1.prepareStatement("Delete from holly_registration." + origin +" where id=?");
            insert2.setInt(1, id);            
            insert2.executeUpdate(); 
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);        
        }
        catch (SQLException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
