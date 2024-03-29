
import javax.swing.JOptionPane;
import mib.Validering;
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
public class AndraLosenordAgent extends javax.swing.JFrame {
private InfDB idb;
 private String userID;
   
    public AndraLosenordAgent() {
        initComponents();
        this.userID = userID;
        
        jAgentID.setText("Agent ID: " + userID);
//        jAgentPlats.setText("Plats: " + userPlace); 
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

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

        andralosenordknappen = new javax.swing.JButton();
        jButton2Avbryt = new javax.swing.JButton();
        jAgentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nuvarandelosenord = new javax.swing.JTextField();
        nyttlosenord = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        andralosenordknappen.setText("Ändra Lösenord");
        andralosenordknappen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andralosenordknappenActionPerformed(evt);
            }
        });

        jButton2Avbryt.setText("Avbryt");
        jButton2Avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AvbrytActionPerformed(evt);
            }
        });

        jAgentID.setEditable(false);
        jAgentID.setBackground(new java.awt.Color(204, 204, 204));
        jAgentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgentIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ändring av lösenord:");

        jLabel2.setText("Nuvarande Lösenord");

        jLabel3.setText("Nytt Lösenord");

        nuvarandelosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandelosenordActionPerformed(evt);
            }
        });

        nyttlosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttlosenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nyttlosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuvarandelosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2Avbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andralosenordknappen)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nuvarandelosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(nyttlosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andralosenordknappen)
                    .addComponent(jButton2Avbryt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andralosenordknappenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andralosenordknappenActionPerformed
if(Validering.valTextNotEmpty(nuvarandelosenord)&& Validering.valTextNotEmpty(nyttlosenord)){
        // Hämta nuvarande lösenord och nytt lösenord från textrutorna
        String Password = nuvarandelosenord.getText();
        String newPassword = nyttlosenord.getText();

        // Kontrollera om lösenordsfälten är tomma
        if (Password.isEmpty() && newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i Textrutor");
        }
        
        // Utför en SQL-fråga för att ändra lösenordet i agent-tabellen.
        try { 
            String sqlFraga = String.format("UPDATE agent SET Losenord = '%s' WHERE Losenord = '%s'", newPassword, Password);
            idb.update(sqlFraga);
            JOptionPane.showMessageDialog(null, "Lösenord är ändrat");
            
        // Fångar och hanterar undantaget InfException som kan uppstå vid databasrelaterade fel samt
        // visar ett felmeddelande i en informationsruta (JOptionPane) med undantagets meddelande.
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

    }//GEN-LAST:event_andralosenordknappenActionPerformed

    private void jButton2AvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AvbrytActionPerformed
        // Avbryt
        dispose();
    }//GEN-LAST:event_jButton2AvbrytActionPerformed

    private void nuvarandelosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandelosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuvarandelosenordActionPerformed

    private void nyttlosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttlosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttlosenordActionPerformed

    private void jAgentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgentIDActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenordAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andralosenordknappen;
    private javax.swing.JTextField jAgentID;
    private javax.swing.JButton jButton2Avbryt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nuvarandelosenord;
    private javax.swing.JTextField nyttlosenord;
    // End of variables declaration//GEN-END:variables
}
