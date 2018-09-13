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
            if (student.getNombre().toLowerCase().contains(id)) {
                resstudentList.add(student);//-----------------
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
        
        Alumno temp = null;
        id = id.toLowerCase();
        for (Alumno alumn : studentList) {
            if (alumn.getNombre().toLowerCase().contains(id)) {
                temp = alumn;
            }
        }
        int idAlumn = studentList.indexOf(temp);
        studentList.set(idAlumn, alumno);
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

    @Override
    public void darDeBaja(Alumno alumno, Materia materia) {
        alumno.materia = null;
    }
    
}
