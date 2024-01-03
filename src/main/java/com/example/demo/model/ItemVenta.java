package com.example.demo.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemVenta {

    private String producto;
    private int cantidad;
    private int subtotal;

    @ManyToOne
    @JoinColumn(name = "Productos")
    private Producto productos;
    @ManyToOne
    @JoinColumn(name = "Venta")
    private Venta venta;
}
