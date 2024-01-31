
import mib.Validering;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author RiRikard Söderek
 */
public class RegistreraNyaAliens extends javax.swing.JFrame {

    private InfDB idb;
    public static String userID;
     public static String userNamn;
    public RegistreraNyaAliens(String userID) {
        initComponents();
        this.userNamn=userNamn;
        this.userID = userID; 
          try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internet felmeddelande" + e.getMessage());
        }
          fyllPlats();
        fyllCbAnsvarigAgent();
        
    }
     //Lägger till alla platser i comboboxen med alla platser som finns i databasen
    private void fyllPlats() {
        String q2 = "select benamning from Plats";
        
         ArrayList<String> comboList;
        try {

            comboList = idb.fetchColumn(q2);
            for (String s : comboList) {
                platsbox.addItem(s);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Felmeddelande:" );

        }
    }
    //Lägger in namn på comboboxen med alla agenter som finns i databasen
    private void fyllCbAnsvarigAgent() {
        String fraga = "select namn from agent";
        ArrayList<String> allaAgenter;
        try {
            allaAgenter = idb.fetchColumn(fraga);
            for (String namn : allaAgenter) {
                ansvarigAgentBox.addItem(namn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "error2");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        avbryt = new javax.swing.JButton();
        lTelefon = new javax.swing.JLabel();
        jTelefon = new javax.swing.JTextField();
        jNamn = new javax.swing.JTextField();
        lDatum = new javax.swing.JLabel();
        lRas = new javax.swing.JLabel();
        lEpost = new javax.swing.JLabel();
        textAntalArma = new javax.swing.JLabel();
        jEpost = new javax.swing.JTextField();
        antalArmar = new javax.swing.JTextField();
        lLosenord = new javax.swing.JLabel();
        jLosenord = new javax.swing.JTextField();
        lAnsvarigAlien = new javax.swing.JLabel();
        lNamn = new javax.swing.JLabel();
        lPlats = new javax.swing.JLabel();
        jDatum = new javax.swing.JTextField();
        registrera = new javax.swing.JButton();
        rasBox = new javax.swing.JComboBox<>();
        platsbox = new javax.swing.JComboBox<>();
        ansvarigAgentBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(java.awt.SystemColor.activeCaption);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registering av nya Besökare:");

        avbryt.setText("Stäng");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        lTelefon.setText("Telefon:");

        lDatum.setText("Datum:");

        lRas.setText("Ras:");

        lEpost.setText("Epost:");

        textAntalArma.setText("Antal armar:");

        antalArmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalArmarActionPerformed(evt);
            }
        });

        lLosenord.setText("Lösenord:");

        lAnsvarigAlien.setText("Ansvarig Agent:");

        lNamn.setText("Namn:");

        lPlats.setText("Plats");

        registrera.setText("Registrera");
        registrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraActionPerformed(evt);
            }
        });

        rasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Boglodite", "Längd" }));
        rasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("(ÅÅÅÅ-MM-DD)");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lNamn)
                                .addComponent(lEpost))
                            .addComponent(lDatum)
                            .addComponent(lLosenord)
                            .addComponent(lRas)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textAntalArma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lAnsvarigAlien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jNamn)
                                            .addComponent(jEpost)
                                            .addComponent(jLosenord)
                                            .addComponent(jTelefon)
                                            .addComponent(antalArmar)
                                            .addComponent(jDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ansvarigAgentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(lPlats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(platsbox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avbryt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGaTillbaka)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(registrera)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEpost)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDatum))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTelefon))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lRas)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAntalArma)
                    .addComponent(antalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAnsvarigAlien)
                    .addComponent(ansvarigAgentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platsbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registrera)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGaTillbaka)
                        .addComponent(avbryt))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        // Avbryt
        dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void registreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraActionPerformed
        // Knapp för att registrera en ny alien
        
        // En validering utförs för att kontrollera om textfälten för namn (jNamn) och telefon (jTelefon) inte är tomma
        // samtidigt som en längdvalidering utförs för namnet och telefonnumret med hjälp av validerings-metoderna
        if (Validering.valTextNotEmpty(jNamn) && Validering.valTextNotEmpty(jTelefon) && Validering.valPhoneLength(jTelefon) &&
            Validering.valPhoneLength(jTelefon)&& Validering.valDatumFormat(jDatum)){
        try {
                // Hämta nästa autoinkrementvärde för alien_ID från databasen
                String nextAID = idb.getAutoIncrement("Alien", "alien_ID");
                
                // Hämta och formatera användarinput från GUI-komponenter
                String epost = "'" + jEpost.getText() + "'";
                String datum = "'" + jDatum.getText() + "'";
                String namn = "'" + jNamn.getText() + "'";
                String losenord = "'" + jLosenord.getText() + "'";
                String telefon = "'" + jTelefon.getText() + "'";
                
                // Hämta vald agent och plats
                String ansvarigAgent = "'" + ansvarigAgentBox.getSelectedItem().toString() + "'";
                int AgentID = Integer.parseInt(idb.fetchSingle("select Agent_ID from agent where Namn=" + ansvarigAgent));
                String plats = "'" + platsbox.getSelectedItem().toString() + "'";
                int platsID = Integer.parseInt(idb.fetchSingle("select Plats_ID from plats where Benamning=" + plats));
                
                // Hämta vald ras
                String olikaval = rasBox.getSelectedItem().toString();

                // Skapa SQL-fråga för att lägga till alien i databasen
                String fraga = "insert into Alien values(" + nextAID + "," + datum + "," + epost + "," + losenord + "," + namn + "," + telefon + "," + platsID + "," + AgentID + ")";
                
                // Hämta antalet armar
                int antal = Integer.parseInt(antalArmar.getText());

                // Kolla vilken ras som är vald och utför lämplig åtgärd baserat på rasen
                if (olikaval.equals("Squid")) {
                    idb.insert(fraga);
                    idb.insert("insert into Squid values(" + nextAID + "," + antal + ")");
                    JOptionPane.showMessageDialog(null, namn + " är nu registrerad");
                    dispose(); // Stäng nuvarande fönster
                }

                if (olikaval.equals("Boglodite")) {
                    idb.insert(fraga);
                    idb.insert("insert into Boglodite values(" + nextAID + "," + antal + ")");
                    JOptionPane.showMessageDialog(null, namn + " är nu registrerad");
                    dispose();
                }
                if (olikaval.equals("Worm")) {
                    // Hämta längd för Worm-rasen
                    double langd = Double.parseDouble(antalArmar.getText());
                    idb.insert(fraga);
                    idb.insert("insert into Worm values(" + nextAID + "," + langd + ")");
                    JOptionPane.showMessageDialog(null, namn + " är nu registrerad");
                    dispose();
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
    }//GEN-LAST:event_registreraActionPerformed

    private void rasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasBoxActionPerformed
    String olikaval = rasBox.getSelectedItem().toString();
       if (olikaval.equals("Squid")) {
            textAntalArma.setText("Antal Armar: ");
        } else if (olikaval.equals("Boglodite")) {
            textAntalArma.setText("Antal Boogies: ");
        } else {
            textAntalArma.setText("Längd");
        }
    }//GEN-LAST:event_rasBoxActionPerformed

    private void antalArmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalArmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antalArmarActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        InformationAgenter tillAgentval = new InformationAgenter(userID,userNamn);
        tillAgentval.show();
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
            java.util.logging.Logger.getLogger(RegistreraNyaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new RegistreraNyaAliens(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ansvarigAgentBox;
    private javax.swing.JTextField antalArmar;
    private javax.swing.JButton avbryt;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JTextField jDatum;
    private javax.swing.JTextField jEpost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jLosenord;
    private javax.swing.JTextField jNamn;
    private javax.swing.JTextField jTelefon;
    private javax.swing.JLabel lAnsvarigAlien;
    private javax.swing.JLabel lDatum;
    private javax.swing.JLabel lEpost;
    private javax.swing.JLabel lLosenord;
    private javax.swing.JLabel lNamn;
    private javax.swing.JLabel lPlats;
    private javax.swing.JLabel lRas;
    private javax.swing.JLabel lTelefon;
    private javax.swing.JComboBox<String> platsbox;
    private javax.swing.JComboBox<String> rasBox;
    private javax.swing.JButton registrera;
    private javax.swing.JLabel textAntalArma;
    // End of variables declaration//GEN-END:variables
}
