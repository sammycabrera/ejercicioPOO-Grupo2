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
public class Grupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Persona persona1 = new Persona();
        persona1.setID(1);
        persona1.setNombre("Juan Pablo");
        persona1.setApellido("Carrillo");
        Date fecha_nacimiento = new Date("02/02/1987");
        persona1.setFecha_nacimiento(fecha_nacimiento);
        persona1.setEstado_civil("CASADO");
        
        System.out.println(persona1);
        
        Empleado empleado1 = new Empleado();
        empleado1.setID(2);
        empleado1.setNombre("Lucia");
        empleado1.setApellido("Perez");
        empleado1.setEstado_civil("SOLTERO");
        empleado1.setEPS("COOMEVA");
        empleado1.setARP("POSITIVA");
        empleado1.setFecha_nacimiento(fecha_nacimiento);
        
        Cargo cargo1 = new Cargo("Analista de Software","Analista de sistemas de informacion");        
        empleado1.setCargo(cargo1);
        
        
        
        System.out.println(empleado1.obtenerEdad());
        System.out.println(empleado1);
        
        
        String dato = "";
        String nombre = persona1.mostrarNombre(empleado1);
        System.out.println(nombre);
                
        
        
   
    }
    
}
