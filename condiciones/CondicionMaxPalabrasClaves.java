package condiciones;

import cursos.ElementoCurso;

public class CondicionMaxPalabrasClaves implements Condicion {
    private int maxPalabras;
    
    public CondicionMaxPalabrasClaves(int maxPalabras) {
        this.maxPalabras = maxPalabras;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return ele.getPalabrasClave().size() <= maxPalabras;
    }
}
