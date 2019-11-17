package bicicletasegibide.entity;
// Generated 15-nov-2019 18:09:33 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Reparaciones generated by hbm2java
 */
public class Reparaciones  implements java.io.Serializable {


     private String codigoreparacion;
     private String nombre;
     private String ciudad;
     private Set gestioneses = new HashSet(0);

    public Reparaciones() {
    }

	
    public Reparaciones(String codigoreparacion, String nombre) {
        this.codigoreparacion = codigoreparacion;
        this.nombre = nombre;
    }
    public Reparaciones(String codigoreparacion, String nombre, String ciudad, Set gestioneses) {
       this.codigoreparacion = codigoreparacion;
       this.nombre = nombre;
       this.ciudad = ciudad;
       this.gestioneses = gestioneses;
    }
   
    public String getCodigoreparacion() {
        return this.codigoreparacion;
    }
    
    public void setCodigoreparacion(String codigoreparacion) {
        this.codigoreparacion = codigoreparacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Set getGestioneses() {
        return this.gestioneses;
    }
    
    public void setGestioneses(Set gestioneses) {
        this.gestioneses = gestioneses;
    }




}

