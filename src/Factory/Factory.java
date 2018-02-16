/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionpatrones;

/**
 *
 * @author SAMSUNG
 */
public class Factory {
    protected String tipoConexion;

    public Factory(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }
    
    public Conexion crearConexion(){
        if(tipoConexion.equalsIgnoreCase("oracle")){
            return new OracleConexion();
        }else if(tipoConexion.equalsIgnoreCase("sqlserver")){
            return new SqlserverConexion();
        }else{
            return new OracleConexion();
        }
    }
    
}
