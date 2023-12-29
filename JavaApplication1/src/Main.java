
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Main {
    
    private static InfDB idb;
    private String userId;
    
     public static void main(String[] args) throws InfException {
         
         try {
             idb = new InfDB("mibdb","3306","mibdba","mibkey");
              System.out.println("Allt fungerar (hittills))");
         }
         
         catch (InfException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("Internt felmeddelande" + ex.getMessage());
         } 
     }
     
     public Main(String userId) {   //Kontruktor
        this.userId = userId;
        initializeUserInfo();
    }
     
     public  void initializeUserInfo(String userID) {
        // userID används för att hämta all information om användaren och initialisera gränssnittet
        
        try {
            String query = "SELECT * from " + userID + ";";
            HashMap<String, String> user = idb.fetchRow(query);
                
            if(user != null){
                
            }
        }
        catch(Exception ex){
            System.out.println("Internt felmeddelande: " + ex.getMessage());
        }
        
        
    }
      
     }