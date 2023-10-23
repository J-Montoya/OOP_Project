/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UNALMAN
 */
public class ProductosElectricos extends Producto{
    private double capacidadCarga;
    private int calibre;

    public ProductosElectricos(double capacidadCarga, int calibre, String nombreP, int numeroserial, String color, String imagen, String marca, String material, int demanda, float costoproduccion, float precioventa, float costoalmacenamiento, int bodegaId) {
        super(nombreP, numeroserial, color, imagen, marca, material, demanda, costoproduccion, precioventa, costoalmacenamiento, bodegaId);
        this.capacidadCarga = capacidadCarga;
        this.calibre = calibre;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    
    
}
