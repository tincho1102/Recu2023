import java.util.ArrayList;

import alumnos.Alumno;
import condiciones.Condicion;
import cursos.ElementoCurso;

public class Sistema {
    private ArrayList<ElementoCurso> cursos;
    private ArrayList<Alumno> alumnos;

    // CONSTRUCTOR
    public Sistema() {
        cursos = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    // METODOS
    public ArrayList<ElementoCurso> buscar(Condicion cc) {
        ArrayList<ElementoCurso> ret = new ArrayList<>();
        for (ElementoCurso elementoCurso : ret) {
            ret.addAll(elementoCurso.buscar(cc));
        }
        return ret;
    }
}
