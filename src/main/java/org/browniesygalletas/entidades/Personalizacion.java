package org.browniesygalletas.entidades;

public class Personalizacion {
    private int idPersonalizacion;
    private String descripcion;
    private Producto idProducto;

    public Personalizacion(int idPersonalizacion, String descripcion, Producto idProducto) {
        this.idPersonalizacion = idPersonalizacion;
        this.descripcion = descripcion;
        this.idProducto = idProducto;
    }

    public int getIdPersonalizacion() {
        return idPersonalizacion;
    }

    public void setIdPersonalizacion(int idPersonalizacion) {
        this.idPersonalizacion = idPersonalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
}
