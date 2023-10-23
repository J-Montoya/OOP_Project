/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sustentacion1;
import modelo.ProductosElectricos;
import controlador.ControladorProducto;
import java.util.Scanner;
import modelo.Producto;
/**
 *
 * @author Jonathan
 */
public class PrincipalSustentacion{

    public static void main(String[] args) {
    //1
        Scanner scan = new Scanner(System.in);
        Producto electricoProducto = new ProductosElectricos(2000.0, 1000, "sierra", 22, "Gris", "", "Imusa", "diamante", 2, 1200, 3400, 500, 1 );
        Producto electricoProducto2 = new ProductosElectricos(2000.0, 2000, "bateria", 21, "Gris", "", "Imusa", "diamante", 2, 1200, 3400, 500, 2 );
        Producto electricoProducto3 = new ProductosElectricos(2000.0, 100, "radio", 20, "Gris", "", "Imusa", "diamante", 2, 1200, 3400, 500, 3 );
        Producto electricoProducto4 = new ProductosElectricos(2000.0, 1000, "celular", 23, "Gris", "", "Imusa", "diamante", 2, 1200, 3400, 500, 4 );  
    //2    
        ControladorProducto nuevo = new ControladorProducto();
        nuevo.insertar( electricoProducto);
        nuevo.insertar(electricoProducto2);
        nuevo.insertar(electricoProducto3);
        nuevo.insertar(electricoProducto4);
    //3    
        nuevo.ordenar();        
        Producto electricoProducto5 = new ProductosElectricos(2000.0, 1000, "datafono", 24, "Gris", "", "Imusa", "diamante", 2, 1200, 3400, 500, 1 );
                
        System.out.println("inserte numero id o serial del nuevo producto: ");
        electricoProducto5.setNumeroserial(scan.nextInt());
        nuevo.insertar(electricoProducto5);
    //4  
        nuevo.consultar();
    }
    
}
