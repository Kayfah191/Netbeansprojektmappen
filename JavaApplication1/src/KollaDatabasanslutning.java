/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Rikard Söderek
 */

public class KollaDatabasanslutning {

    private Connection conn = null;

    public KollaDatabasanslutning(String dbUrl, String user, String password) {
        try {
            conn = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Anslutning till databasen lyckades!");
        } catch (SQLException e) {
            System.out.println("Anslutningen misslyckades: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Anslutningen stängd.");
            } catch (SQLException e) {
                System.out.println("Kunde inte stänga anslutning: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Här skapar du en instans av KollaDatabasanslutning för att testa din anslutning.
        // Byt ut "jdbc:dburl", "username", och "password" mot dina faktiska databasuppgifter.
        KollaDatabasanslutning kda = new KollaDatabasanslutning("jdbc:mysql://localhost:3306//mibdb", "mibdba", "mibkey");
        
        // Här kan du lägga till kod för att utföra operationer med databasen om du vill.
        
        // Glöm inte att stänga anslutningen när du är klar.
        kda.closeConnection();
    }
}
