/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionpatrones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SAMSUNG
 */
public class OracleConexion extends Conexion{

    public OracleConexion() {
        
    }
    @Override
    public String nombreBaseDatos(){
        return "oracle";
    }
    @Override
    public Connection conectar(){
        String url = "jdbc:oracle:thin:@//nombredelservidor:puerto/nombredelservicio";
        try {
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            Connection conect = DriverManager.getConnection(url, "usuario", "password");
            return conect;
        } catch (SQLException ex) {
            System.out.println("error");
            return null;
        }
    }
}
