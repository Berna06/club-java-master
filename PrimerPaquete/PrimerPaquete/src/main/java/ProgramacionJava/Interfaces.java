package ProgramacionJava;

public class Interfaces {

    public static void main(String[] args) {
        AccesoDatos142 datos = new Implementacion142();
        datos.insertar();
        datos.listar();
        datos = new Implement142();
        datos.insertar();
        datos.listar();
        System.out.println(AccesoDatos142.MAX_REGISTROS);
    }   

}
