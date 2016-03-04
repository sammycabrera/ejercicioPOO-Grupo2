/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2;

/**
 *
 * @author win
 */
public class Cargo {
    
    private String ID_Cargo;
    private String descripcion; 
   
    public Cargo(String id_cargo, String descripcion) {
        
        this.ID_Cargo = id_cargo;
        this.descripcion= descripcion;
            }
    
     public String getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(String ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    
}
}