package holly_member_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Editmain {
    
    Connection con1;
    PreparedStatement insert;
    PreparedStatement take;
    String direction, origin, originbranch;
    
    public void editAction(String name, String ranks, String branch, Integer id){
        
        try {
            if(branch == "ITC Kuningan"){
                direction = "itc";
            }else if(branch == "ITC Mangga Dua"){
                direction = "mangdu";
            }else if(branch == "Mall Ambassador"){
                direction = "ambassador";
            }else if(branch == "BSD City"){
                direction = "bsd";
            }else if(branch == "Taman Anggrek"){
                direction = "anggrek";
            }else if(branch == "Lippo Mall Puri"){
                direction = "puri";
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            take = con1.prepareStatement("Select branch from holly_registration.main where id=?");
            take.setInt(1,id);
            ResultSet rs = take.executeQuery();
            while(rs.next()){
                originbranch = rs.getString("branch");
            }
            
            if(originbranch.equals("ITC Kuningan")){
                origin = "itc";
            }else if(originbranch.equals("ITC Mangga Dua")){
                origin = "mangdu";
            }else if(originbranch.equals("Mall Ambassador")){
                origin = "ambassador";
            }else if(originbranch.equals("BSD City")){
                origin = "bsd";
            }else if(originbranch.equals("Taman Anggrek")){
                direction = "anggrek";
            }else if(originbranch.equals("Lippo Mall Puri")){
                direction = "puri";
            }   
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement("Update holly_registration.main set name=?, ranks=?, branch=? where id=?");
            insert.setString(1, name);
            insert.setString(2, ranks);
            insert.setString(3, branch);
            insert.setInt(4, id);
            insert.executeUpdate();
            
            insert = con1.prepareStatement("Update holly_registration." + origin + " set name=?, ranks=? where id=?");
            insert.setString(1, name);
            insert.setString(2, ranks);
            insert.setInt(3, id);
            insert.executeUpdate();
            
            if (!originbranch.equals(branch)){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
                insert = con1.prepareStatement("Insert Into holly_registration." + direction + " Select * From holly_registration."+ origin+ " Where id=?");
                insert.setInt(1, id);
                insert.executeUpdate();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
                insert = con1.prepareStatement("Delete from holly_registration." + origin + " where id=?");
                insert.setInt(1, id);            
                insert.executeUpdate();
                }
            }
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(AllMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
