
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_lisadiazdelvalle;

import java.util.Scanner ;
/**
 *
 * @author HTS
 */
public class Lab1_LisaDiazdelValle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
                
        System.out.println( "--Bienveido al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre: ");//Se ingresa el nombre del usuario 
        String nombre = entrada.nextLine();
        
        //Se ingresan las notas de la cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print( "Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print( "Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print( "Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //Se calculo del promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime el calculo del promedio 
        System.out.println("----" + nombre + "el promedio de las cuatro clases:" + promedio);
    }
   
    
}
