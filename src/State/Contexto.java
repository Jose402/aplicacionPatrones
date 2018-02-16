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
public class Contexto {
    private Estado estado;
    
    public void setEstado(Estado e){
        this.estado=e;
    }
    
    public void pagar(){
        estado.pagar(this);
    }

    public Contexto() {
        this.estado = new ConDeuda();
    }
    
}
