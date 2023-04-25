package com.proyecto.service.impl;

import com.proyecto.dao.ClienteDao;
import com.proyecto.dao.DatosEnvioDao;
import com.proyecto.domain.Cliente;
import com.proyecto.domain.DatosEnvio;
import com.proyecto.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    //Esto crea una unica copia de un objeto
    @Autowired
    private ClienteDao clienteDao;
    
        @Autowired
        private DatosEnvioDao datosEnvioDao;
        
        
    @Override
    public List<Cliente> getClientes() {
        return(List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdComprador()).orElse(null);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        DatosEnvio datosEnvio = cliente.getDatosEnvio();
        datosEnvio=datosEnvioDao.save(datosEnvio);
        cliente.setDatosEnvio(datosEnvio);
        
        clienteDao.save(cliente);
    }
    
 
    
}
