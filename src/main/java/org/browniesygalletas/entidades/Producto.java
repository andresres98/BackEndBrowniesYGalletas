package org.browniesygalletas.entidades;

public class Producto {
    private Integer id;
    private String nombre;
    private double precio;
    private String descripcion;
    private CategoriaProductos categoriaProducto;
    private boolean personalizacionProducto;

    public Producto(Integer id, String nombre, double precio, String descripcion, CategoriaProductos categoriaProducto, boolean personalizacionProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoriaProducto = categoriaProducto;
        this.personalizacionProducto = personalizacionProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaProductos getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProductos categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public boolean isPersonalizacionProducto() {
        return personalizacionProducto;
    }

    public void setPersonalizacionProducto(boolean personalizacionProducto) {
        this.personalizacionProducto = personalizacionProducto;
    }
}
