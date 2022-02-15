package mx.com.primerpaquete;

public class CreacionDeObjetos {

    public static void main(String[] args) {

        //creacion de un ocjeto de tipo persona
        // definicion de la variable de tipo persona
        CreacionDeClases persona1;
        //intanciando(creando) un objeto de la clase persona
        persona1 = new CreacionDeClases();
        //accedemos a objeto persona, y llamamos al metodo desplegar nombres
        persona1.desplegarNombres();
        //modificamos los valores de los atributos del objeto persona
        persona1.nombre = "juan";
        persona1.apellido = "Perez";
        //volvemos aimprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        //crecaion de un segundo objeto tipo persona
        CreacionDeClases persona2 = new CreacionDeClases();
        persona2.nombre = "karla";
        persona2.apellido = "Gomez";
        System.out.println("");
        persona2.desplegarNombres();
        //fin section 10 
        
        

    }

}
