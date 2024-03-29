
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Validering;

/**
 *
 * @author Kayhan
 */
public class TabortAlienAdmin extends javax.swing.JFrame {
 
    private InfDB idb;
    public static String userID;

    public TabortAlienAdmin(String userID) {
        initComponents();
        this.userID = userID;
        
         try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internet felmeddelande" + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jID = new javax.swing.JTextField();
        lblnamn = new javax.swing.JLabel();
        lblTaBortAgent = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
        avbryt = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnamn.setText("Ange Besökares ID:");

        lblTaBortAgent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaBortAgent.setText("Radera Besökare från databasen");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        avbryt.setText("Stäng");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(avbryt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGaTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBort)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaBortAgent)
                            .addComponent(lblnamn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTaBortAgent)
                .addGap(35, 35, 35)
                .addComponent(lblnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBort)
                    .addComponent(btnGaTillbaka)
                    .addComponent(avbryt))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
       if(Validering.valTextNotEmpty(jID)){ 
        int fraga = JOptionPane.showConfirmDialog(null, " vill radera alien?", "Bekräfta", JOptionPane.YES_NO_OPTION); //Bekräftelse ruta
        // Kollar om man svara ja på bekräftelsen
        if (fraga == 0) {
       try {
    String alienID = idb.fetchSingle("SELECT Alien_ID FROM alien WHERE Alien_ID = '" + jID.getText() + "'");

    String q1 = "DELETE FROM squid WHERE Alien_ID = " + alienID;
    String q2 = "DELETE FROM boglodite WHERE Alien_ID = " + alienID;
    String q3 = "DELETE FROM worm WHERE Alien_ID = " + alienID;
    String q4 = "DELETE FROM alien WHERE Alien_ID = " + alienID ;

    idb.delete(q1);
    idb.delete(q2);
    idb.delete(q3);
    idb.delete(q4);

    JOptionPane.showMessageDialog(null, " Alien är raderad");
    dispose();

} catch (InfException e) {
    // Hantera eventuella undantag, till exempel visa ett felmeddelande.
    JOptionPane.showMessageDialog(null, "radering av alien misslyckades.");
}
        }
       }
    }//GEN-LAST:event_taBortActionPerformed

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed

        AndraAliens_Admin tillAdminval = new AndraAliens_Admin(userID);
        tillAdminval.show();
        //stänger tidigare fönster
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabortAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabortAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabortAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabortAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabortAlienAdmin(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbryt;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JTextField jID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTaBortAgent;
    private javax.swing.JLabel lblnamn;
    private javax.swing.JButton taBort;
    // End of variables declaration//GEN-END:variables
}
