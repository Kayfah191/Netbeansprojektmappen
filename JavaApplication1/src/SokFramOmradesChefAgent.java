
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
public class SokFramOmradesChefAgent extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form SokFramOmradesChefAgent
     */
    public SokFramOmradesChefAgent() {
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

  private String ChefForOmrade(String omrade) throws InfException {
        String fraga = "SELECT agent.Namn FROM Omradeschef " +
            "JOIN Omrade ON Omradeschef.Omrade = Omrade.Omrades_ID " +
            "JOIN Agent ON Omradeschef.Agent_ID = Agent.Agent_ID " +
            "WHERE Omrade.Benamning = '" + omrade + "'";
        return idb.fetchSingle(fraga);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        omradeBox = new javax.swing.JComboBox<>();
        OmradesChef = new javax.swing.JLabel();
        sokKnapp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textrutaAnsvarigAgent = new javax.swing.JTextArea();
        jExitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        omradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        OmradesChef.setText("Områdes Chef");

        sokKnapp.setText("Sök");
        sokKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokKnappActionPerformed(evt);
            }
        });

        textrutaAnsvarigAgent.setColumns(20);
        textrutaAnsvarigAgent.setRows(5);
        jScrollPane1.setViewportView(textrutaAnsvarigAgent);

        jExitB.setText("Avbryt");
        jExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(omradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sokKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(OmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jExitB)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OmradesChef)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(omradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sokKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jExitB))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokKnappActionPerformed

        String omrade = omradeBox.getSelectedItem().toString();
        try{
            String OmradeChef = ChefForOmrade(omrade);

            textrutaAnsvarigAgent.setText("Områdeschefen För " + omrade + " är: " + OmradeChef + "");
        } catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Databas funkar ej");
        
        }
    }//GEN-LAST:event_sokKnappActionPerformed

    private void jExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitBActionPerformed
        //Avbrytknapp
        JFrame frame = new JFrame("Avbryt");
        if(JOptionPane.showConfirmDialog(frame, "Är du säker på att du vill avbryta?", "Avbryt",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_jExitBActionPerformed

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
            java.util.logging.Logger.getLogger(SokFramOmradesChefAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokFramOmradesChefAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokFramOmradesChefAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokFramOmradesChefAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SokFramOmradesChefAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OmradesChef;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jExitB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> omradeBox;
    private javax.swing.JButton sokKnapp;
    private javax.swing.JTextArea textrutaAnsvarigAgent;
    // End of variables declaration//GEN-END:variables
}
