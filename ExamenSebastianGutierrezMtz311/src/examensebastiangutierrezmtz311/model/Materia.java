/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.model;

/**
 *
 * @author sebas
 */
public class Materia {
    public String Nombre;
    public String Docente;

    public Materia(String Nombre, String Docente) {
        this.Nombre = Nombre;
        this.Docente = Docente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

}
