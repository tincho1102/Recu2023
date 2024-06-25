package condiciones;

import cursos.ElementoCurso;

public class CondicionPrecioMin implements Condicion {
    private double precioMin;

    public CondicionPrecioMin(double precioMin) {
        this.precioMin = precioMin;
    }

    @Override
    public boolean cumple(ElementoCurso ele) {
        return ele.getPrecio() > precioMin;
    }
}
