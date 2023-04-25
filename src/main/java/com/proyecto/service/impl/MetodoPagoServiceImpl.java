package com.proyecto.service.impl;

import com.proyecto.dao.MetodoPagoDao;
import com.proyecto.domain.MetodoPago;
import com.proyecto.service.MetodoPagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoServiceImpl implements MetodoPagoService{

    @Autowired
    private MetodoPagoDao metodoPagoDao;

    @Override
    public List<MetodoPago> getMetodoPagos() {
        return (List<MetodoPago>) metodoPagoDao.findAll();
    }

    @Override
    public MetodoPago getMetodoPago(MetodoPago metodoPago) {
        return metodoPagoDao.findById(metodoPago.getIdMetodo()).orElse(null);
    }

    @Override
    public void deleteMetodoPago(MetodoPago metodoPago) {
        metodoPagoDao.delete(metodoPago);
    }

    @Override
    public void saveMetodoPago(MetodoPago metodoPago) {
        metodoPagoDao.save(metodoPago);
    }



}
