package com.proyecto.service;

import com.proyecto.domain.Publicacion;
import java.util.List;

/**
 *
 * @author emers
 */
public interface PublicacionService {

    public List<Publicacion> getPublicaciones();

    public Publicacion getPublicacion(Publicacion publicacion);

    public void deletePublicacion(Publicacion publicacion);

    public void savePublicacion(Publicacion publicacion);

}
