/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class ProductosVariados extends  Producto{
    //El producto serán juegos, por ello pedimos el genero del juego
    private String genero;
    //Persona o equipo que realizó el juego
    private String autor;
    //Para que rango de personas es recomendable
    private int clasificacion;

    public ProductosVariados(String genero, String autor, int clasificacion, String nombreP, int numeroserial, String color, String imagen, String marca, String material, int demanda, float costoproduccion, float precioventa, float costoalmacenamiento, int bodegaId) {
        super(nombreP, numeroserial, color, imagen, marca, material, demanda, costoproduccion, precioventa, costoalmacenamiento, bodegaId);
        this.genero = genero;
        this.autor = autor;
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    
    
    
}
