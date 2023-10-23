/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Producto;

/**
 *
 * @author UNALMAN
 */
public class Principal {
    public static void main(String[] args) {
        VistaProductos vp = new VistaProductos();
        VistaGeneral vg = new VistaGeneral();
        while(true)
        {
            vg.menuGeneral();
            
        }
        
    }
    
}
