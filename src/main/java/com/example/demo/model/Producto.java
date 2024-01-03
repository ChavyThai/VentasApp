package com.example.demo.model;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private int idProducto;
    private String nombre;
    private int fechaDeFabricacion;
    private String descripcion;
    private int peso_Cantidad;
    private int precio;

    @OneToMany(mappedBy = "producto")
    private List<ItemVenta> itemsVenta;
}
