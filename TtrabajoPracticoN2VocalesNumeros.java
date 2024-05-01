/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttrabajo.practico.n2.vocales.numeros;

import java.util.Scanner;

/**
 *
 * @author YAMI_
 */
public class TtrabajoPracticoN2VocalesNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //LETRAS VOCALES O CONSONANTES
         
        Scanner leer = new Scanner(System.in);    
        System.out.println("Ingrese una letra:");
        String c = leer.nextLine();
        
        if(c.equals ("a") || c.equals("A"))
           {
            System.out.printf("Esta letra es una vocal",c);
           }
        else if(c.equals ("e") || c.equals("E"))
           {
            System.out.printf("Esta letra es una vocal",c);
           }
        else if(c.equals ("i") || c.equals("I"))
           {
            System.out.printf("Esta letra es una vocal",c);
           }
        else if(c.equals ("o") || c.equals("O"))
           {
            System.out.printf("Esta letra es una vocal",c);
           }
        else if(c.equals ("u") || c.equals("U")){
            System.out.printf("Esta letra es una vocal",c);
           }
        else 
           {
            System.out.printf("Esta letra es una consonante",c);
           }
       
        System.out.println("");
        System.out.println("---------");
        
        //OPERACIONES CON NÚMERO ENTEROS
        int numero1;
        int numero2;
        int resultadoTotalSuma;
        int resultadoTotalResta;
        int resultadoTotalDivision;
        int resultadoTotalMultiplicacion;
        
        //Scanner leer = new Scanner(System.in);
        
        //Almacenar numero 1
        
        System.out.println("SUMA-RESTA-DIVISIÓN-MULTIPLICACIÓN de números enteros");
        
        System.out.println("Ingresa el primer número: ");
        numero1 = leer.nextInt();
        
        //Almacenar numero 2
        
        System.out.println("Ingresa el segundo numero: ");
        numero2 = leer.nextInt();
        
        resultadoTotalSuma = numero1 + numero2;
        
        System.out.println("Resultado de suma: "+ resultadoTotalSuma);
        
        resultadoTotalResta = numero1 - numero2;
        
        System.out.println("Resultado de resta: "+ resultadoTotalResta);
        
        resultadoTotalDivision = numero1 / numero2;
        
        System.out.println("Resultado de división : "+ resultadoTotalDivision);
        
        resultadoTotalMultiplicacion = numero1 * numero2;
        
        System.out.println("Resultado de multiplicación: "+ resultadoTotalMultiplicacion);
        
        System.out.println("El número resultado de la división:"+ resultadoTotalDivision);
        if(resultadoTotalDivision % 2 ==0){
            System.out.println("x: Este número es par");
        }
        else{
            System.out.println("x: Este numero es impar");
        }
        
        System.out.println("");
        System.out.println("----------");
       
        //NÚMEROS POSITIVOS,NEGATIVOS Y NEUTRO
             
        //Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número Entero: ");

        int entero = leer.nextInt();

        if(entero!= 0){

            if(entero>0){
                System.out.printf("El número "+ entero + " es positivo");
            }else
                 {
                System.out.printf("El número "+ entero +" es negativo:");
                 }
        }else{
            System.out.printf("El número "+ entero + " es neutro");
        }
        
      
}
