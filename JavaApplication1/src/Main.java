
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

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
     
     public void setNamn() {
         
     }
     
}
