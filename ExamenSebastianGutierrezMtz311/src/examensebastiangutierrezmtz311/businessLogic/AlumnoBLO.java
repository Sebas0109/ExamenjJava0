/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.businessLogic;

import examensebastiangutierrezmtz311.dataAcces.imple.AlumnoDAOListImple;
import examensebastiangutierrezmtz311.dataAcess.StudentDAO;
import examensebastiangutierrezmtz311.model.Alumno;
import examensebastiangutierrezmtz311.model.Materia;
import java.util.List;

/**
 *
 * @author sebas
 */
public class AlumnoBLO {
    private StudentDAO alumnoDAO;
    
    public AlumnoBLO()
    {
        alumnoDAO = new AlumnoDAOListImple();
    }
    
    public Alumno save(Alumno stud)
    {
        return alumnoDAO.save(stud);
    }
    
    public List<Alumno> findAll()
    {
        return alumnoDAO.findAll();
    }
    
    public List<Alumno> find(String id)
    {
        return alumnoDAO.find(id);
    }
    
    public void delete(Alumno alumno)
    {
        alumnoDAO.delete(alumno);
    }
    
    public void update(String id, Alumno alumno)
    {
        alumnoDAO.update(id, alumno);
    }
    
    public void register(Alumno alumno, Materia nombreMat)
    {
        alumnoDAO.register(alumno, nombreMat);
    }
    
    public void load()
    {
        alumnoDAO.load();
    }
    
    public void commitChanges()
    {
        alumnoDAO.commitChanges();
    }
}
