/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionesdesegundogrado;
import java.util.Scanner;
import modelo.EcuacionesdeSegundoGrado;

/**
 *
 * @author hp245
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
       
        
        double a;
        double b;
        double c;
        
        System.out.println("Escriba el valor del coeficiente a");
        a = entrada.nextInt();
        System.out.println("Escriba el valor del coeficiente b");
        b = entrada.nextInt();
        System.out.println("Escriba el valor del coeficiente c");
        c = entrada.nextInt();
         EcuacionesdeSegundoGrado misEcuaciones = new EcuacionesdeSegundoGrado(1,1,1);
         misEcuaciones.setCoeficienteA(a);
         misEcuaciones.setCoeficienteB(b);
         misEcuaciones.setCoeficienteC(c);
        System.out.println("El discriminante es " + misEcuaciones.getDiscriminante() );
        System.out.println("El número de soluciones existentes es: " + misEcuaciones.getNumerodeSolucionesReales());
        System.out.println("El valor de la raíz 1 es: " + misEcuaciones.getRaíz1());
        System.out.println("El valor de la raíz 2 es: " + misEcuaciones.getRaíz2());
        
        
        // TODO code application logic here
    }
    
}
