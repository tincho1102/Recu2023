package cursos;

import java.util.ArrayList;

import alumnos.Alumno;
import condiciones.Condicion;

public abstract class ElementoCurso {
    private String nombre;

    public ElementoCurso(String nombre) {
        this.nombre = nombre;
    }

    // METODOS
    public String getNombre() {
        return nombre;
    }

    // METODOS ABSTRACTOS
    public abstract double getPrecio();
    public abstract double getPrecioAlumno(Alumno aa);
    public abstract int getCantidadHorasCatedra();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract int getCantidadCursos();
    public abstract Curso getCursoMasCaro();
    public abstract boolean aprobo(Alumno aa);
    public abstract ArrayList<ElementoCurso> buscar(Condicion cc);
}
