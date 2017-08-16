/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author Diego
 */

/**
 * Tipos de datos en java
 * short -> numeros cortos
 * int -> numeros enteros
 * long -> numeos enteros largos
 * float -> numeros flotantes -> 2.12, 1.432, etc
 * double -> numeros dobles - practicamente todos los numeros
 * byte ->  se maneja en bytes - 8 bits
 * char -> caracteres
 * boolean -> verdaderos o falsos
 * String -> cadena de texto
 *  + - * / %
 * @author Diego
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int variable1;
       variable1 = 5;
       int resultado;
       resultado = variable1 * 2;
       System.out.println(variable1);
       System.out.println("El resultado es : "+resultado);
       int res2;
       res2 = variable1 / 2; /*mostrara el numero entero*/
       System.out.println("El numero entero de la division es: "+res2);
       int res3;
       res3 = variable1 % 2; /*mostrara el residuo de la division, en este caso 1*/
       System.out.println("El residuo de la division es: "+res3);
       float v1, r1; /*con dato double es lo mismo*/
       v1 = 5;
       r1 = v1 / 2;
       System.out.println("La division completa es: "+r1);
       
       /*Ejercicio*/
       short suma;
       suma = 3+10;
       int resta = 8- 17;
       long residuo = 9/2;
       float multiplicacion = 2*(15*(-2));
       double division = 10/3.4;
       
       System.out.println("---------------------------------------");
       System.out.println("EJERCICIOS.");
       System.out.println("El resultado de la suma es: "+suma);
       System.out.println("El resultado de la resta es: "+resta);
       System.out.println("El resultado de la division es: "+division);
       System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
       System.out.println("El resultado del residuo es: "+residuo);
       
       /*Sentencia IF / ELSE*/
       System.out.println("------------------------------------------");
       System.out.println("IF / ELSE");
       
       int var = 5;
       if(var == 5){
           //codigo
           System.out.println("Tu operacion es verdadera");
       }else{
           //codigo
           System.out.println("Tu operacion es falsa");
       }
       
       if(var == 4){
           //codigo
           System.out.println("Tu operacion es verdadera");
       }else{
           //codigo
           System.out.println("Tu operacion es falsa");
       }
       
       boolean cond;
       cond = true;
       
       if(cond){
           //codigo
           System.out.println("Tu condicion es verdadera");
       }else{
           //codigo
           System.out.println("Tu operacion es falsa");
       }
       System.out.println("----------------------");
       System.out.println("Operaciones || y &&");
       
       int a = 6;
       int b = 10;
       if((a==6) && (b>5)){
           System.out.println("Tu operacion && es verdadera");
       }else{
           System.out.println("Tu operacion && es falsa");
       }
       
       if((a==1) || (b>5)){
           System.out.println("Tu operacion || es verdadera");
       }else{
           System.out.println("Tu operacion || es falsa");
       }
       
       System.out.println("--------------------------");
       System.out.println("Operacion de negado (!)");
       if(!(a==2) || (b<5)){
           System.out.println("Tu operacion ! es verdadera");
       }else{
           System.out.println("Tu operacion ! es falsa");
       }
       
    }
    
}
