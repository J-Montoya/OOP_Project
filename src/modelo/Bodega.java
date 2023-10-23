/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Bodega {
    private String nombre;
    private int id;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bodega(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public Bodega(){

    }
    private void insertarDatosDefault()
    {

    }
    
    
    
}
