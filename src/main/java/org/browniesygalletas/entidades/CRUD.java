package org.browniesygalletas.entidades;

import java.util.List;

public interface CRUD {
    //
    void crearProducto(Producto producto);
    void eliminarProducto(Producto producto);
    List<Producto> listarProductos();
    void modificarProducto(Producto producto);
    Producto obtenerProductoPorId (Integer id);

    //CRUD Adicion
    void crearAdicion(Adiciones adicion);
    void eliminarAdicion(Adiciones adicion);

    List<Adiciones> listarAdiciones();
    void modificarAdiciones(Adiciones adicion);
    Adiciones obtenerAdicionPorId (Integer id);

    //VerFactura
    Factura obtenerFacturaPorId (Integer id);

    //CRUD Usuario
    void crearPedido(Pedido pedido);



}
