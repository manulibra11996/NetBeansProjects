/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios;

import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lenovo
 */
@Local
public interface ClienteService {

    public List<Cliente> listarClientes();//Obtener clientes.

    public Cliente EncontrarClientePorID(Cliente cliente);//Encontrar por id.

    public Cliente EncontrarClientePorNick(Cliente cliente);//Encontrar por nick.

    public Cliente EncontrarClientePorPassword(Cliente cliente);//Encontrar por password.

    public Cliente ValidarCliente(Cliente cliente);//Encontrar por password.

    public void AñadirCliente(Cliente cliente);//Añadir clientes.

    public void ModificarCliente(Cliente cliente);//Modificar clientes.

    public void RemoverCliente(Cliente cliente);//Remover clientes.

    public Cliente SacarID(Cliente cliente);//Saca el ida de cliente
}
