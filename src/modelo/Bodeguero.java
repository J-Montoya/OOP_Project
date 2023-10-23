/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Bodeguero extends Funcionario {
    
    public Bodeguero(String fechaIngresoEmpresa, double sueldo, int id, String nombre, String apellido, String direccion, int telefono, String correo, String fechaNacimiento) {
        super(fechaIngresoEmpresa, sueldo, id, "bodeguero", nombre, apellido, direccion, telefono, correo, fechaNacimiento);
    }
    
    public void consultar(Producto producto){
        producto.toString();
    }
    
    
    public Object actualizar(Bodega bodega, String nombre){
        bodega.setNombre(nombre);
        return 0;
    }
}
