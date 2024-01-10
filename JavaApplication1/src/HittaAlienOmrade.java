
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
public class HittaAlienOmrade extends javax.swing.JFrame {
 private InfDB idb;
    /**
     * Creates new form HittaAlienOmråde
     */
    public HittaAlienOmrade() {
        initComponents();
         try{
            idb = new InfDB("mibdb", "3306", "mibdba","mibkey");
            System.out.println("Allt fungerar (hittills))");
        }
        
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
        setOmradeJComboBox();
        
    }
    //Lägger till alla platser in i comboboxe
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValjPlats = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        sokOmradesBox = new javax.swing.JComboBox<>();
        sokPlatsBox = new javax.swing.JComboBox<>();
        resultatTextArea = new javax.swing.JTextArea();
        listaAlienEfterPlatsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValjPlats.setText("Välj plats");

        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRubrik.setText("Visa Aliens i:");

        sokOmradesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokOmradesBoxActionPerformed(evt);
            }
        });

        sokPlatsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        sokPlatsBox.setEnabled(false);
        sokPlatsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokPlatsBoxActionPerformed(evt);
            }
        });

        resultatTextArea.setEditable(false);
        resultatTextArea.setBackground(new java.awt.Color(255, 255, 255));
        resultatTextArea.setColumns(20);
        resultatTextArea.setRows(5);

        listaAlienEfterPlatsButton.setText("Lista aliens");
        listaAlienEfterPlatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlienEfterPlatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(445, 445, 445))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultatTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaAlienEfterPlatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lblValjPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sokOmradesBox, 0, 162, Short.MAX_VALUE)
                    .addComponent(sokPlatsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sokOmradesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjPlats)
                    .addComponent(sokPlatsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaAlienEfterPlatsButton)
                .addGap(18, 18, 18)
                .addComponent(resultatTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void setOmradeJComboBox(){
        // fyller comboboxen med valt område i de comboxarna metoden används
        ArrayList<String> omradenIDB;
try{
    String fraga="SELECT BENAMNING FROM OMRADE";
        omradenIDB = idb.fetchColumn(fraga);
        for(String omrade : omradenIDB){
            sokOmradesBox.addItem(omrade);
        }
//        valdComboBox.setModel(omradena);       
        }
        catch(InfException undantag){
            System.out.println("Fel med databas!" + undantag);
        }
}
    private void sokOmradesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokOmradesBoxActionPerformed
  String omradet = sokOmradesBox.getSelectedItem().toString();
        
        try{
        ArrayList<String> platsIOmradeIDB = idb.fetchColumn("SELECT BENAMNING FROM PLATS WHERE FINNS_I = (SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = \'" + omradet + "\')");
        DefaultComboBoxModel platserna = new DefaultComboBoxModel();
        for(String omrade : platsIOmradeIDB){
            platserna.addElement(omrade);
        }
        platserna.addElement("ALLA");
        sokPlatsBox.setEnabled(true);
        sokPlatsBox.setModel(platserna);       
        }
        catch(InfException undantag){
            System.out.println("Fel med databas!" + undantag);
        }
//             
    }//GEN-LAST:event_sokOmradesBoxActionPerformed
    private void listaAlienEfterPlatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlienEfterPlatsButtonActionPerformed
        resultatTextArea.setText("");
    ArrayList<HashMap<String, String>> alienInfo;

try {
    String omrade = sokOmradesBox.getSelectedItem().toString();
    String platsen = sokPlatsBox.getSelectedItem().toString();
    
    String sqlFraga = "SELECT Namn FROM Alien JOIN Plats ON Alien.Plats = Plats.Plats_ID WHERE Benamning = '" + omrade + "' AND Plats.Benamning = '" + platsen + "'";
    
    alienInfo = idb.fetchRows(sqlFraga);
    
    for (HashMap<String, String> a : alienInfo) {
        resultatTextArea.append(a.get("Namn") + "\n");
    }
} catch (InfException ettUndantag) {
    JOptionPane.showMessageDialog(null, "Databasfel!");
    System.out.println("Internt felmeddelande: " + ettUndantag.getMessage());
}
       
    }//GEN-LAST:event_listaAlienEfterPlatsButtonActionPerformed

    private void sokPlatsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokPlatsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sokPlatsBoxActionPerformed

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
            java.util.logging.Logger.getLogger(HittaAlienOmrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HittaAlienOmrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HittaAlienOmrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HittaAlienOmrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new HittaAlienOmrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblValjPlats;
    private javax.swing.JButton listaAlienEfterPlatsButton;
    private javax.swing.JTextArea resultatTextArea;
    private javax.swing.JComboBox<String> sokOmradesBox;
    private javax.swing.JComboBox<String> sokPlatsBox;
    // End of variables declaration//GEN-END:variables
}
