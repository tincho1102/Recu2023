package condiciones;

import cursos.ElementoCurso;

public class CondicionDuracionMin implements Condicion {
    private int min;

    public CondicionDuracionMin(int min) {
        this.min = min;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return ele.getCantidadHorasCatedra() >= min;
    }
    
}
