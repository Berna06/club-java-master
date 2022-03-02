package ProgramacionJava;

public class AutoUndBoxing {

    public static void main(String[] args) {
        //Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        //Undboxing (extraemos le tipo primitivo del objeto envuelviente )
        int entero = enteroObj;
        System.out.println("entero = " + entero);

        Float floatObj = 15.4f;
        System.out.println("floatObj = " + floatObj);
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);

        //Listado de clases envolventes 
        //int - Integer 
        //char - Character 
        //boolean - Bolena
        //byte - Byte 
        //short - Short 
        //long - Long 
        //float - Float 
        //double - Double 
    }

}
