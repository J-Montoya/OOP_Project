    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorProducto;
import java.util.Scanner;
import modelo.Producto;
import java.util.ArrayList;
import modelo.ProductosHerrajes;

/**
 *
 * @author UNALMAN
 */
public class VistaProductos {
    boolean acceso = true;
     Scanner leerDatos;
     ControladorProducto proControlador;
     //VistaGeneral vg = new VistaGeneral();
     ArrayList<Producto> arregloProductos = new ArrayList<>();

    public VistaProductos() {
        leerDatos = new Scanner(System.in);
        proControlador = new ControladorProducto();
        
        insertarDatosDefault();
        
        
    }
  
    private void insertarDatosDefault()
    {
        Producto objpp = new ProductosHerrajes("Trabajo",  "Pala", 10, "Gris", "", "Riduco", "Acero", 0, 0, 1, 0, 0);
        proControlador.insertar(objpp);
        objpp = new Producto("Machete", 345, "Negro", "", 
                                       "Riduco", "Acero", 10, 10000, 15000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Martillo", 1, "Negro", "", 
                                       "Riduco", "Acero", 10, 10000, 15000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Bisagra", 780, "Plata", "", 
                "Riduco", "Acero", 50, 2000, 4000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Manilla", 234, "Plata", "", "Riduco"
                        ,"Acero",20, 5000, 7000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Carretilla", 189, "Negro", "", 
                                       "Riduco", "Plastico y metal", 10, 10000, 15000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Destornillador", 44, "Rojo", "", 
                                       "Riduco", "Acero", 100, 1000, 1500, 100, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Mirilla", 521, "Plata", "", 
                "Riduco", "Acero", 100, 1000, 1500, 100, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Pomo", 667, "Negro", "", "Riduco",
                        "Acero",10, 4000, 7000, 500, 1);
        proControlador.insertar(objpp);
        objpp = new Producto("Tirador", 907, "Negro", "", "Riduco",
                        "Metal",15, 3000, 6000, 700, 1);
        proControlador.insertar(objpp);

    }
    private void insertarDatos()
    {
       
        Producto objpp1 = new Producto();
        System.out.println("Nombre del producto = ");
        objpp1.setNombreP(leerDatos.next());
        System.out.println("Serial del producto = ");
        objpp1.setNumeroserial(leerDatos.nextInt());
        leerDatos.nextLine();
        System.out.println("Color del producto = ");
        objpp1.setColor(leerDatos.nextLine());
        System.out.println("Marca del producto = ");
        objpp1.setMarca(leerDatos.nextLine());
        System.out.println("Material del producto = ");
        objpp1.setMaterial(leerDatos.nextLine());
        
        //Esto que está comentado lo hice para agregar el producto pero sin
        //el condicional
        //proControlador.insertar(objpp1);
       if(proControlador.insertar(objpp1)){
            System.out.println("Producto insertado");
        }        
        else
        {
            System.out.println("producto no insertado codigo del producto duplicado");
        }

    }
    public void menu()
    {
        System.out.println("\nMenu Productos");
        System.out.println("1. Insertar Datos");
        System.out.println("2. Mostrar todos los Datos");
        System.out.println("3. Mostrar dato especifico");
        //mostrar datos especificos de un producto por ID -done
        System.out.println("4. Actualizar dato");
        System.out.println("5. Borrar todos los datos");
        System.out.println("6. Borrar dato especifico");
        //Borrar dato especifico -done
        System.out.println("7. Ordenar datos");
        System.out.println("8. Salir del menu productos");
        
        
        int opcion = leerDatos.nextInt();
        switch (opcion) {
            case 1:
                insertarDatos();
                break;
            case 2:
                proControlador.consultar();
                break;
            case 3:
                proControlador.consultar(opcion);
                break;
            case 4:
                proControlador.actualizar(opcion);
                break;
            case 5:
                proControlador.borrar();
                break;
            case 6: 
                proControlador.borrar(opcion);
                break;
            case 7:
                proControlador.ordenar();
                break;
            case 8:
                VistaGeneral vg = new VistaGeneral();
                System.out.println("Bienvenido nuevamente al menu general");
                vg.menuGeneral();
                
        }
    }
    
}
