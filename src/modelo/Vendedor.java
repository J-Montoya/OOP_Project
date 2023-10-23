/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Vendedor extends Funcionario {


    public Vendedor() {
        super();
    }

    public Vendedor(String fechaIngresoEmpresa, double sueldo, int id, String nombre, String apellido, String direccion, int telefono, String correo, String fechaNacimiento) {
        super(fechaIngresoEmpresa, sueldo, id, "vendedor", nombre, apellido, direccion, telefono, correo, fechaNacimiento);
        
    }
    
    @Override
    public void consultar(){
        System.out.println("Los datos de los productos son: \n"+ toString());
    }
    
    public Object actualizar(Producto producto, float precioventa) {
        producto.setPrecioventa(precioventa);
        return 0;
    }    
    
}

