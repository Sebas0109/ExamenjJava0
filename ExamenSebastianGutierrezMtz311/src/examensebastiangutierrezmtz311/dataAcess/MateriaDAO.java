/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.dataAcess;

import examensebastiangutierrezmtz311.model.Materia;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface MateriaDAO {
    
    public Materia save(Materia mate);
    
    public List<Materia> findAll();
    
    public List<Materia> find(String id);
    
    public void delete(Materia materia);
    
    public void update(String id, Materia materia);
        
    public void load();
    
    public void commitChanges();
}
