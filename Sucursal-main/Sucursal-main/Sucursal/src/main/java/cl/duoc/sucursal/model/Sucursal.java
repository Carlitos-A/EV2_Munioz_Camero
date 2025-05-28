package cl.duoc.sucursal.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "SUCURSAL")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSUCURSAL")
    private Long idsucursal;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false, length = 255)
    private String direccion;

    @Column(name = "CIUDAD", nullable = false, length = 100)
    private String ciudad;

    @Column(name = "TELEFONO", nullable = false, length = 20)
    private String telefono;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "ENCARGADO", nullable = false, length = 20)
    private String encargado;

}
