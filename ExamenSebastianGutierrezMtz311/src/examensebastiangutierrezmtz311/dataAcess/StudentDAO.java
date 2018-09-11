/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.dataAcess;

import examensebastiangutierrezmtz311.model.Alumno;
import examensebastiangutierrezmtz311.model.Materia;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface StudentDAO {
    
    public Alumno save(Alumno stud);
    
    public List<Alumno> findAll();
    
    public List<Alumno> find(String id);
    
    public void delete(Alumno alumno);
    
    public void update(String id, Alumno alumno);
    
    public void register(Alumno alumno, Materia nombreMat);
    
    public void load();
    
    public void commitChanges();
    
}
