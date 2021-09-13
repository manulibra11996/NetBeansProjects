/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author salvador
 */
@Stateless
public class HolaMundoEjebIml implements HolaMundoEjbRemote{

    @Override
    public int sumar(int x, int y) {
        System.out.println("ejecutando metodo sumar en el servidor");
        return x+y;
    }
    
}
