package holly_member_system;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setDefaultCloseOperation(Main.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        all = new javax.swing.JButton();
        kuningan = new javax.swing.JButton();
        mangga = new javax.swing.JButton();
        bsd = new javax.swing.JButton();
        mall = new javax.swing.JButton();
        puri = new javax.swing.JButton();
        ta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Holly Registration");

        all.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        all.setText("All Members and Personel");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        kuningan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kuningan.setText("ITC Kuningan");
        kuningan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuninganActionPerformed(evt);
            }
        });

        mangga.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mangga.setText("ITC Mangga Dua");
        mangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manggaActionPerformed(evt);
            }
        });

        bsd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bsd.setText("BSD City");
        bsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsdActionPerformed(evt);
            }
        });

        mall.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mall.setText("Mall Ambassador");
        mall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mallActionPerformed(evt);
            }
        });

        puri.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        puri.setText("Lippo Mall puri");
        puri.setToolTipText("");
        puri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puriActionPerformed(evt);
            }
        });

        ta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ta.setText("Taman Anggrek");
        ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(puri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(all, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(kuningan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mangga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(ta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mangga, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kuningan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mall, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bsd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        close();
        AllMember all = new AllMember();
        all.setVisible(true);
    }//GEN-LAST:event_allActionPerformed

    private void kuninganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuninganActionPerformed
        close();
        Kuningan all = new Kuningan();
        all.setVisible(true);
    }//GEN-LAST:event_kuninganActionPerformed

    private void manggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manggaActionPerformed
        close();
        ManggaDua all = new ManggaDua();
        all.setVisible(true);
    }//GEN-LAST:event_manggaActionPerformed

    private void bsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsdActionPerformed
        close();
        BSDCity all = new BSDCity();
        all.setVisible(true);
    }//GEN-LAST:event_bsdActionPerformed

    private void mallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mallActionPerformed
        close();
        Ambassador all = new Ambassador();
        all.setVisible(true);
    }//GEN-LAST:event_mallActionPerformed

    private void taActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taActionPerformed
        close();
        Anggrek all = new Anggrek();
        all.setVisible(true);
    }//GEN-LAST:event_taActionPerformed

    private void puriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puriActionPerformed
        close();
        LippoPuri all = new LippoPuri();
        all.setVisible(true);
    }//GEN-LAST:event_puriActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JButton bsd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kuningan;
    private javax.swing.JButton mall;
    private javax.swing.JButton mangga;
    private javax.swing.JButton puri;
    private javax.swing.JButton ta;
    // End of variables declaration//GEN-END:variables
}
