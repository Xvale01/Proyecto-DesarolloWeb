
package com.proyecto.service;

import com.proyecto.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //Obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos Cliente
    public List<Cliente> getClientes();

    //Obtiene el registro de la tabla cliente
    //que tiene el idClienet pasado por el objeto cliente
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la tabla cliente
    
    public void deleteCliente(Cliente cliente);
    public void saveCliente (Cliente cliente);
    
}
