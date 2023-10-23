/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import modelo.Producto;
import modelo.ProductosElectricos;
import modelo.ProductosHerrajes;
import modelo.ProductosVariados;
/**
 *
 * @author UNALMAN
 */
public class ControladorProducto implements ICRUD{
    Scanner scan = new Scanner(System.in);
    public static ArrayList<Producto> arregloProductos = new ArrayList<Producto>();
    
    @Override
    public boolean insertar(Object obj) {
        boolean insertado = true;  
          Producto prod1 = new Producto();
          prod1 = (Producto)obj;

            if (arregloProductos.isEmpty()) {
             arregloProductos.add(prod1);
            } else {
                for (Producto pp : arregloProductos) {
                    if (pp.getNumeroserial() == prod1.getNumeroserial()) {
                        insertado = false;
                        break; //
                    }
                }
                if (insertado) {
                    arregloProductos.add(prod1);
                }
            }
    
            return insertado;
        }

    @Override
    public Object consultar(Object objecto) {
        Collections.sort(arregloProductos, (Producto a, Producto b) -> Integer.compare(a.getNumeroserial(), b.getNumeroserial()));

        System.out.println("Indique el ID del producto que quiere consultar");
        int numeroBuscado = scan.nextInt();

        int index = MetodosOrdenamiento.busquedaBinaria(numeroBuscado);

        if (index >= 0) {
            // Si se encuentra el producto, este va a regresar el producto con los datos completos
            Producto productoEncontrado = arregloProductos.get(index);
            System.out.println(productoEncontrado.toString());
            return productoEncontrado;            
        } 
        else{
            System.out.println("Producto con ID " + numeroBuscado + " no encontrado.");
            return null; // Si no se encuentra, puedes retornar null o un mensaje de error.
        }
    }

    @Override
    public void consultar() {
        
        
        for(int i=0; i< arregloProductos.size(); i++)
        {
            System.out.println(arregloProductos.get(i).toString());
        }
        //for(Producto pp: arregloProductos)
        //{
          //  System.out.println(pp.toString());
        //}
            
    }

    @Override
    public boolean borrar(Object objecto) {
        //Antes de borrar hacer el ordenamiento por ID aqui mismo para no obstruir al usuario
        Collections.sort(arregloProductos, (Producto a, Producto b) -> Integer.compare(a.getNumeroserial(), b.getNumeroserial()));
        boolean borrado = false;
        
        System.out.println("Indique el ID del producto que quiere borrar");
        int numeroBuscado = scan.nextInt();
        
        int index = MetodosOrdenamiento.busquedaBinaria(numeroBuscado);
        if (index >= 0){
            // Encuentro el id del producto y lo borro
            arregloProductos.remove(index);
            System.out.println("Producto con ID " + numeroBuscado + " ha sido borrado");
            borrado = true;
        } 
        else{
            System.out.println("Producto con ID " + numeroBuscado + " no encontrado");
            borrado = false;
        }
        return borrado;
    }
    public void borrar(){
        //Borrar todo (todos los productos)
        System.out.println("Si continua, borrará todos los productos independientemente de su stock");
        System.out.println("Esta seguro que desea continuar con la eliminacion de productos? ");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opc = scan.nextInt();
        while (opc != 1 && opc != 2){            
            System.out.println("Indique una opcion valida");
            opc = scan.nextInt();
        }
        if (opc == 1){
          arregloProductos.clear();
            System.out.println("Todos los productos han sido borrados");
        }
        if (opc == 2){
            System.out.println("Los productos se han dejado como estaban");
        }
    }

    @Override
    public void ordenar() {
        System.out.println("Indique como requiere ordenar ");
        System.out.println("1. Ordenar por ID");
        System.out.println("2. Ordenar por nombre");
        System.out.println("3. Ordenar por precio de venta");
        System.out.println("4. Ordenar por marca");
        int opc = scan.nextInt();
        while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {
            System.out.println("Ingrese alguna de las opciones mostradas");
            opc = scan.nextInt();
        }
        if (opc == 1){
            Collections.sort(arregloProductos, (Producto a, Producto b) -> Integer.compare(a.getNumeroserial(), b.getNumeroserial()));
        }
        if (opc == 2){
            MetodosOrdenamiento.quicksortNombre(arregloProductos, 0, arregloProductos.size() - 1);
        }
        if (opc == 3){
            MetodosOrdenamiento.ordenacionMergeSort(arregloProductos);
        }
        if (opc == 4){
            MetodosOrdenamiento.burbujaMarca(arregloProductos);        
        }
        
        System.out.println("Ordenamiento completado");
    }

    @Override
    public Object actualizar(Object objecto) {
        System.out.println("Indique el ID del producto que quiere actualizar");
        int numeroBuscado = scan.nextInt();

        int index = MetodosOrdenamiento.busquedaBinaria(numeroBuscado);

        if (index >= 0) {
            Producto productoActualizar = arregloProductos.get(index);

            // Solicitar la actualización de todos los atributos del producto
            System.out.println("Ingrese el nuevo nombre: ");
            String nuevoNombre = scan.next();
            productoActualizar.setNombreP(nuevoNombre);

            System.out.println("Ingrese el nuevo serial o ID: ");
            int nuevoSerial = scan.nextInt();
            productoActualizar.setNumeroserial(nuevoSerial);

            System.out.println("Ingrese nuevo color: ");
            String nuevoColor = scan.next();
            productoActualizar.setColor(nuevoColor);
            
            System.out.println("Ingrese la nueva marca: ");
            String nuevaMarca = scan.next();
            productoActualizar.setMarca(nuevaMarca);
            
            System.out.println("material nuevo: ");
            String nuevoMaterial = scan.next();
            productoActualizar.setMaterial(nuevoMaterial);
            
            System.out.println("nueva demanda?: ");
            int demandaNueva = scan.nextInt();
            productoActualizar.setDemanda(demandaNueva);
            
            System.out.println("nuevo coste de produccion: ");
            float costeProducionNuevo = scan.nextFloat();
            productoActualizar.setCostoproduccion(costeProducionNuevo);
            
            System.out.println("nuevo coste almacenamiento: ");
            float costeAlmacenamientoNuevo = scan.nextFloat();
            productoActualizar.setCostoalmacenamiento(costeAlmacenamientoNuevo);
            
            System.out.println("nuevo precio de venta");
            float nuevoPrecioVenta = scan.nextFloat();
            productoActualizar.setPrecioventa(nuevoPrecioVenta);
            
            //Cuando pueda hacer la conexion entre Bodegas y Productos, coloco bodegaid
            //Para poder colocarle el condicional de que no funcione si el numero de bodega
            //no existe, recordar que este atributo esta en la clase Bodega
            
            if (productoActualizar instanceof ProductosElectricos) {
                // El producto es de tipo eléctrico
                //nope- ProductosElectricos productoElectrico = (ProductosElectricos) productoActualizar;

                System.out.println("nueva capacidad de carga");
                float nuevoCapacidadCarga = scan.nextFloat();
                ((ProductosElectricos) productoActualizar).setCapacidadCarga(nuevoCapacidadCarga);

                System.out.println("nuevo calibre");
                int nuevoCalibre = scan.nextInt();
                ((ProductosElectricos) productoActualizar).setCalibre(nuevoCalibre);

                // Actualizar los atributos específicos
            }
            else if (productoActualizar instanceof ProductosHerrajes) {
                
                System.out.println("nuevo tipo de elemento");
                String nuevoTipoElemento = scan.next();
                ((ProductosHerrajes) productoActualizar).setTipoElemento(nuevoTipoElemento);
                                
            }
            else if (productoActualizar instanceof ProductosVariados){
                
                System.out.println("Nuevo genero: ");
                String nuevoGenero = scan.next();
                ((ProductosVariados) productoActualizar).setGenero(nuevoGenero);
                
                System.out.println("Nuevo autor: ");
                String nuevoAutor = scan.next();
                ((ProductosVariados) productoActualizar).setAutor(nuevoAutor);
                
                System.out.println("Nueva clasificacion: ");
                int nuevaClasificacion = scan.nextInt();
                ((ProductosVariados) productoActualizar).setClasificacion(nuevaClasificacion);                
            }

            System.out.println("Producto actualizado correctamente");
            System.out.println(productoActualizar.toString());
            return productoActualizar;
        } else {
            System.out.println("Producto con ID " + numeroBuscado + " no encontrado.");
            return null;
        }
    
    }
}
