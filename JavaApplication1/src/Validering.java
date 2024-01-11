import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Vad som valideras:
//- Om textruta är tom
//- Om Användarnamn är tom
//- Om lösenord är tom
//
//- Om datumformatet är rätt (ÅÅÅÅ-MM-DD)
//
//- Längd på lösenord



public class Validering {
    
    private static InfDB idb;
    
    //Main-metod
    public static void main(String[] args){
        
        String Losen = "Password";
    }
    
    //Kollar om textruan är tom
    public static boolean textFieldNotEmpty(JTextField txt){
        if(txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
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
    
    //Kollar om lösenord är tom
    public static boolean valPasswordFieldNotEmpty(JPasswordField password){
        if(password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Lösenord är tomt!");
            password.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
    //Validerar format på inmatat datum
    public static boolean valDatumFormat(String date){
        String dateRegex = "\\d{4}-\\d{2}-\\d{2}$";
        if(!date.matches(dateRegex)){
            JOptionPane.showMessageDialog(null, "Datumformatet måste vara i ÅÅÅÅ-MM-DD");
            return false;
        }
        else {
            return true;
        }
//              String[] datum = date.getText().split("-");
//        boolean allNumbers = true;
//        for (String datumet : datum){
//            try{
//                System.out.println(datumet);
//                int testInt = Integer.parseInt(datumet);
//            }
//            catch( NumberFormatException ex){
//                allNumbers = false;
//                JOptionPane.showMessageDialog(null, "Använd ändas nummer");
//                System.out.println("Inte nummer");
//            }
//        }
//        if (allNumbers && datum.length == 3 && datum[0].length() == 4 && datum[1].length() == 2 && datum[2].length() == 2){
//            return true;
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Datumformatet ska vara numeriskt, enligt detta format 'ÅÅÅÅ-MM-DD'.");
//            date.requestFocus();
//            return false;
//        }
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
}
