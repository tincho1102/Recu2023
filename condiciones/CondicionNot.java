package condiciones;

import cursos.ElementoCurso;

public class CondicionNot implements Condicion {
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return !c.cumple(ele);
    }

    
}
