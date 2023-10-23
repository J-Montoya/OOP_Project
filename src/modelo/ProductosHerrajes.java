/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UNALMAN
 */
public class ProductosHerrajes extends Producto{
    private String tipoElemento;

    public ProductosHerrajes(String tipoElemento, String nombreP, int numeroserial, String color, String imagen, String marca, String material, int demanda, float costoproduccion, float precioventa, float costoalmacenamiento, int bodegaId) {
        super(nombreP, numeroserial, color, imagen, marca, material, demanda, costoproduccion, precioventa, costoalmacenamiento, bodegaId);
        this.tipoElemento = tipoElemento;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }
    
}
