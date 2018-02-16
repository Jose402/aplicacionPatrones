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
public class Singleton {
    private static Singleton UsuarioActual;
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(UsuarioActual == null){
           UsuarioActual =new Singleton();           
        }
        return UsuarioActual;
    }
    
}
