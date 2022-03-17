package ProgramacionJava;

import java.io.*;

public class EntradaDeDatos1 {

    public static void main(String[] args) {
        String captura;
        Reader input = null;
      //  InPutStreamReader input = new InPutStreamReader(System.in);
        BufferedReader brInput = new BufferedReader(input);

        System.out.println("Introduce un dato: ");
        try{
            captura = brInput.readLine();
            System.out.println("Dato intoducido: " + captura);
        }catch(IOException ex ){
            ex.printStackTrace(System.out);
        }

    }
}
