
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Validering;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**wrwr
 *
 * @author Rikard Söderek
 */
public class InloggningAliens extends javax.swing.JFrame {
//java.sql.Connection conn=null;
//ResultSet rs=null;
//Statement st;
private JFrame frame;
private InfDB idb;

    //private  InfDB idb;
    

    /**
     * Creates new form InloggningAliens
     */
    public InloggningAliens() {
initComponents();
    
        //Kommer att finnas i Main så behövs kanske inte
        try{
            idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
            System.out.println("Allt fungerar (hittills))");
        }
        
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
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
        jLabel3 = new javax.swing.JLabel();
        loggaInKnapp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        avbrytKnapp = new javax.swing.JButton();
        gaTillbaka = new javax.swing.JButton();
        jUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inloggning [Besökare]");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Lösenord:");

        loggaInKnapp.setText("Logga in");
        loggaInKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInKnappActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("E-post/Användarnamn:");

        avbrytKnapp.setText("Avbryt");
        avbrytKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytKnappActionPerformed(evt);
            }
        });

        gaTillbaka.setText("Gå tillbaka");
        gaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaTillbakaActionPerformed(evt);
            }
        });

        jUser.setPreferredSize(new java.awt.Dimension(64, 26));
        jUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserActionPerformed(evt);
            }
        });

        jPassword.setPreferredSize(new java.awt.Dimension(64, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 110, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gaTillbaka)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(avbrytKnapp)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loggaInKnapp)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggaInKnapp)
                    .addComponent(gaTillbaka)
                    .addComponent(avbrytKnapp))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void janActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_janActionPerformed

    private void jlösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlösenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlösenActionPerformed

    private void avbrytKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytKnappActionPerformed
        //Avbryt
                        JFrame frame = new JFrame("Avbryt");
        if(JOptionPane.showConfirmDialog(frame, "Är du säker på att du vill avbryta?", "Avbryt",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_avbrytKnappActionPerformed

    private void loggaInKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInKnappActionPerformed
        //Logga in-knapp för att logga in
        
        // En validering utförs för att kontrollera om textfält för användarnamn (jUser) och lösenord (jPassword) inte är tomma och lösenordet inte är tomt
    if (Validering.valTextNotEmpty(jUser)&& Validering.valPasswordNotEmpty(jPassword)){
    try {
        // En SQL-fråga skapas för att hämta ut information om en alien baserat på det angivna användarnamnet från textfältet jUser
        String query = String.format("SELECT Epost, Losenord, Namn FROM alien WHERE Epost = \"%s\"", jUser.getText());
        System.out.println(query);        
        HashMap<String, String> rad =  idb.fetchRow(query);
        //Epost matcher ett lösenord så ska användaren kunna Logga in
        
        String userAlienID = rad.get("Alien_ID");
        String userAlienNamn = rad.get("Namn");
        
        String lösenord = rad.get("Losenord");
        System.out.println("rad hittad");
        
        // Kontroll utförs om det lösenord som är angivet från ett textfält (jPassword) matchar det lösenord som är förväntat (lösenord)
        if(jPassword.getText().equals(lösenord)) {
             InformationAliens infoAlien = new InformationAliens(userAlienID, userAlienNamn);
        infoAlien.setVisible(true);
        dispose();
        }
        else {
            throw new Exception();
        }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "kontrollera epost eller lösenord");
      System.out.println("Internt felmeddelande: " + e.getMessage());
    }
}
    }//GEN-LAST:event_loggaInKnappActionPerformed

    private void gaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaTillbakaActionPerformed
        //Tillbakaknapp till InloggningVal
        InloggningVal LogInVal = new InloggningVal();
        LogInVal.show();
        
        dispose();

    }//GEN-LAST:event_gaTillbakaActionPerformed

    private void jUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserActionPerformed

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
            java.util.logging.Logger.getLogger(InloggningAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggningAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggningAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggningAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggningAliens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbrytKnapp;
    private javax.swing.JButton gaTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUser;
    private javax.swing.JButton loggaInKnapp;
    // End of variables declaration//GEN-END:variables
}
