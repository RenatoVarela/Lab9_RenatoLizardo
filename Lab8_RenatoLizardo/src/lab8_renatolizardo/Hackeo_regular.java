/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_renatolizardo;

import java.io.Serializable;

/**
 *
 * @author Asus Pc
 */
public class Hackeo_regular extends Hackeo implements Serializable {
    int exitoso;
    int tiempo;

   

    public Hackeo_regular(String Codigo, int nivel) {
        super(Codigo, nivel);
         exitoso = 0;
        tiempo = 2;
    }
    
    

    public int getExitoso() {
        return exitoso;
    }

    public void setExitoso(int exitoso) {
        this.exitoso = exitoso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    

   

    
    
    @Override
    public String toString() {
        return "Hackeo_Regular{" + super.toString() + ", exitosos = " + exitoso  + '}';
    }
    
    
    
    
    
    

 
}
