
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kayhan
 */
public class AndrakontorsChef extends javax.swing.JFrame {

    private InfDB idb;
    public static String userID;
    public static String userNamn;
    
    /**
     * Creates new form AndrakontorsChef
     */
    public AndrakontorsChef(String userID, String userNamn) {
        initComponents();
        
        this.userID = userID;
        this.userNamn = userNamn;
        
        try{
            idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
//            System.out.println("Allt fungerar (hittills))");
        }
        
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Spara = new javax.swing.JButton();
        lblKontorsChef = new javax.swing.JLabel();
        jnamnKontorsChef = new javax.swing.JTextField();
        Avbryt = new javax.swing.JButton();
        jButton2GaTillbaka = new javax.swing.JButton();
        AndraKontorschef = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Spara.setText("Spara");
        Spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SparaActionPerformed(evt);
            }
        });

        lblKontorsChef.setText("Namn på den nya kontorschefen");

        Avbryt.setText("Avbryt");
        Avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvbrytActionPerformed(evt);
            }
        });

        jButton2GaTillbaka.setText("Gå tillbaka");
        jButton2GaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GaTillbakaActionPerformed(evt);
            }
        });

        AndraKontorschef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AndraKontorschef.setText("Ändra kontorschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jnamnKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2GaTillbaka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Avbryt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Spara))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKontorsChef)
                                    .addComponent(AndraKontorschef))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AndraKontorschef)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblKontorsChef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jnamnKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Avbryt)
                            .addComponent(jButton2GaTillbaka)
                            .addComponent(Spara))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SparaActionPerformed
        // Spara-knapp
        
        // Uppdrag för att ändra roller för agenter och kontorschefer som finns i databasen.
        try {
        String namn = jnamnKontorsChef.getText();
        String agentID = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE namn ='" + namn + "'");
        String nuvarandeChef = idb.fetchSingle("SELECT Agent_ID FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'");
        String insertKontorschef = "INSERT INTO Kontorschef VALUES('" + agentID + "', 'Örebrokontoret')";
        idb.insert(insertKontorschef);
        String tabortKontorschef = "DELETE FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'";
        idb.delete(tabortKontorschef);
        String laggTillFaltagent = "INSERT INTO Faltagent VALUES('" + nuvarandeChef + "')";
        idb.insert(laggTillFaltagent);

        // Ta bort den valda agenten från fältagent
        String tabortFaltagent = "DELETE FROM Faltagent WHERE Agent_ID = '" + agentID + "'";
        idb.delete(tabortFaltagent);
        // Visa bekräftelsemeddelande för användaren
        JOptionPane.showMessageDialog(null," Ändring lyckades!");
        dispose();
    }
    catch (Exception e) {
        // Hantera eventuella undantag, till exempel visa ett felmeddelande.
        JOptionPane.showMessageDialog(null, "Misslyckad: " + e.getMessage());
}

    }//GEN-LAST:event_SparaActionPerformed

    private void jButton2GaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GaTillbakaActionPerformed
 //Tillbakaknapp 
        AndraAgenter_Admin tillAdminval = new AndraAgenter_Admin(userID, userNamn);
        tillAdminval.show();
        //stänger tidigare fönster
        dispose();
       
    }//GEN-LAST:event_jButton2GaTillbakaActionPerformed

    private void AvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvbrytActionPerformed
        //Avbryt
     dispose();   
    }//GEN-LAST:event_AvbrytActionPerformed

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
            java.util.logging.Logger.getLogger(AndrakontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndrakontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndrakontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndrakontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndrakontorsChef(userID, userNamn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AndraKontorschef;
    private javax.swing.JButton Avbryt;
    private javax.swing.JButton Spara;
    private javax.swing.JButton jButton2GaTillbaka;
    private javax.swing.JTextField jnamnKontorsChef;
    private javax.swing.JLabel lblKontorsChef;
    // End of variables declaration//GEN-END:variables
}
