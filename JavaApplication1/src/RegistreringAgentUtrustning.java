

import mib.Validering;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreringAgentUtrustning extends javax.swing.JFrame {
 
    private InfDB idb;
    public static String userID;
    public static String userNamn;
 
    public RegistreringAgentUtrustning(String userID) {
        initComponents();
        this.userNamn=userNamn;
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

        jLabel1 = new javax.swing.JLabel();
        avbryt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        juid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbenamning = new javax.swing.JTextField();
        laggTill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbox = new javax.swing.JComboBox<>();
        intal = new javax.swing.JTextField();
        jVarde = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registrering av utrustning till Agenter:");

        avbryt.setText("Stäng");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        jLabel2.setText("Utrustnings_ID");

        juid.setEditable(false);
        juid.setText("Auto");
        juid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juidActionPerformed(evt);
            }
        });

        jLabel3.setText("Benamning");

        laggTill.setText("Lägg till utrustning");
        laggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillActionPerformed(evt);
            }
        });

        jLabel4.setText("Typ");

        jbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik" }));
        jbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxActionPerformed(evt);
            }
        });

        intal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intalActionPerformed(evt);
            }
        });

        jVarde.setText("Kaliber (heltal): ");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(8, 8, 8)
                .addComponent(avbryt)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jVarde, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbenamning, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(juid)
                            .addComponent(jbox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {intal, jLabel2, jLabel3, jLabel4, jVarde, jbenamning, jbox, juid});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(juid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVarde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laggTill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avbryt)
                    .addComponent(btnGaTillbaka))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {intal, jLabel2, jLabel3, jLabel4, jVarde, jbenamning, jbox, juid});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        // Avbryt
     dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void juidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juidActionPerformed
     
    }//GEN-LAST:event_juidActionPerformed

    private void laggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillActionPerformed
  if (Validering.valTextNotEmpty(jbenamning) && Validering.valTextNotEmpty(intal)){
try{
            String uid= idb.getAutoIncrement("Utrustning", "Utrustnings_ID");
        String benamning=jbenamning.getText();
        String redskap= intal.getText();
        String olikaVal = jbox.getSelectedItem().toString();
// Oika val i combobox
          if (olikaVal.equals("Vapen")) {
            int antalKaliber = Integer.parseInt(intal.getText()); 
            String q = "INSERT INTO utrustning VALUES('" + uid + "', '" + benamning + "')";
            String q2 = "INSERT INTO Vapen VALUES('" + uid + "', '" + antalKaliber + "')";

            idb.insert(q);
            idb.insert(q2);
            JOptionPane.showMessageDialog(null, "Registreringen till databasen lyckades");
            dispose();
        }
             if (olikaVal.equals("Kommunikation")) {

               String q3= "insert into utrustning values('" + uid + "', '"+ benamning + "')";
                            idb.insert(q3);
                String q4="insert into Kommunikation values('" + uid + "', '"+ redskap + "')";
                 idb.insert(q4);
                JOptionPane.showMessageDialog(null,"Registreringen till databasen lyckades");
                dispose();
            }
            if (olikaVal.equals("Teknik")) {
                String q5="insert into utrustning values('"+ uid + "', '"+ benamning + "')";
                idb.insert(q5);
                String q6="insert into Teknik values('" + uid + "', '" + redskap + "')";
                idb.insert(q6);
                         JOptionPane.showMessageDialog(null,"Registreringen till databasen lyckades");
                            dispose();
           }
}

 catch (InfException e) 
         {
        JOptionPane.showMessageDialog(null, "Registreringen till databasen misslyckades, försök igen");
}
  }
    }//GEN-LAST:event_laggTillActionPerformed

    private void jboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxActionPerformed
        
        String olikaVal = jbox.getSelectedItem().toString();      
        if (olikaVal.equals("Vapen")) {
            jVarde.setText("Kaliber (heltal):");
        } 
        else if (olikaVal.equals("Kommunikationsmedel")) {
            jVarde.setText("Typ av ÖverFörningsteknik");     
        } else if (olikaVal.equals("Kommunikation")) {
            jVarde.setText("Överförningsteknik: ");
        } else {
            jVarde.setText("Kraftkälla: ");
        }
    }//GEN-LAST:event_jboxActionPerformed

    private void intalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intalActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        //Skickas till AndraAgenter_Admin

        AndraAgenter_Admin tillAdminval = new AndraAgenter_Admin(userID, userNamn);
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
            java.util.logging.Logger.getLogger(RegistreringAgentUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreringAgentUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreringAgentUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreringAgentUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreringAgentUtrustning(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbryt;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JTextField intal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jVarde;
    private javax.swing.JTextField jbenamning;
    private javax.swing.JComboBox<String> jbox;
    private javax.swing.JTextField juid;
    private javax.swing.JButton laggTill;
    // End of variables declaration//GEN-END:variables
}
