package org.browniesygalletas.entidades;

import java.util.List;
import java.util.Objects;

public class Administrador extends ServiceUtil{
    private String adminUser;
    private String passwordAdminUser;

    public Administrador(String adminUser, String passwordAdminUser) {
        this.adminUser = adminUser;
        this.passwordAdminUser = passwordAdminUser;
    }

    public String getadminUser() {
        return adminUser;
    }

    public void setadminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getPasswordAdminUser() {
        return passwordAdminUser;
    }

    public void setPasswordAdminUser(String passwordAdminUser) {
        this.passwordAdminUser = passwordAdminUser;
    }

    public boolean logginAdmin(String adminUser, String passwordAdminUser ){
        if (adminUser.equals(this.adminUser) && passwordAdminUser.equals(this.passwordAdminUser)){
            System.out.println("El loggin ha sido exitoso");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void crearProducto(Producto producto) {
        super.crearProducto(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        super.eliminarProducto(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return super.listarProductos();
    }

    @Override
    public void modificarProducto(Producto producto) {
        super.modificarProducto(producto);
    }

    @Override
    public Producto obtenerProductoPorId(Integer id) {
        return super.obtenerProductoPorId(id);
    }

    @Override
    public void crearAdicion(Adiciones adicion) {
        super.crearAdicion(adicion);
    }

    @Override
    public void eliminarAdicion(Adiciones adicion) {
        super.eliminarAdicion(adicion);
    }

    @Override
    public List<Adiciones> listarAdiciones() {
        return super.listarAdiciones();
    }

    @Override
    public void modificarAdiciones(Adiciones adicion) {
        super.modificarAdiciones(adicion);
    }

    @Override
    public Adiciones obtenerAdicionPorId(Integer id) {
        return super.obtenerAdicionPorId(id);
    }

    @Override
    public Factura obtenerFacturaPorId(Integer id) {
        return super.obtenerFacturaPorId(id);
    }
}
