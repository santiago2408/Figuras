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
public class Rectangulo extends Figura {
        float lado1;
        float lado2;
        @Override
        public void cArea(){
                this.area=lado1*lado2;
    }
        
        @Override
   public void cPerimetro(){
       this.perimetro=(lado1*2+lado2*2);
}

        public float getLado1() {
                return lado1;
        }

        public void setLado1(float lado1) {
                this.lado1 = lado1;
        }

        public float getLado2() {
                return lado2;
        }

        public void setLado2(float lado2) {
                this.lado2 = lado2;
        }
   
   
   
}
