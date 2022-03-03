package ProgramacionJava;

public class Triangulo140 extends Figuras140 {

    public Triangulo140(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        //agragamos el comportamienot de esta clase 
        System.out.println("Aqui se deberia dibujar: " + this.getClass().getSimpleName());
    }
}
