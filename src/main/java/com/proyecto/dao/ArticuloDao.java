package com.proyecto.dao;


import com.proyecto.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface ArticuloDao extends JpaRepository<Articulo,Long>{
}
