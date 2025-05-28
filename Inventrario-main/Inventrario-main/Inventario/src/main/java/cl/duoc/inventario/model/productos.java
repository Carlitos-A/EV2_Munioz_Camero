package cl.duoc.inventario.model;
//Clase que define la entidad del producto, esta definida y mapeada la tabla donde estarán estas entidades en BD. Contiene todos los atributos para
// describir un producto

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "PRODUCTOS")
@AllArgsConstructor
@NoArgsConstructor
public class productos {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idProducto")
        private Long idProducto;

        @Column(name = "NOMBRE", nullable = false)
        private String nombre;

        @Column(name = "DESCRIPCION", nullable = false)
        private String descripcion;

        @Column(name = "CATEGORIA",nullable = false)
        private String categoria;

        @Column(name = "MARCA",nullable = false)
        private String marca;

        @Column(name = "PRECIO_VENTA", nullable = false)
        private Integer precioVenta;

        @Column(name = "STOCK_ACTUAL")
        private Integer stockActual;

        @Column(name = "UNIDAD_MEDIDA")
        private String unidadMedida;
    }

