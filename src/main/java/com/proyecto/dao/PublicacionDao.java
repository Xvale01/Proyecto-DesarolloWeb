package com.proyecto.dao;

import com.proyecto.domain.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface PublicacionDao extends JpaRepository<Publicacion,Long>{
    
}
