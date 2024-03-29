
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
public class BliAdmin extends javax.swing.JFrame {

    private InfDB idb;
    private String epost;
    public static String userID;
    public static String userNamn;
    
    
    /**
     * Creates new form BliAdmin
     */
    public BliAdmin() {
        initComponents();
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

        namn = new javax.swing.JTextField();
        AgentNamn = new javax.swing.JLabel();
        Spara = new javax.swing.JButton();
        geAdmin = new javax.swing.JComboBox<>();
        lblAdministrator = new javax.swing.JLabel();
        Avbryt = new javax.swing.JButton();
        GaTillbaka = new javax.swing.JButton();
        AdminStatusAgenter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgentNamn.setText("Agent-namn");

        Spara.setText("Spara");
        Spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SparaActionPerformed(evt);
            }
        });

        geAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));

        lblAdministrator.setText("Administratör?");

        Avbryt.setText("Avbryt");
        Avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvbrytActionPerformed(evt);
            }
        });

        GaTillbaka.setText("Gå tillbaka");
        GaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaTillbakaActionPerformed(evt);
            }
        });

        AdminStatusAgenter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminStatusAgenter.setText("Ändra administratörsstatus hos Agenter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdministrator, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Avbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Spara)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminStatusAgenter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminStatusAgenter)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgentNamn)
                    .addComponent(lblAdministrator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Avbryt)
                    .addComponent(GaTillbaka)
                    .addComponent(Spara))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SparaActionPerformed
        // Spara-knapp
        
        // Agentens namn hämtas från textfältet namn
        String agentNamn = namn.getText();
        // Värdet hämtas från det valda alternativet i JComboBox-en geAdmin som sedan konverterar det till en sträng
        String admin = geAdmin.getSelectedItem().toString();
        
            // Uppdrag utförs om agenten har adminbehörighet.
            try {
                if (admin.equals("Ja")) {
                    
                    
      String  q="update agent set Administrator='J' where namn ='" + agentNamn + "'"; 
        idb.update(q);
              //ändrar en sträng i databasen till Ja
                } else {
                    idb.update("update agent set Administrator='N' where namn ='" + agentNamn + "'");  
                       //ändrar en sträng i databasen till N
                }
                JOptionPane.showMessageDialog(null, "Adminstatus är ändrad");
                dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Misslyckad");
            }
        
    }//GEN-LAST:event_SparaActionPerformed

    private void AvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvbrytActionPerformed
        // Avbryt-knapp
        
        JFrame frame = new JFrame("Avbryt");
        if(JOptionPane.showConfirmDialog(frame, "Är du säker på att du vill avbryta?", "Avbryt",
                JOptionPane.YES_OPTION)== JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_AvbrytActionPerformed

    private void GaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaActionPerformed
        //Tillbaka-knapp 
        
        AndraAgenter_Admin tillAdminval = new AndraAgenter_Admin(userID, userNamn);
        tillAdminval.show();
        //stänger tidigare fönster
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_GaTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(BliAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BliAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BliAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BliAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BliAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminStatusAgenter;
    private javax.swing.JLabel AgentNamn;
    private javax.swing.JButton Avbryt;
    private javax.swing.JButton GaTillbaka;
    private javax.swing.JButton Spara;
    private javax.swing.JComboBox<String> geAdmin;
    private javax.swing.JLabel lblAdministrator;
    private javax.swing.JTextField namn;
    // End of variables declaration//GEN-END:variables
}
