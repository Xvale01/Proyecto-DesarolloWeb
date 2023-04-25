package com.proyecto.service.impl;


import com.proyecto.dao.ArticuloDao;
import com.proyecto.dao.CategoriaDao;
import com.proyecto.domain.Articulo;
import com.proyecto.service.ArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */

@Service
public class ArticuloServiceImpl implements ArticuloService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private ArticuloDao articuloDao;
    
    @Autowired 
    private CategoriaDao categoriaDao;

    @Override
    public List<Articulo> getArticulos(boolean activos) {
            var lista=(List<Articulo>) articuloDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;

    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    public void deleteArticulo(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    public List<Articulo> getArticulosCategorias(boolean activos, String categoria) {
            var lista=(List<Articulo>) articuloDao.findByCategoria("Monederos");
            if (activos) {
            lista.removeIf(e -> e.isActivo());

        }
            return lista;
    }
    



}