/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionpatrones;

import java.sql.Connection;

/**
 *
 * @author SAMSUNG
 */
public abstract class Conexion {

    public Conexion() {
    }
    public String nombreBaseDatos(){
        return "nombre";
    }
    public Connection conectar(){        
        return null;
    }
}
