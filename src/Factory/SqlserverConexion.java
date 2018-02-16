/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionpatrones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SAMSUNG
 */
public class SqlserverConexion extends Conexion{

    public SqlserverConexion() {        
    }
    @Override
    public String nombreBaseDatos(){
        return "sqlserver";
    }
    @Override
    public Connection conectar(){
        try {
            String connectionUrl = "jdbc:sqlserver://;database=DB_Name;integratedSecurity=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
            return conect;
          } 
          catch (SQLException ex) 
          {
            System.out.println("Error.");
            return null;
          }
    }
}
