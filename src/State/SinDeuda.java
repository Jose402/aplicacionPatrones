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
public class SinDeuda implements Estado{
    @Override
    public void pagar(Contexto context){
        context.setEstado(new SinDeuda());
    }
}
