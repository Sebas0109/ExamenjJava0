/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.dataAcces.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import examensebastiangutierrezmtz311.dataAcess.MateriaDAO;
import examensebastiangutierrezmtz311.model.Alumno;
import examensebastiangutierrezmtz311.model.Materia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class MateriaDAOListImple implements MateriaDAO{
    
    private static List<Materia> materiaList = new ArrayList<>();

    @Override
    public Materia save(Materia mate) {
        String id = Integer.toString(materiaList.size()+1);
        mate.setId(id);
        materiaList.add(mate);
        return mate;
    }

    @Override
    public List<Materia> findAll() {
        return materiaList;
    }

    @Override
    public List<Materia> find(String id) {
        List<Materia> resMateriaList = new ArrayList<>();
        id = id.toLowerCase().trim();
        for (Materia materia : resMateriaList) {
            if (materia.getId().toLowerCase().contains(id)) {
                resMateriaList.add(materia);
            }
        }
        return resMateriaList;  
    }

    @Override
    public void delete(Materia materia) {
        materiaList.remove(materia);
    }
    

    @Override
    public void update(String id, Materia materia) {
        int idmat = Integer.parseInt(id);
        idmat--;
        materia.setId(id);
        materiaList.set(idmat, materia);
    }

    @Override
    public void load() {
        try{
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("materias.json"));
        materiaList = gson.fromJson(br, new TypeToken<List<Materia>>(){        }.getType());
        br.close();
            if (materiaList == null) {
                materiaList = new ArrayList<>(); //si es nula es un nuevo array list con 0 elementos
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }      
    }

    @Override
    public void commitChanges() {
        try{
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("materias.json");
            writer.write(gson.toJson(materiaList));
            writer.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }      
    }
         
}
