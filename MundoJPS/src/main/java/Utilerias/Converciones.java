
package Utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converciones {
    private static final String FORMATO_FECHA = "dd-aa-mm";
    
    public static String  format(Date fecha){
      SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
      return formateador.format(fecha);
    }
}

