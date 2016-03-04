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
public class clientes extends persona{
    
 private string email;
 private string celular;
  

public Cliente() {
    }

    public Cliente(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }
public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcelular() {
        return celular;
    }

    public void setcelular(String celular) {
        this.celular = celular;
    }
    
}