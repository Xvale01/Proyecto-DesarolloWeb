package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Table (name="datosEnvio")
@Entity
@Data


public class DatosEnvio implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_datos")
    private Long idDatos;
    
    private String codigoPostal;
    private String direccionExacta;
    
    public DatosEnvio() {
    }

    public DatosEnvio(String codigoPostal, String direccionExacta) {
        this.codigoPostal = codigoPostal;
        this.direccionExacta = direccionExacta;
    }
}
