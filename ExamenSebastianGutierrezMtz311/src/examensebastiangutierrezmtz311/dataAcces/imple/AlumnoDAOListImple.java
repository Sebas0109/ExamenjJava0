/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.dataAcces.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import examensebastiangutierrezmtz311.dataAcess.StudentDAO;
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
public class AlumnoDAOListImple implements StudentDAO {

    private static List<Alumno> studentList = new ArrayList<>();
    
    @Override
    public Alumno save(Alumno stud) {
        String id = Integer.toString(studentList.size()+1);
        stud.setId(id);
        studentList.add(stud);
        return stud;
    }

    @Override
    public List<Alumno> findAll() {
        return studentList;
    }

    @Override
    public List<Alumno> find(String id) {
        List<Alumno> resstudentList = new ArrayList<>();
        id = id.toLowerCase().trim(); //trim para quitar espacios
        for (Alumno student : studentList) {
            if (student.getId().toLowerCase().contains(id)) {
                resstudentList.add(student);
            }
        }
        return resstudentList;
    }

    @Override
    public void delete(Alumno alumno) {
        studentList.remove(alumno);
    }

    @Override
    public void update(String id, Alumno alumno) {
        int pos = Integer.parseInt(id);
        pos--;
        alumno.setId(id);
        studentList.set(pos, alumno);
    }

    @Override
    public void load() {
        try{
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("alumnos.json"));
        studentList = gson.fromJson(br, new TypeToken<List<Alumno>>(){        }.getType());
        br.close();
            if (studentList == null) {
                studentList = new ArrayList<>(); //si es nula es un nuevo array list con 0 elementos
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
            FileWriter writer = new FileWriter("alumnos.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }   
    }

    @Override
    public void register(Alumno alumno, Materia nombreMat) {
        alumno.setMateria(nombreMat);
    }
    
}
