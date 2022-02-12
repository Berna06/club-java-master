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
        var resultado2 = 3D / b;
        System.out.println("resultado2 = " + resultado2);
        
        int c = 4, d = 3;
        int e = c + 5 - d;
        System.out.println("c=" + c);
        c += 1;//a=a+1
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
        int z = 7, x = 10;
        boolean p = (z == x);
        System.out.println("p = " + p);
        p = (z != b);
        System.out.println("p = " + p);
        String cadena = "hola";
        String cadena2 = "adios";
        System.out.println(cadena.equals(cadena2));
        //Operadores Renacionales 
        boolean v = z > x;
        System.out.println("v = " + v);
        if (z / 2 == 0) {
            System.out.println("nue=mero par");
        } else {
            
        }
        
        System.out.println("numero impar");
        int zzz = 12;
        int god = 18;
        if (zzz >= god) {
            System.out.println("es un adulto");
        } else {
            System.out.println("es menor de edad y muy zzz");
            //operadores condicionales  
            int ya = 11;
            int valorMinimo = 0, valorMaximo = 11;
            boolean cierto = ya >= valorMinimo && ya <= valorMaximo;
            System.out.println("cierto = " + cierto);
            
            boolean vacaciones = false;
            boolean descanso = false;
            if (vacaciones || descanso);
            System.out.println("el padre puede asistir al juego del hijo ");
            
            System.out.println("padre esta ocupado");
            
        }
        //operadores tenario 
        var respuesta = (3 > 2) ? "verdadero" : "falso";
        System.out.println("respuesta = " + respuesta);
        
        var numerogod = 7;
        var par = (numerogod % 2 == 0) ? "numerogod par" : "numeroingod impar";
        System.out.println("par = " + par);

        //precedencia de operadores en java
        var aa = 55;
        var bb = 19;
        var cc = ++aa + bb--;//aa=56,bb=19 cc=76
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        
        System.out.println("\nEjemplo 2 precencia de operadores");
        var changos = 4 + 5 * 6 / 3;//4+((5*6)/3)=>30/3=10+4=14
        System.out.println("changos = " + changos);
        changos = (4 + 5) * 6 / 3;
        System.out.println("changos = " + changos);
        // fin
        
        
        
        
        
    }
    
}
