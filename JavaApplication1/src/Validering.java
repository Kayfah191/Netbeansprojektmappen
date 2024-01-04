
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kayhan
 */
public class Validering {

    private InfDB idb;

    public Validering (InfDB idb) {
        this.idb = idb;
    }
     public static boolean epostFromat(String epost1){  
     String epost = "^(.+)@(.+)$";
      boolean resultat=false;
        if(epost1.matches(epost)){
            resultat=true;
        } 
            return resultat;
    
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

}
   