package cursos;

import java.util.ArrayList;

import alumnos.Alumno;
import condiciones.Condicion;

public class Especializacion extends ElementoCurso {

    private ArrayList<ElementoCurso> elementos;

    // CONSTRUCTOR
    public Especializacion(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    // METODOS
    @Override
    public double getPrecio() {
        double precio = 0;
        for (ElementoCurso elementoCurso : elementos) {
            precio += elementoCurso.getPrecio();
        }
        return precio;
    }

    @Override
    public double getPrecioAlumno(Alumno aa) {
        double precio = 0;
        for (ElementoCurso elementoCurso : elementos) {
            precio += elementoCurso.getPrecioAlumno(aa);
        }
        return precio;
    }

    @Override
    public int getCantidadHorasCatedra() {
        int horas = 0;
        for (ElementoCurso elementoCurso : elementos) {
            horas += elementoCurso.getCantidadHorasCatedra();
        }
        return horas;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> ret = new ArrayList<>();
        for (ElementoCurso elementoCurso : elementos) {
            ArrayList<String> palabras = elementoCurso.getPalabrasClave();
            for (String palabra : palabras) {
                if(!ret.contains(palabra))
                    ret.add(palabra);
            }
        }
        return ret;
    }

    @Override
    public int getCantidadCursos() {
        int c = 0;
        for (ElementoCurso elementoCurso : elementos) {
            c += elementoCurso.getCantidadCursos();
        }
        return c;
    }

    @Override
    public Curso getCursoMasCaro() {
        Curso masCaro = new Curso(" ", -1, 0, 0);
        for (ElementoCurso elementoCurso : elementos) {
            Curso actual = elementoCurso.getCursoMasCaro();
            if (actual.getPrecio() > masCaro.getPrecio())
                masCaro = actual;
        }
        return masCaro;
    }

    @Override
    public boolean aprobo(Alumno aa) {
        for (ElementoCurso elementoCurso : elementos) {
            if (!elementoCurso.aprobo(aa))
                return false;
        }
        return true;
    }

    @Override
    public ArrayList<ElementoCurso> buscar(Condicion cc) {
        ArrayList<ElementoCurso> ret = new ArrayList<>();
        if (cc.cumple(this))
                ret.add(this);
        for (ElementoCurso elementoCurso : ret) {
            if (cc.cumple(elementoCurso))
                ret.addAll(elementoCurso.buscar(cc));
        }
        return ret;
    }
    
}
