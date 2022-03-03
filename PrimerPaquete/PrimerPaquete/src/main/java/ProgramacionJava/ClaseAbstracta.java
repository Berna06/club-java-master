package ProgramacionJava;

public class ClaseAbstracta {

    public static void main(String[] args) {
        //Creacion de objetos 
        //Figuras140 figurasGeometricas = new Figuras140();
        
        Figuras140 rectangulo = new Rectangulo140("Rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        Figuras140 triangulo = new Rectangulo140("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        Figuras140 circulo = new Rectangulo140("Circulo");
        System.out.println(circulo);
        circulo.dibujar();


    }
    
}
