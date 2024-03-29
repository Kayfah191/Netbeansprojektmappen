/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AndraAgenter_Admin extends javax.swing.JFrame {

     public static String userID;
     public static String userNamn;
    
    /**
     * Creates new form AndraAgenter
     */
    public AndraAgenter_Admin(String userID, String userNamn) {
        initComponents();
        this.userID = userID;
        this.userNamn = userNamn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registreraAgent = new javax.swing.JButton();
        hamtaInfoAgent = new javax.swing.JButton();
        taBortAgent = new javax.swing.JButton();
        gorTillAdmin = new javax.swing.JButton();
        andraKontorsChef = new javax.swing.JButton();
        andraOmradesChef = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        avbryt = new javax.swing.JButton();
        andraAgent = new javax.swing.JButton();
        oppnaAgentSidan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registreraAgent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registreraAgent.setText("Registrera agent");
        registreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentActionPerformed(evt);
            }
        });

        hamtaInfoAgent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hamtaInfoAgent.setText("Hämta information om agent");
        hamtaInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamtaInfoAgentActionPerformed(evt);
            }
        });

        taBortAgent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taBortAgent.setText("Ta bort agent");
        taBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentActionPerformed(evt);
            }
        });

        gorTillAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gorTillAdmin.setText("Gör till admin");
        gorTillAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorTillAdminActionPerformed(evt);
            }
        });

        andraKontorsChef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        andraKontorsChef.setText("Ändra kontorschef");
        andraKontorsChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKontorsChefActionPerformed(evt);
            }
        });

        andraOmradesChef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        andraOmradesChef.setText("Ändra områdeschef");
        andraOmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraOmradesChefActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ändra information om Agenter:");

        avbryt.setText("Stäng");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        andraAgent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        andraAgent.setText("Ändra Agent");
        andraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAgentActionPerformed(evt);
            }
        });

        oppnaAgentSidan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        oppnaAgentSidan.setText("Gå till Agent-sidan");
        oppnaAgentSidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oppnaAgentSidanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(avbryt)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taBortAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(andraKontorsChef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(andraOmradesChef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(andraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hamtaInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registreraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gorTillAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oppnaAgentSidan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {andraAgent, andraKontorsChef, andraOmradesChef, gorTillAdmin, hamtaInfoAgent, registreraAgent, taBortAgent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(registreraAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gorTillAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hamtaInfoAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andraAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andraOmradesChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andraKontorsChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taBortAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oppnaAgentSidan)
                .addGap(24, 24, 24)
                .addComponent(avbryt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentActionPerformed
        //Skickas till RegistreraAgent
        
        RegistreraAgent agentReg= new RegistreraAgent(userID);
        agentReg.setVisible(true); 
    }//GEN-LAST:event_registreraAgentActionPerformed

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
    //Avbryt
    dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void gorTillAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorTillAdminActionPerformed
        //Skickas till BliAdmin
        
        BliAdmin GeAdmin= new BliAdmin();
       GeAdmin.setVisible(true); 

        
    }//GEN-LAST:event_gorTillAdminActionPerformed

    private void hamtaInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamtaInfoAgentActionPerformed
        //Skickas till VisaInfoOmAgent
        VisaInfoOmAgent InfoAgent= new VisaInfoOmAgent(userID, userNamn);
        InfoAgent.setVisible(true);   
    }//GEN-LAST:event_hamtaInfoAgentActionPerformed

    private void taBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentActionPerformed
        //Skickas till TabortAgent
        
        TabortAgent tabort= new TabortAgent(userID, userNamn);
        tabort.setVisible(true); 
    }//GEN-LAST:event_taBortAgentActionPerformed

    private void andraKontorsChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKontorsChefActionPerformed
        //Skickas till AndrakontorsChef
        
        AndrakontorsChef andraChef= new AndrakontorsChef(userID, userNamn);
        andraChef.setVisible(true);       
    }//GEN-LAST:event_andraKontorsChefActionPerformed

    private void andraOmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraOmradesChefActionPerformed
        //Skickas till AndraOmradesChef
        
        AndraOmradesChef andraChef= new AndraOmradesChef();
        andraChef.setVisible(true);        
    }//GEN-LAST:event_andraOmradesChefActionPerformed

    private void andraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAgentActionPerformed
        //Skickas till AndringAgent
        
        AndringAgent andraAgent= new AndringAgent(userID, userNamn);
        andraAgent.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_andraAgentActionPerformed

    private void oppnaAgentSidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oppnaAgentSidanActionPerformed
        InformationAgenter InfoAgent = new InformationAgenter(userID, userNamn);
        InfoAgent.setVisible(true);
    }//GEN-LAST:event_oppnaAgentSidanActionPerformed

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
            java.util.logging.Logger.getLogger(AndraAgenter_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAgenter_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAgenter_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAgenter_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAgenter_Admin(userID, userNamn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andraAgent;
    private javax.swing.JButton andraKontorsChef;
    private javax.swing.JButton andraOmradesChef;
    private javax.swing.JButton avbryt;
    private javax.swing.JButton gorTillAdmin;
    private javax.swing.JButton hamtaInfoAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton oppnaAgentSidan;
    private javax.swing.JButton registreraAgent;
    private javax.swing.JButton taBortAgent;
    // End of variables declaration//GEN-END:variables
}
