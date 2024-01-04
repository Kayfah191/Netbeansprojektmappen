
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
    /**
     * Creates new form AndrakontorsChef
     */
    public AndrakontorsChef() {
        initComponents();
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

        lblBekraftaAndring = new javax.swing.JButton();
        lblEpostNya = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBekraftaAndring.setText("Bekräfta ändring");
        lblBekraftaAndring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBekraftaAndringActionPerformed(evt);
            }
        });

        lblEpostNya.setText("Epost på den nya kontorschefen");

        jButton1.setText("Avbryt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gå tillbaka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ÄNDRA KONTORSCHEF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(lblBekraftaAndring)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEpostNya)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(lblEpostNya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBekraftaAndring)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBekraftaAndringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBekraftaAndringActionPerformed

                try {
                    String epost = txtEpost.getText();
                    String agentID = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE epost =" + "'" + epost + "'");
                    String namn = idb.fetchSingle("SELECT namn FROM Agent WHERE epost =" + "'" + epost + "'");
                    if (Validering.exist(txtEpost)) {
                        String nuvarandeChef = idb.fetchSingle("SELECT Agent_ID FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'"); // Tar fram nuvarande chefen
                        idb.delete("DELETE FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'"); 
// tar bort nuvarande chefen
                        idb.insert("INSERT INTO Kontorschef VALUES(" + "'" + agentID + "'" + ", 'Örebrokontoret')"); 
// lägger in nya agenten som chef
                        idb.delete("DELETE FROM Faltagent WHERE Agent_ID = " + "'" + agentID + "'");
                        //tar bort nya chefen från fältagent
                        idb.insert("INSERT INTO Faltagent VALUES(" + "'" + nuvarandeChef + "'" + ")"); 
// Lägger in gamla chefen som fältagent
                        JOptionPane.showMessageDialog(null, "Du har nu gjort " + namn + " till den nya kontorschefen!");
                        dispose();
                    }
                } catch (Exception e) {

                }
            
        
    }//GEN-LAST:event_lblBekraftaAndringActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 //Tillbakaknapp 
        AndraAgenter_Admin tillAdminval = new AndraAgenter_Admin();
        tillAdminval.show();
        //stänger tidigare fönster
        dispose();
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Avbryt
        JFrame frame = new JFrame("Avbryt");
        if(JOptionPane.showConfirmDialog(frame, "Är du säker på att du vill avbryta?", "Avbryt",
                JOptionPane.YES_OPTION)== JOptionPane.YES_OPTION);
        {
            System.exit(0);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new AndrakontorsChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lblBekraftaAndring;
    private javax.swing.JLabel lblEpostNya;
    private javax.swing.JTextField txtEpost;
    // End of variables declaration//GEN-END:variables
}
