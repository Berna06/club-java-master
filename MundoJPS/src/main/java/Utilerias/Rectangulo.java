package Utilerias;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getBase(){
         return this.base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getArea(){
        return this.base * this.altura;
    }
}
