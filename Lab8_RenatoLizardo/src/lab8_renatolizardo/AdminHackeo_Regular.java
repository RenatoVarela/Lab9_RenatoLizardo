/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_renatolizardo;

import javax.swing.JProgressBar;

/**
 *
 * @author Asus Pc
 */
public class AdminHackeo_Regular extends Thread {
    
    JProgressBar entrada;
    int caracteres;
    Hackeo hackeo;
       boolean vive;
    boolean avanzar;

    public AdminHackeo_Regular(JProgressBar entrada, Hackeo hackeo,int caracteres) {
        this.entrada = entrada;
        this.hackeo = hackeo;
        this.caracteres = caracteres;
        avanzar = true;
        vive = true;
        
    }
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    
    
       @Override
    public void run(){
        int tiempo = 0;
        entrada.setValue(0);
        entrada.setMaximum(caracteres);
        
           if (hackeo.getClass().toString().contains("Hackeo_Super")) {
                    tiempo = 1000;
                    System.out.println(tiempo);
           }
           
            if (hackeo.getClass().toString().contains("Hackeo_regular")) {
                     tiempo = 2000;
                     System.out.println(tiempo);
            }
            
            
        
         while(vive){
            if (avanzar) {
                     if (entrada.getValue() == caracteres) {
                         vive = false;
                    
                }
                    System.out.println("asdasd");
                    entrada.setValue(entrada.getValue()+1);
                    entrada.setString("Procesando: "+entrada.getValue() + "%");
                  

                }try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
            }
     
            }
         
         
             
        }
          
    
}
