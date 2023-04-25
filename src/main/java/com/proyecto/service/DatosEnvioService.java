package com.proyecto.service;

import com.proyecto.domain.DatosEnvio;
import java.util.List;

public interface DatosEnvioService {
    public List<DatosEnvio> getDatosEnvios();
    public DatosEnvio getDatosEnvio(DatosEnvio datosEnvio);
    public void deleteDatosEnvio (DatosEnvio datosEnvio);
    public void saveDatosEnvio (DatosEnvio datosEnvio);

}