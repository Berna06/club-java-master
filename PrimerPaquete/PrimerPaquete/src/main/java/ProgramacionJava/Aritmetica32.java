package ProgramacionJava;

/**
 *Esta clase permite realizar operaciones de aritmnetica como sumar restar etc
 * @author Bernardo Monroy Parra 
 * @version 1.0.1
 * 
 */
public class Aritmetica32 {
    /**
     * Primer Operando
     */
    int operandoA;
    /**
     * Segundo Operando 
     */
    int operandoB;
    /**
     * Contructor Vacio de la Clase
     */
    public Aritmetica32(){
        
    }
    /**
     * constructor con dos argumentos 
     * @param operandoA es el primer operando 
     * @param operandoB es el segundo operando 
     */
    public Aritmetica32(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultadod e la suma 
     * 
     */
    public int sumar(){
        return this.operandoA + this.operandoB;
        
    }
}
