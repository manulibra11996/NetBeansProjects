/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author salvador
 */
@Remote
public interface HolaMundoEjbRemote {

    public int sumar(int x, int y);
}
