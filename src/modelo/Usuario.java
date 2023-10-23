/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ControladorProducto;
import controlador.ICRUD;

/**
 *
 * @author Jonathan
 */
public class Usuario extends ControladorProducto implements ICRUD{
    private int id;
    private String tipo;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String correo;
    private String fechaNacimiento;

    public Usuario(int id, String tipo, String nombre, String apellido, String direccion, int telefono, String correo, String fechaNacimiento) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario() {
    }
    /*
    public boolean tienePermisoProductos(){
        return this instanceof Administrador;
    }
    
    public boolean tienePermisoVentas(){
        return this instanceof Vendedor || this instanceof Administrador;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    @Override
    public boolean insertar(Object objecto){
        return super.insertar(objecto);
    }

    @Override
    public Object consultar(Object objecto) {
        Object resultado = super.consultar(objecto);
        return resultado;
    }

    @Override
    public void consultar() {
        super.consultar();
    }

    @Override
    public Object actualizar(Object objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean borrar(Object objecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
