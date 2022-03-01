/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionJava;

/**
 *
 * @author bernardo
 */
public enum Paises114 {
    CHIAPAS(2),
    MEXICO(4),
    JALISCO(13),
    NVOLEON(53),
    SANANDREAS(999);

    //ATRIBUTO DE PAISES
    private final int paises;

    //contructor de cada elemento de la enumeracion
    Paises114(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
