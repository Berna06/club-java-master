package mx.com.primerpaquete;

public class Null {
    //Palabra null 

    public static void main(String[] args) {
        sus persona1 = new sus("Juan");
        System.out.println("Persona1:" + persona1.obtenerNombre());
        sus persona2 = persona1;
        System.out.println("Persona2:" + persona2.obtenerNombre());
        persona1 = null;
        if(persona1 !=null)
        System.out.println("Persona1" + persona1.obtenerNombre());
        else
            System.out.println("la variable persona1 no apunta a nibgun objeto");
    }
}

class sus {

    String nombre;

    sus(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
