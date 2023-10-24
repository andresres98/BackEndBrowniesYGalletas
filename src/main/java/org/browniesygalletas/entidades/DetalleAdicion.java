package org.browniesygalletas.entidades;

public class DetalleAdicion {
    private Pedido idPedido;
    private Producto idProducto;
    private Adiciones idAdicion;

    public DetalleAdicion(Pedido idPedido, Producto idProducto, Adiciones idAdicion) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.idAdicion = idAdicion;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Adiciones getIdAdicion() {
        return idAdicion;
    }

    public void setIdAdicion(Adiciones idAdicion) {
        this.idAdicion = idAdicion;
    }
}
