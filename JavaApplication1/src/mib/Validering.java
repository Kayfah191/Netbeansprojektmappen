package mib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import oru.inf.InfDB;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Validering {
    
    private static InfDB idb;
    
    //Main-metod
    public static void main(String[] args){
        
        String Losen = "Password";
    }
    
    //Kollar om textruan är tom
   static public boolean textNotEmpty(JTextField txt){
        if (txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            txt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
      static public boolean passwordLengthCheck(JPasswordField txt){
        if (new String(txt.getPassword()).length() <= 6){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Lösenordet är för långt! Max 6 tecken.");
            txt.requestFocus();
            return false;
        }
    }
      static public boolean checkPhoneLength(JTextField txt){
        if (txt.getText().toString().length() <= 30){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Telefonnumret är för långt!");
            return false;
        }
      }
         static public boolean nameTextFieldLengthCheck(JTextField txt){
        if (new String(txt.getText()).length() <= 20){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Namnet är för långt! Max 20 tecken.");
            txt.requestFocus();
            return false;
        }
         }
           static public boolean passwordNotEmpty(JPasswordField txt){
        if (new String(txt.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Lösenordsfältet är tomt!");
            txt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    //Kollar om användarnamn är tom
    public static boolean valUsername(JTextField username){
        if(username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Användarnamn är tomt!");
            username.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
     static public boolean comboBoxNotEmpty(JComboBox box){
        if (box.getSelectedItem().toString().equals("---")){
            JOptionPane.showMessageDialog(null, "Inget valt i listan!");
            box.requestFocus();
            return false;
        }
        else{
        return true;
        }
    }
    
    //Validerar format på inmatat datum
    public static boolean valDatumFormat(JTextField date){
         String dateText = date.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Försöker parsa texten till ett LocalDate-objekt enligt formatter
            LocalDate.parse(dateText, formatter);
            return true;
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Datumformatet ska vara 'ÅÅÅÅ-MM-DD'");
            date.requestFocus();
            return false;
        }
    }
    
    //Validera längd på Lösenord    
    public static boolean valPasswordLength(String password){
        
        if(password.length() > 7){
             JOptionPane.showMessageDialog(null, "Lösenordet måsta vara 6 karaktärer eller mindre");
            return false;
        }
        else{
           return true;
        }
    }
//             
   
      public static boolean inteMinEpost(JTextField rutaAttKolla, String epost) {
        boolean resultat = true;
        if (rutaAttKolla.getText().equalsIgnoreCase(epost)) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Du kan inte ändra dig själv");
        }
        return resultat;
    }
}
