package cursos;

import java.time.LocalDate;

public class CursoRendido {
    private Curso curso;
    private LocalDate fecha;
    private double notaObtenida;

    // CONSTRUCTOR
    public CursoRendido(Curso curso, LocalDate fecha, double notaObtenida) {
        this.curso = curso;
        this.fecha = fecha;
        this.notaObtenida = notaObtenida;
    }

    // GETTERS
    public Curso getCurso() {
        return curso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getNotaObtenida() {
        return notaObtenida;
    }

    // METODOS
    @Override
    public boolean equals(Object obj) {
        try {
            CursoRendido otro = (CursoRendido)obj;
            return otro.getCurso().getNombre().equals(this.getCurso().getNombre());
        } catch(Exception e) {
            return false;
        }
    }
}
