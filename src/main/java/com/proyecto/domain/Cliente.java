
package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data //data a lo que se refiere es que esta clase sera usada para almacenar datos
@Entity //se va a mappear de una tabla
@Table(name="cliente") //aqui se le dice de cual tabla


public class Cliente implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long idCliente;
    
    private String cedula;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String correo;
    private String telefono;
    
    @JoinColumn(name="id_datos", referencedColumnName = "id_datos")
    @ManyToOne
    private DatosEnvio datosEnvio;

    public Cliente() {
    }
    
    public Cliente(String cedula, String nombre, String apellidos, String fechaNacimiento, String correo, String telefono, DatosEnvio datosEnvio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.datosEnvio = datosEnvio;
    }
}
