package org.browniesygalletas.entidades;

public class Domicilio {
    private int idDomicilio;
    private SectoresDomicilios sector;
    private double precioSector;

    public Domicilio(int idDomicilio, SectoresDomicilios sector, double precioSector) {
        this.idDomicilio = idDomicilio;
        this.sector = sector;
        this.precioSector = precioSector;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public SectoresDomicilios getSector() {
        return sector;
    }

    public void setSector(SectoresDomicilios sector) {
        this.sector = sector;
    }

    public double getPrecioSector() {
        return precioSector;
    }

    public void setPrecioSector(double precioSector) {
        this.precioSector = precioSector;
    }
}
