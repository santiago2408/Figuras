/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import logica.Figura;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends Figura {
    float lado;
   
    @Override
   public void cArea(){
       this.area=lado*lado;
   }
    
    @Override
   public void cPerimetro(){
       this.perimetro=lado*4;
              
   }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
