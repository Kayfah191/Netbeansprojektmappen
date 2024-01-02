/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kayhan
 */
public class Validering {
     public static boolean epostFromat(String epost1){  
     String epost = "^(.+)@(.+)$";
      boolean resultat=false;
        if(epost1.matches(epost)){
            resultat=true;
        } 
            return resultat;
    
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
}
   