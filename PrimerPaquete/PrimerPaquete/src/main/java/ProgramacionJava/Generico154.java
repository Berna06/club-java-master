package ProgramacionJava;

public class Generico154 {

    public static void main(String[] args) {
        Generica<Integer> objetoInt = new Generica(15);
        objetoInt.obtenerTipo();

        Generica<String> objetoString = new Generica("Prueba");
        objetoString.obtenerTipo();

        // Generica<int> objetoPrimitivo = new Generica(144);
        //es imposible utilizar tipos primitivos en clases genericas 
    }
}
