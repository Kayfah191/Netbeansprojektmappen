
import java.util.ArrayList;
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
 * @author Kayhan
 */
public class TabortAgent extends javax.swing.JFrame {
   private InfDB idb;
    /**
     * Creates new form TabortAgent
     */
    public TabortAgent() {
        initComponents();
         try{
            idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
            System.out.println("Allt fungerar (hittills))");
        }
        
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
       
        fyllbox();
    }

    //Lägger in alla agenters namn i en combobox
    private void fyllbox() {
          String agentjbox = "Select namn from agent";
        ArrayList<String> allaAgenter;
        try {
            allaAgenter = idb.fetchColumn(agentjbox);
            for (String namn : allaAgenter) {
                boxAgenter.addItem(namn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Funkar inte");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        tNamn = new javax.swing.JTextField();
        lblnamn = new javax.swing.JLabel();
        lblTaBortAgent = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
        avbryt = new javax.swing.JButton();
        boxAgenter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnamn.setText("Namn på Agent");

        lblTaBortAgent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaBortAgent.setText("Ta bort Agent");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        avbryt.setText("Avbryt");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        boxAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAgenterActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj agent som tar över Aliens");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(avbryt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBort))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaBortAgent)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boxAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTaBortAgent)
                .addGap(28, 28, 28)
                .addComponent(lblnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBort)
                    .addComponent(avbryt))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
if(Validering.textNotEmpty(tNamn)){
        int fraga = JOptionPane.showConfirmDialog(null, " vill radera agenten?", "Bekräfta", JOptionPane.YES_NO_OPTION); //Bekräftelse ruta
// Kollar om man svara ja på bekräftelsen
            if (fraga == 0) { 
                try {   String agentNamn = boxAgenter.getSelectedItem().toString();
                    String nyAgentID = idb.fetchSingle("select agent_id from agent where namn ='" + agentNamn + "'");
       String agentID = idb.fetchSingle("select Agent_ID from agent where namn ='" + tNamn.getText() + "'");
                    String namn = idb.fetchSingle("select namn from agent where namn='" + tNamn.getText() + "'");
                    String agentjbox = "update alien set ansvarig_agent=" + nyAgentID + " where ansvarig_agent =" + agentID;
                    if (nyAgentID.equalsIgnoreCase(agentID)) {
                        JOptionPane.showMessageDialog(null, "Du kan inte välja agenten du tar bort");

                    } else {

                        idb.update(agentjbox); // Ändrar vem som är ansvarig för agenten man tar borts aliens 

                        idb.delete("delete from faltagent where Agent_ID =" + agentID);     //
                        idb.delete("delete from kontorschef where Agent_ID =" + agentID);   //Tar bort agenten från alla subklasser 
                        idb.delete("delete from omradeschef where Agent_ID =" + agentID);   //
                        idb.delete("delete from innehar_utrustning where agent_id=" + agentID); //Tar bort utrustningen som agenten hade
                        idb.delete("delete from agent where Agent_ID =" + agentID); // Tar bort agenten
                        JOptionPane.showMessageDialog(null, namn + " Agent är raderad" );
                        dispose();
                    }
                } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Misslyckad överföring till databasen, försök igen senare");
        }
        
            }
}


    }//GEN-LAST:event_taBortActionPerformed

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void boxAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAgenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxAgenterActionPerformed

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
            java.util.logging.Logger.getLogger(TabortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabortAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbryt;
    private javax.swing.JComboBox<String> boxAgenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTaBortAgent;
    private javax.swing.JLabel lblnamn;
    private javax.swing.JTextField tNamn;
    private javax.swing.JButton taBort;
    // End of variables declaration//GEN-END:variables
}
