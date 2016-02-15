
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author Estudiante
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       java.util.Scanner datos = new java.util.Scanner(System.in);
        double a = 0;
        double b = 0; 
        double c = 0;
        
        System.out.println("Ingrese el valor de A");
        a = datos.nextInt();
       
        System.out.println("Ingrese el valor de B");
        b = datos.nextInt();
   
        System.out.println("Ingrese el valor de C");
        c = datos.nextInt();
   
        if (a > b && a > c) {
        System.out.println("El Mayor es" + a);
        }
        else if (b > a && b > c) {
        System.out.println("El Mayor es" + b);
        }
        else if (c > a && c > b) {
        System.out.println("El Mayor es" + b);
        }
        
    }
    
}
