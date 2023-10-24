package org.browniesygalletas.entidades;

public class DetalleVenta {
    private Producto idProducto;
    private Pedido idPedido;
    private Integer cantidad;

    public DetalleVenta(Producto idProducto, Pedido idPedido, Integer cantidad) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return 1;
    }
}
