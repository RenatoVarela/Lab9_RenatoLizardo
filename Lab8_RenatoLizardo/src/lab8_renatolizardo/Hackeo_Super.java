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
public class Hackeo_Super extends Hackeo implements Serializable {
    
      int fallidos;
      int tiempo;
      
    public Hackeo_Super() {
    }

    public Hackeo_Super(String Codigo, int nivel) {
        super(Codigo, nivel);
        tiempo = 1;
        fallidos = 0;
    }
    
    public int getFallidos() {
        return fallidos;
    }

    public void setFallidos(int fallidos) {
        this.fallidos = fallidos;
    }

    @Override
    public String toString() {
        return "Hackeo_Super{" + super.toString() + ", fallidos = " + fallidos + '}';
    }
    
    
    
    
  


    
    

    
    
    
    
    
    
    
}
