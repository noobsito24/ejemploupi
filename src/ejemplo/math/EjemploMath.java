/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.math;
import java.util.Scanner;
/**
 *
 * @author ricar
 */
public class EjemploMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double x,y,z,resultado;
       
       System.out.println(" Escriba el primer numero");
       x=entrada.nextDouble();
       System.out.println(" Escriba el segundo numero");
       y=entrada.nextDouble();
       System.out.println(" Escriba el tercer numero");
       z=entrada.nextDouble();
               
       resultado=Math.max(x,Math.max(y,z));
       System.out.println(" El mayor es :" +resultado);
       
    }
    
}
