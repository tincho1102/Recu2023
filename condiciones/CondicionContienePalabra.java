package condiciones;

import cursos.ElementoCurso;

public class CondicionContienePalabra implements Condicion {
    private String palabra;

    public CondicionContienePalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return ele.getPalabrasClave().contains(palabra);
    }

    
}
