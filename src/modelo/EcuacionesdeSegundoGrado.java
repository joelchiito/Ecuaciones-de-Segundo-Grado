/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hp245
 */
public class EcuacionesdeSegundoGrado {
    private double a;
    private double b;
    private double c;
    private int discriminante;
    private int NumdeSoluciones;
    private double raíz1;
    private double raíz2;
    
    
    public EcuacionesdeSegundoGrado (double a, double b, double c){
    }
            public double getCoeficienteA (){
                return this.a;
        }
            public double getCoeficienteB (){
                return this.b;
            }
            public double getCoeficienteC (){
                return this.c;
            }
            public int getDiscriminante (){
                discriminante = (int) ((b*b)-(4*(a*c)));
                return discriminante;
                }
            public double getNumerodeSolucionesReales (){
                if (discriminante > 0){
                    NumdeSoluciones=2;
                }
                else{
                    if (discriminante < 0){
                        NumdeSoluciones=0;
                    }
                    else{
                        NumdeSoluciones=1;
                    }
            }
        return NumdeSoluciones;
}
            public double getRaíz1 (){
                if (NumdeSoluciones==2){
                    raíz1=(-b+Math.sqrt(discriminante))/(2*a);
                }else{
                   if (NumdeSoluciones==1) {
                       raíz1=(-b+Math.sqrt(discriminante))/(2*a);
                   }else
                       raíz1= 0;
                }
        return raíz1;
                    
}
            public double getRaíz2 (){
                if (NumdeSoluciones==2){
                    raíz2=(-b+Math.sqrt(discriminante))/(2*a);
                }else{
                   if (NumdeSoluciones==1) {
                       raíz2=0;
                   }else
                       raíz2= 0;
            }
        return raíz2;
}
}

            


