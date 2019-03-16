/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_renatolizardo;

/**
 *
 * @author Asus Pc
 */
public class Hackeo {
    String Codigo;
    int nivel;

    public Hackeo() {
    }

    public Hackeo(String Codigo, int nivel) {
        this.Codigo = Codigo;
        this.nivel = nivel;

    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return  "Codigo=" + Codigo + ", nivel=" + nivel;
    }

    
    
}
