/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author UNALMAN
 */
public class Producto implements Comparable{
    private String nombreP; 
    private  int numeroserial;
    private String color; 
    private String imagen; 
    private String marca;
    private String material; 
    private int demanda; 
    private float costoproduccion; 
    private float precioventa; 
    private float costoalmacenamiento; 
    private int bodegaId ;

    public Producto(String nombreP, int numeroserial, String color, String imagen, String marca, String material, int demanda, float costoproduccion, float precioventa, float costoalmacenamiento, int bodegaId) {
        this.nombreP = nombreP;
        this.numeroserial = numeroserial;
        this.color = color;
        this.imagen = imagen;
        this.marca = marca;
        this.material = material;
        this.demanda = demanda;
        this.costoproduccion = costoproduccion;
        this.precioventa = precioventa;
        this.costoalmacenamiento = costoalmacenamiento;
        this.bodegaId = bodegaId;
    }

    public Producto() {
    }
    
    public void metodoXX(){}

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public  void setNumeroserial(int numeroserial) {
        this.numeroserial = numeroserial;
    }
    

    public void setColor(String color) {
        this.color = color;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }

    public void setCostoproduccion(float costoproduccion) {
        this.costoproduccion = costoproduccion;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public void setCostoalmacenamiento(float costoalmacenamiento) {
        this.costoalmacenamiento = costoalmacenamiento;
    }

    public void setBodegaId(int bodegaId) {
        this.bodegaId = bodegaId;
    }

    public String getNombreP() {
        return nombreP;
    }

    public int getNumeroserial() {
        return numeroserial;
    }

    public String getColor() {
        return color;
    }

    public String getImagen() {
        return imagen;
    }

    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public int getDemanda() {
        return demanda;
    }

    public float getCostoproduccion() {
        return costoproduccion;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public float getCostoalmacenamiento() {
        return costoalmacenamiento;
    }

    public int getBodegaId() {
        return bodegaId;
    }
    
    
    

    @Override
    public String toString() {
        return "Producto{" + "nombreP=" + nombreP + ", Serial=" +numeroserial +", color=" + color + ", imagen=" + imagen + ", marca=" + marca + ", material=" + material + ", demanda=" + demanda + ", costoproduccion=" + costoproduccion + ", precioventa=" + precioventa + ", costoalmacenamiento=" + costoalmacenamiento + ", bodegaId=" + bodegaId + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.numeroserial == other.numeroserial;
    }

    @Override
    public int compareTo(Object o) {
         Producto pp = new Producto();
         pp = (Producto)o;
         
         if(this.numeroserial == pp.numeroserial )
             return 0;
         else if(this.numeroserial < pp.numeroserial)
             return 1;
         else return -1;
        
    }
    
    
}
