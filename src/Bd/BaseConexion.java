package Bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 */
public class BaseConexion {

    Connection cn = null;
    public Connection Conexion() {
        try {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String URL = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=C:/DB/repman.mdb";
            String da = "jdbc:odbc:repman";
            cn = DriverManager.getConnection("jdbc:ucanaccess://c:/DB/repman.accdb");
        } catch (SQLException e) {
            //System.out.println("Error En : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en:"+e.getMessage());
        }
        return cn;
    }
}


