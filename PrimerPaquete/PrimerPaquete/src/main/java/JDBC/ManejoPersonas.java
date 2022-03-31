/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bernardo
 */
public class ManejoPersonas {
    public static void main(String[] args) {
        Person178 personaJDBC = new Person178();
        List<Persona178> personas = personaJDBC.select();
        
        for (Persona178 persona: personas){
            System.out.println("persona:" + persona);
        }
        
        Persona178 persona = new Persona178();
        persona.setNombre("MARIA");
        persona.setApellido("De Los Angeles");
        persona.setEmail("mangeles.gmail.com");
        persona.setTelefono("55 6666 1818");
        
        //Persona178.insert(persona);
        
        Person183 personajdbc = new Person183();
        try {
            Connection conexion = Conexion.getConnection();
          /*  if(conexion.autoCommit()){
                conexion.setAutoCommit(false);
            }*/
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
