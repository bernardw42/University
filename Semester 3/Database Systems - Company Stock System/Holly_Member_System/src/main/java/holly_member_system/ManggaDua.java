package holly_member_system;

//import classes
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManggaDua extends javax.swing.JFrame {

    public ManggaDua() {
        initComponents();
        setDefaultCloseOperation(Ambassador.DISPOSE_ON_CLOSE);
        updateTable("Select * from holly_registration.mangdu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mobile_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rank_txt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender_txt = new javax.swing.JComboBox<>();
        dob_txt = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        group_txt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ITC Mangga Dua");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Full Name");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mobile No.");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Rank");

        rank_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Customer" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");

        gender_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dob_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rank_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender_txt, 0, 296, Short.MAX_VALUE)
                            .addComponent(mobile_txt)
                            .addComponent(name_txt))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rank_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dob_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)))
                .addGap(18, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Mobile No.", "Gender", "Rank", "DOB", "Branch"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Main");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        group_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group-by", "Staff", "Member" }));
        group_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(group_txt, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(group_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Connection con1;
        PreparedStatement insert;

//Updating to Table
//Printing out to display
    private void updateTable(String select){
            
        int col;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/holly_registration","root","globe360");
            insert = con1.prepareStatement(select);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsmm = rs.getMetaData();
                
            col = rsmm.getColumnCount();
                 
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
                
            while(rs.next()){
                Vector vnew = new Vector();
                
                //adding Strings from database to table
                for (int a=1; a<=col; a++){
                vnew.add(rs.getString("id"));
                vnew.add(rs.getString("name"));
                vnew.add(rs.getString("mobile"));
                vnew.add(rs.getString("gender"));
                vnew.add(rs.getString("ranks"));
                vnew.add(rs.getString("dob"));
            }
            df.addRow(vnew);
            }
                
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManggaDua.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        catch (SQLException ex) {
            Logger.getLogger(ManggaDua.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//Performing the Registration    
    private void RegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisActionPerformed
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        //Get String from Input
        String name = name_txt.getText();
        String mobile = mobile_txt.getText();
        String gender = gender_txt.getSelectedItem().toString();
        String ranks = rank_txt.getSelectedItem().toString();
        String dob = sdf.format(dob_txt.getDate());
        String branch = "ITC Mangga Dua";

        Regis r = new Regis();
        r.regisAction(name, mobile, gender, ranks, dob, branch, "mangdu");

        JOptionPane.showMessageDialog(this, "Record Added");
        updateTable("Select * from holly_registration.mangdu");
        
        //Reset to blank
        name_txt.setText("");
        mobile_txt.setText("");
        dob_txt.getDateEditor().setDate(null);
        
        name_txt.requestFocus();
    }//GEN-LAST:event_RegisActionPerformed

    //Edit data in table and database
    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked

        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int pickedID = jTable1.getSelectedRow();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        //Get String from Input
        String name = name_txt.getText();
        String mobile = mobile_txt.getText();
        String gender = gender_txt.getSelectedItem().toString();
        String ranks = rank_txt.getSelectedItem().toString();
        String dob = sdf.format(dob_txt.getDate());
        String branch = "ITC Mangga Dua";

        int id = Integer.parseInt(df.getValueAt(pickedID, 0).toString());

        Edit e = new Edit();
        e.editAction(name, mobile, gender, ranks, dob, id, "mangdu");

        JOptionPane.showMessageDialog(this, "Record Updated");
        updateTable("Select * from holly_registration.mangdu");

        //Reset to blank
        name_txt.setText("");
        mobile_txt.setText("");
        dob_txt.getDateEditor().setDate(null);

        name_txt.requestFocus();
    }//GEN-LAST:event_EditMouseClicked

    //Delete data from table and database
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int pickedID = jTable1.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(pickedID, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this data?", "Warning", JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){

            Delete d = new Delete();
            d.deleteAction(id);

            JOptionPane.showMessageDialog(this, "Record Deleted");
            updateTable("Select * from holly_registration.mangdu");
            
            //Reset to blank
            name_txt.setText("");
            mobile_txt.setText("");
            dob_txt.getDateEditor().setDate(null);

            name_txt.requestFocus();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    //Display data from table to input
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int pickedID = jTable1.getSelectedRow();

        name_txt.setText(df.getValueAt(pickedID, 1).toString());
        mobile_txt.setText(df.getValueAt(pickedID, 2).toString());
        
        Date date;
        
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String)df.getValueAt(pickedID,5));
            dob_txt.setDate(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(Kuningan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_TableMouseClicked

    //close window
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    //back to main
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        close();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void group_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_txtActionPerformed
        //Get String from Input
        String group = group_txt.getSelectedItem().toString();

        if(group == "Group-by")
        {
         updateTable("Select * from holly_registration.mangdu");
        }
        else if(group == "Staff")
        {
         String select = "Select * from holly_registration.mangdu WHERE Ranks = \"Staff\"";
         updateTable(select);
        }
        else if(group == "Member")
        {
         String select = "Select * from holly_registration.mangdu WHERE Ranks = \"Customer\"";
         updateTable(select);
        }
    }//GEN-LAST:event_group_txtActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManggaDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManggaDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManggaDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManggaDua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManggaDua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private com.toedter.calendar.JDateChooser dob_txt;
    private javax.swing.JComboBox<String> gender_txt;
    private javax.swing.JComboBox<String> group_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JComboBox<String> rank_txt;
    // End of variables declaration//GEN-END:variables
}
