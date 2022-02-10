/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.primerpaquete;

/**
 *
 * @author bernardo
 */
public class OperadoresDeJava {
    
    public static void main(String[] args) {
        
        int a = 3, b = 2;
        //suma
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        System.out.println("resultado=" + (a + b));
//resta
        resultado = a - b;
        System.out.println("resultado = " + resultado);
        System.out.println("resultado = " + (a - b));
        //multiplicacion
        resultado = a * b;
        System.out.println("resultado = " + resultado);
        var resultado2 = 3D / b ;
        System.out.println("resultado2 = " + resultado2);
        
      int c=4, d=3;
      int e = c + 5 - d;
        System.out.println("c=" + c);
        c += 1 ;//a=a+1
        System.out.println("c = " + c);
      
        c += 3;//aa=+3
        System.out.println("c = " + c);
        d -= 1;//d=d-1
        System.out.println("d = " + d);
        /* se puede utilizar tambien con los otros operadores 
        (*=)(/=)*/
        //operadores unarios
        //operador de invercion 
        int q = 9;
        int w = -q;
        System.out.println("w = " + w);
        
        boolean r = true;
        boolean t = !r;
        System.out.println("t = " + t);
        
        // operadorez de incremento e implemento
        //preincremento
        int s = 3;
        int f = ++s;
        System.out.println("f = " + f);
        //postincremento
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        //decremento
        //predecremento
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //postcremento
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);        
        
        //operadores de igualdad y relacionales 
        int z = 1, x=7;
        boolean c = (z == x);
        System.out.println("c = " + c);
        c = (z != b);
        System.out.println("c = " + c);
        
        
        
        
        
        
        
        
    }
    
}
