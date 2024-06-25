package cursos;

import java.util.ArrayList;

import alumnos.Alumno;
import condiciones.Condicion;

public class Curso extends ElementoCurso {
    private double precio;
    private int cantidadHoras;
    private ArrayList<String> palabrasClave;
    private double notaMinima;

    // CONSTRUCTOR
    public Curso(String nombre, double precio, int cantidadHoras, double notaMinima) {
        super(nombre);
        this.precio = precio;
        this.cantidadHoras = cantidadHoras;
        this.notaMinima = notaMinima;
        palabrasClave = new ArrayList<>();
    }

    // METODOS
    public void addPalabra(String pp) {
        if(!palabrasClave.contains(pp))
            palabrasClave.add(pp);
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioAlumno(Alumno aa) {
        if(aa.aproboCurso(this))
            return 0;
        else
            return precio;
    }

    @Override
    public int getCantidadHorasCatedra() {
        return cantidadHoras;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public int getCantidadCursos() {
        return 1;
    }

    @Override
    public Curso getCursoMasCaro() {
        return this;
    }

    @Override
    public boolean aprobo(Alumno aa) {
        return aa.aproboCurso(this);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Curso otro = (Curso)obj;
            return otro.getNombre().equals(this.getNombre());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public ArrayList<ElementoCurso> buscar(Condicion cc) {
        ArrayList<ElementoCurso> ret = new ArrayList<>();
        if (cc.cumple(this))
            ret.add(this);
        return ret;
    }
}
