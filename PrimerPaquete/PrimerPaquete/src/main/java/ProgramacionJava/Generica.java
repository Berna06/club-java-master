package ProgramacionJava;
//Procede de las clase 154
public class Generica<T> {

    //Definimos la variable de tipo Generico
    T generico;

    //inicializamos el contructor que se va a utilizar 
    public Generica(T generico) {
        this.generico = generico;

    }
    public void obtenerTipo(){
        System.out.println("El objeto T es: " + generico.getClass().getSimpleName());
    }
}
