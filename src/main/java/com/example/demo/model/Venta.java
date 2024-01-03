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
public class Venta {

    private String NombreLocal;
    private int idVenta;
    private int fechaVenta;
    private String itemsVenta;
    private String metodoPago;
    private int Descuento;
    private int totalVenta;

    @OneToMany(mappedBy = "venta")
    private List<ItemVenta> itemVenta;
}
