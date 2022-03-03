package ProgramacionJava;

public class Rectangulo140 extends Figuras140 {

    public Rectangulo140(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        //agragamos el comportamienot de esta clase 
        System.out.println("Aqui se deberia dibujar: " + this.getClass().getSimpleName());
    }
}
