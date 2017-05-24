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
   


    
    public EcuacionesdeSegundoGrado (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

   
            public void setCoeficienteA (double a){
                this.a=a;
            }
            public void setCoeficienteB(double b){
                this.b=b;
            }
            public void setCoeficienteC (double c){
                this.c=c;
            }
            public double getCoeficienteA (){
                return a;
        }
            public double getCoeficienteB (){
                return b;
            }
            public double getCoeficienteC (){
                return c;
            }
            public int getDiscriminante (){
                int discriminante;
                discriminante = (int) ((this.b*this.b)-(4*(this.a*this.c)));
                return discriminante;
                }
            public double getNumerodeSolucionesReales (){
                double NumdeSoluciones;
                if (this.getDiscriminante() > 0){
                    NumdeSoluciones=2;
                }
                else{
                    if (this.getDiscriminante() < 0){
                        NumdeSoluciones=0;
                    }
                    else{
                        NumdeSoluciones=1;
                    }
            }
        return NumdeSoluciones;
}
            public double getRaíz1 (){
                    double raíz1;

                if (this.getNumerodeSolucionesReales()==2){
                    raíz1=(-this.b+Math.sqrt(this.getDiscriminante()))/(2*this.a);
                }else{
                   if (this.getNumerodeSolucionesReales()==1) {
                       raíz1=(-this.b+Math.sqrt(this.getDiscriminante()))/(2*this.a);
                   }else
                       raíz1= 0;
                }
        return raíz1;
                    
}
            public double getRaíz2 (){
                    double raíz2;
                if (this.getNumerodeSolucionesReales()==2){
                    raíz2=(-this.b-Math.sqrt(this.getDiscriminante()))/(2*this.a);
                }else{
                   if (this.getNumerodeSolucionesReales()==1) {
                       raíz2=0;
                   }else
                       raíz2= 0;
            }
        return raíz2;
}
}

            


