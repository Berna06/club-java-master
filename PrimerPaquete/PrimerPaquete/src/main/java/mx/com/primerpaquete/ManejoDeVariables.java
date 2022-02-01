/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class ManejoDeVariables {

    public static void main(String[] args) {

        var usuario = "Juan";
        var saludar = "Hola";
        var i = 3;
        var j = 5;

        System.out.println(i + j);
        /* cuando son variables con numeros es 
una suma normal*/

        System.out.println(saludar + i + j);
        /* asi solo pone el saludar y los dos
dos numeros que son 3 y 5 pero si es acaso que es areves identifica primero la
suma y despues el termino*/


//hay diferentes tipos de reglas que hay que seguir en java uno de ellas es el 
//uso adecuado de las mayusculas y las minusculas 
        var nombre = "Karla"
        var apellido = "Esparza"       
  
        System.out.println(nombre + " " + apellido);
        /* en la parte de las comillas donde hay un espaciado es un caracter especial 
el cual indica la accion de hacer un espacio entre el nombre y el apellido lo cual 
saldia el nombre de karla_Esparza 
         */
        System.out.println("Nueva Linea: \n" + nombre);
        /* este caracter solo es una new line lo cual que depues de escribir \n 
se salta sobre otra linea lo que se va en la continuacion 
         */
        System.out.println("tabulador \t" + nombre);
        /*el tabulador solo es un espacio que se le agrega a la cadena 
Tabulador:      Karla 
         */
        System.out.println("retroceso: \b" + nombre);
        /* el back space solo funciona para quitar un espaciado estre las palabras 
Retroceso:Karla de esta forma pero si se pone otra vez\b se quita el otro valor
RetrocesoKarla y por eso se llama retroseso porque retrocede un espacio cada 
vez se ponga 
         */
        System.out.println("Retorno de Carro: \r" + nombre);
        /*es como el new file pero con la diferencia que este */

}
 }                                  
