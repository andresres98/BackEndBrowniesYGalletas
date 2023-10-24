package org.browniesygalletas.entidades;

import java.util.Date;

public class Pedido {
    private int idPedido;
    private Cliente idCliente;
    private Date fechaPedido;
    private Date fechaEntregaPedido;
    private String direccionEntrega;

    public Pedido(int idPedido, Cliente idCliente, Date fechaPedido, Date fechaEntregaPedido, String direccionEntrega) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        this.fechaEntregaPedido = fechaEntregaPedido;
        this.direccionEntrega = direccionEntrega;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Date fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
}
