
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Validering;



/**
 *
 * @author Rikard Söderek
 */
public class RaderaUtrustningAdmin extends javax.swing.JFrame {

    private InfDB idb;
    public static String userID;
    
    public RaderaUtrustningAdmin(String userID) {
        initComponents();
        
        this.userID = userID;
        
         try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            fyllJbox();

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internet felmeddelande" + e.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        raderaknapp = new javax.swing.JButton();
        avbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Radering av utrustning:");

        jLabel2.setText("Välj utrustningen som du vill ta bort");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        raderaknapp.setText("Ta bort");
        raderaknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raderaknappActionPerformed(evt);
            }
        });

        avbryt.setText("Avbryt");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(raderaknapp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raderaknapp)
                    .addComponent(avbryt))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fyllJbox(){
        try{ ArrayList<String>q2;
    String fraga = "SELECT benamning FROM utrustning";
    //jbox.removeAllItems();
    q2=idb.fetchColumn(fraga);
    for(String benamning : q2){
        jComboBox1.addItem(benamning);
    }
      }
    catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad , försök igen senare");
            System.out.println("Internt felmedddelande: " + e.getMessage());
            }
    }
    
    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        // Avbryt
        dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void raderaknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raderaknappActionPerformed
        // Ta bort-knappen
        
        String olikaVal = jComboBox1.getSelectedItem().toString();
                
        try {
            // Hämta Utrustnings_ID för det valda värdet
            String utrustningsID = idb.fetchSingle("SELECT Utrustnings_ID FROM utrusning WHERE benamning = '" + olikaVal + "'");

             // Radera raden från utrusning-tabellen
            idb.delete("DELETE FROM utrusning WHERE Utrustnings_ID = '" + utrustningsID + "'");
    
            // Radera från andra tabeller baserat på Utrustnings_ID
            idb.delete("DELETE FROM Teknik WHERE Utrustnings_ID = '" + utrustningsID + "'");
            idb.delete("DELETE FROM Vapen WHERE Utrustnings_id = '" + utrustningsID + "'");
            idb.delete("DELETE FROM Kommunikation WHERE Utrustnings_id = '" + utrustningsID + "'");
            idb.delete("DELETE FROM Innehar_Utrustning WHERE Utrustnings_id = '" + utrustningsID + "'");
    
            // Radera från huvudtabellen
            idb.delete("DELETE FROM Utrustning WHERE Utrustnings_ID = '" + utrustningsID + "'");

            JOptionPane.showMessageDialog(null, "Utrustning har blivit raderad");
            dispose();
        }   
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad borttagning, försök igen");
            System.out.println("Internt felmeddelenade: " + e.getMessage());
        }
         
        
    }//GEN-LAST:event_raderaknappActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(RaderaUtrustningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaUtrustningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaderaUtrustningAdmin(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbryt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton raderaknapp;
    // End of variables declaration//GEN-END:variables
}
