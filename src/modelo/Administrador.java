package modelo;

/**
 *
 * @author Jonathan
 */
public class Administrador extends Funcionario{
    
    public Administrador(String fechaIngresoEmpresa, double sueldo, int id, String nombre, String apellido, String direccion, int telefono, String correo, String fechaNacimiento) {
        super(fechaIngresoEmpresa, sueldo, id, "administrador", nombre, apellido, direccion, telefono, correo, fechaNacimiento);
    }
    
    
    @Override
    public boolean insertar(Object objecto){
        return super.insertar(objecto);
    }
    
    @Override
    public Object consultar(Object objecto){
        //implementacion
        return 0;
    }
    @Override
    public void consultar(){
        //implementacion
    }
    @Override
    public Object actualizar(Object objecto){
        //implementacion
        return 0;
    }
    @Override
    public boolean borrar(Object objecto){
        //implementacion
        return true;
    }
    @Override
    public void ordenar(){
        
    }
    
}
