/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.businessLogic;

import examensebastiangutierrezmtz311.dataAcces.imple.MateriaDAOListImple;
import examensebastiangutierrezmtz311.dataAcess.MateriaDAO;
import examensebastiangutierrezmtz311.model.Materia;
import java.util.List;

/**
 *
 * @author sebas
 */
public class MateriaBLO {
    
    private MateriaDAO materiaDAO;
    
    public MateriaBLO()
    {
        materiaDAO = new MateriaDAOListImple();
    }
    
    public Materia save(Materia mate)
    {
        return materiaDAO.save(mate);
    }
    
    public List<Materia> findAll()
    {
        return materiaDAO.findAll();
    }
    
    public List<Materia> find(String id)
    {
        return materiaDAO.find(id);
    }
    
    public void delete(Materia materia)
    {
        materiaDAO.delete(materia);
    }
    
    public void update(String id, Materia materia)
    {
        materiaDAO.update(id, materia);
    }
        
    public void load()
    {
        materiaDAO.load();
    }
    
    public void commitChanges()
    {
        materiaDAO.commitChanges();
    }
}
