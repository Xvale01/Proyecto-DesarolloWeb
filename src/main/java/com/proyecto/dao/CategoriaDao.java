package com.proyecto.dao;

import com.proyecto.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long>{

}