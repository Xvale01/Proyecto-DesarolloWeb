package com.proyecto.service.impl;

import com.proyecto.dao.PublicacionDao;
import com.proyecto.domain.Publicacion;
import com.proyecto.service.PublicacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */

@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionDao publicacionDao;

    @Override
    public List<Publicacion> getPublicaciones() {
        var lista = (List<Publicacion>) publicacionDao.findAll();        
        return lista;

    }

    @Override
    public Publicacion getPublicacion(Publicacion publicacion) {
        return publicacionDao.findById(publicacion.getIdPublicacion()).orElse(null);
    }

    @Override
    public void deletePublicacion(Publicacion publicacion) {
        publicacionDao.delete(publicacion);
    }

    @Override
    public void savePublicacion(Publicacion publicacion) {
        publicacionDao.save(publicacion);
    }

}