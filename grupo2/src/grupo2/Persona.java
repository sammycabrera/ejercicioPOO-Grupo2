/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2;

import java.util.Date;



/**
 *
 * @author win
 */
public class Persona {
 private int ID;
    
    /**
     * Atributo nombre de la persona
     */
    private String nombre;
    
    /**
     * Apellido
     */
    private String apellido;
    
    /**
     * Fecha de nacimiento
     */
    private Date fecha_nacimiento;
    
    /**
     * Estado civil
     */
    private String estado_civil;

    public Persona() {
    }        
    
    public Persona(int ID, String nombre, String apellido, Date fecha_nacimiento, String estado_civil) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
    }
   
    
    //modificadores y analizadores
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    
    
    
    /**
     * Metodo para obtener la edad de la persona
     * @return 
     *   Retorna la edad de la persona   
     */  
    public long obtenerEdad(){
        Date hoy = new Date();
        long days = (hoy.getTime()-this.fecha_nacimiento.getTime())/
                (1000 * 60 * 60 * 24);
        return days/365;
    }

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", nombre=" + nombre + ", apellido=" + 
                apellido + ", fecha_nacimiento=" + fecha_nacimiento + 
                ", estado_civil=" + estado_civil + '}';
    }
    
    
    /**
     * Metodo para mostrar el nombre de la persona
     * @param persona
     * @return Nombre de la persona
     */
    public String mostrarNombre(Persona persona){
        return nombre+" - "+apellido;
    }
    

    
    
    
    
    
}   

