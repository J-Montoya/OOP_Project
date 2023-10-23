/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Cliente extends Usuario{
    
    public Cliente(int id, String nombre, String apellido, String direccion, int telefono, String correo, String fechaNacimiento) {
        super(id, "cliente", nombre, apellido, direccion, telefono, correo, fechaNacimiento);
    }
    
    @Override
    public void consultar() {
        // ...
    }

    @Override
    public void ordenar() {
        // ...
    }
    
}
