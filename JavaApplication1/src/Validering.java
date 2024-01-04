
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kayhan
 */
public class Validering {

    private static InfDB idb;

    static boolean exist(JTextField txtEpost) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Validering (InfDB idb) {
        
    }
     public static boolean epostFromat(String epost1){  
     String epost = "^(.+)@(.+)$";
      boolean resultat=false;
        if(epost1.matches(epost)){
            resultat=true;
        } 
            return resultat;
    
    }
       //KOllar ifall agenteposten finns
    public static boolean agentEpost(JTextField rutaAttKolla, InfDB idb) {
        Validering.idb=idb;
        boolean finns = false;
        ArrayList<String> epost;
        try {
            epost = idb.fetchColumn("select epost from agent");
            for (String enEpost : epost) {
                if (rutaAttKolla.getText().equalsIgnoreCase(enEpost)) {
                    finns = true;
                }
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databas är inte kopplat");
        }
        if (finns == false) {
            JOptionPane.showMessageDialog(null, "Eposten finns inte,vänligen kontrollera");
        }

        return finns;
    }
      //checks whether a text field is filled 
    public static boolean isFilled(JTextField field) {
        boolean result = true;
        if (field.getText().isEmpty()) {
            result = false;
            JOptionPane.showMessageDialog(null, "Please fill in all fields correctly.");
            field.requestFocus();
        }
        return result;
    }

    public static boolean losenordFormat(String losenord1){
        boolean resultat=false;
        String lösenord="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{4,20}$";
        if(losenord1.matches(lösenord)){
            resultat=true;
        } 
            return resultat;
    
    }
            public static boolean stringFormat(String namn1, String namn2){
                boolean stringFormat=false;
                try{
     if (namn1.equalsIgnoreCase(namn2)){
                       stringFormat =true;
                }            
                }   catch(Exception e){
                            stringFormat =false;
                 System.out.println("Något har gått fel");
            }
                 return stringFormat;
            }
            
    //turns a string entirely into upper case
    public static String upperCase(String word) {
        word = word.substring(0).toUpperCase();
        return word;
    }

    //restricts input to a single word
    public static boolean oneWord(String words) {
        boolean result = false;
        if (words.matches("(\\w|Å|Ä|Ö|å|ä|ö)+")) {
            result = true;
        }
        return result;
    }

    //checks whether an object is not null
    public static boolean exists(Object object) {
        boolean result = false;
        if (object != null) {
            result = true;
        }
        return result;
    }
    
    public static boolean losenordkoll(JTextField rutaAttKolla) {
        boolean resultat = true;
        String pass = rutaAttKolla.getText();
        if (pass.length() > 6 || pass.length() < 1) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Lösenordet ska vara mellan 1 till 6 tecken");
        }
        return resultat;
    }
    
    public static boolean tillåtetdatum(JTextField rutaAttKolla) {
        try {
            String dateStr = rutaAttKolla.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            Date date = sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fel format på datum");
            return false;
        }
    }
    
    public static boolean agentEpostFinns(JTextField rutaAttKolla, InfDB idb) {
        Validering.idb = idb;
        boolean finns = false;
        ArrayList<String> epost;
        try {
            epost = idb.fetchColumn("select epost from agent");
            for (String enEpost : epost) {
                if (rutaAttKolla.getText().equalsIgnoreCase(enEpost)) {
                    finns = true;
                }
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databas fel");
        }
        if (finns == false) {
            JOptionPane.showMessageDialog(null, "Eposten finns inte, var säker på att du stavat rätt");
        }

        return finns;
    }
    
}

   