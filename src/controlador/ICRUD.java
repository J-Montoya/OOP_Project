/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import modelo.Producto;

/**
 *
 * @author UNALMAN
 */
public interface ICRUD {
    //public final static int a=10;
    public boolean insertar(Object objecto); //Create
    public Object consultar(Object objecto);//Read
    public void consultar();
    public Object actualizar(Object objecto); //Update
    public boolean borrar(Object objecto);  //Delete
    public void ordenar();  //Delete
    
}
