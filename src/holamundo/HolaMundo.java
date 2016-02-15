
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
        double x ;
        double y ; 
        double z ;
        
        System.out.println("Ingrese el valor de A");
        x = datos.nextInt();
       
        System.out.println("Ingrese el valor de B");
        y = datos.nextInt();
        
        System.out.println("Ingrese el valor de C");
        z = datos.nextInt();
   
        mayor(x,y,z);
        
    }
        public static int mayor(double a, double b, double c){
        
        if (a > b && a > c) {
        System.out.println("El Mayor es" + a);
        }
        else if (b > a && b > c) {
        System.out.println("El Mayor es" + b);
        }
        else if (c > a && c > b) {
        System.out.println("El Mayor es" + c);
        }
        
    return 0;
    
}
}