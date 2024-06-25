package alumnos;

import java.util.ArrayList;

import cursos.Curso;
import cursos.CursoRendido;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<CursoRendido> cursosRendidos;

    // CONSTRUCTOR
   public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cursosRendidos = new ArrayList<>();
    }

    // METODOS
    public void addCursoRendido(CursoRendido cc) {
        if (!cursosRendidos.contains(cc))
            cursosRendidos.add(cc);
    }


    public boolean aproboCurso(Curso cc) {
        for (CursoRendido cursoRendido : cursosRendidos) {
            if (cursoRendido.getCurso().equals(cc))
                if (cursoRendido.getNotaObtenida() >= cc.getNotaMinima())
                    return true;
        }
        return false;
   }
}
