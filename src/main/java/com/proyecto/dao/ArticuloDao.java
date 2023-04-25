package com.proyecto.dao;


import com.proyecto.domain.Articulo;
import com.proyecto.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface ArticuloDao extends JpaRepository<Articulo,Long>{
    Articulo findByCategoria (String categoria);
}
