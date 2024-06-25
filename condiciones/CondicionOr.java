package condiciones;

import cursos.ElementoCurso;

public class CondicionOr implements Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return c1.cumple(ele) || c2.cumple(ele);
    }

}
