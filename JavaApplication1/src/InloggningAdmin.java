import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import mib.Validering;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rikard Söderek
 */
public class InloggningAdmin extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form InloggningAdmin
     */
    public InloggningAdmin() {
        initComponents();
        
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

        adminnamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adminlösenord = new javax.swing.JPasswordField();
        loggInKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        avbrytKnapp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        gaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminnamn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminnamnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Lösenord:");

        adminlösenord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminlösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminlösenordActionPerformed(evt);
            }
        });

        loggInKnapp.setText("Logga in");
        loggInKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggInKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inloggning [Admin]");

        avbrytKnapp.setText("Avbryt");
        avbrytKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytKnappActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("E-post/Användarnamn:");

        gaTillbaka.setText("Gå tillbaka");
        gaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaTillbakaActionPerformed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(gaTillbaka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avbrytKnapp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loggInKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(adminlösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminlösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggInKnapp)
                    .addComponent(avbrytKnapp)
                    .addComponent(gaTillbaka))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminnamnActionPerformed
        // TODO
        
        
    }//GEN-LAST:event_adminnamnActionPerformed

    private void adminlösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminlösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminlösenordActionPerformed

    private void avbrytKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytKnappActionPerformed
        //Avbryt
                JFrame frame = new JFrame("Avbryt");
        if(JOptionPane.showConfirmDialog(frame, "Är du säker på att du vill avbryta?", "Avbryt",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_avbrytKnappActionPerformed

    private void loggInKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggInKnappActionPerformed
        //Logga in-knapp för att logga in
        
        // Validering av textfältet utförs för admin-namn och lösenord
        if (Validering.valTextNotEmpty(adminnamn)&& Validering.valPasswordNotEmpty(adminlösenord)){
    try {
        // Värdet hämtas från textfält för admin-namn och lösenord för att testas
        String test = adminnamn.getText();
         String test2 = adminlösenord.getText();
      
       // JOptionPane.showMessageDialog(null, "Vänligen fyll dina uppgifter");
        // En SQL-fråga för att hämta ut information om en agent baserat på det admin-namn som angivs

    String q1 = String.format("SELECT Agent_id, Namn, administrator, Losenord, Epost FROM agent WHERE Epost = \"%s\"", adminnamn.getText());

        HashMap<String, String> rad =  idb.fetchRow(q1);
        String lösenord = rad.get("Losenord");
        System.out.println("rad hittad");
        
        String userID = rad.get("Agent_ID");
        String userNamn = rad.get("Namn");
                if(adminnamn.getText().equals(rad.get("Epost")) && adminlösenord.getText().equals(lösenord)&& rad.get("Administrator").equals("J")) {
            InformationAdmin InfoAD = new InformationAdmin(userID, userNamn);
        InfoAD.setVisible(true);  //öppnar informationsfönser till Admin
        //stänger tidigare fönster
        dispose(); 
        }
        else if(adminnamn.getText().equals(rad.get("Epost")) && adminlösenord.getText().equals(lösenord)&& rad.get("Administrator").equals("N")){
    JOptionPane.showMessageDialog(null, "Agent är inte admin");
    }

//            // Vi kommer hit om den som loggade in är administratör dvs administrator = J
//        
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "kontrollera epost eller lösenord");
      System.out.println("Internt felmeddelande: " + e.getMessage());

}
     }
    }//GEN-LAST:event_loggInKnappActionPerformed

    private void gaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaTillbakaActionPerformed
        //Tillbakaknapp till InloggningVal
        InloggningVal LogInVal = new InloggningVal();
        LogInVal.show();
        //stänger tidigare fönster
        dispose();
    }//GEN-LAST:event_gaTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(InloggningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggningAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggningAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminlösenord;
    private javax.swing.JTextField adminnamn;
    private javax.swing.JButton avbrytKnapp;
    private javax.swing.JButton gaTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loggInKnapp;
    // End of variables declaration//GEN-END:variables
}
