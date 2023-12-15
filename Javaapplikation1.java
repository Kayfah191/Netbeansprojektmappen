/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Scanner;

public class User 
{
    private int id;
    private String email;
    private String password;
    
    public void laggTillEpost(){
    
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ange e-post: ");
        String email = scanner.nextLine();

        System.out.print("Ange lösenord: ");
        String password = scanner.nextLine();

        if (LoginManager.authenticateUser(email, password)) {
            System.out.println("Inloggning lyckades!");
            // Här kan du lägga till kod för att låta användaren ändra lösenordet
        } else {
            System.out.println("Inloggning misslyckades. Fel e-post eller lösenord.");
        }
    }
}
   
    
