/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import logica.Figura;
import java. lang. Math. *;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {
    float lado;
   
    @Override
   public void cArea(){
       this.area=(float) (Math.PI*lado*lado);
   }
    
    @Override
   public void cPerimetro(){
       this.perimetro=(float) (Math.PI*lado*2);
              
   }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}