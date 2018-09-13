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
public class Alumno {
    
    public String Nombre;
    public String Paterno;
    public String Estado;
    public String FechaNacimiento;
    public String Sexo;
    public String CURP;
    public Materia materia;

    public Alumno(String Nombre, String Paterno, String Estado, String FechaNacimiento, String Sexo, String CURP) {
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.Estado = Estado;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.CURP = CURP;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}
