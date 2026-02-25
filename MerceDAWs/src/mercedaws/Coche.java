package mercedaws;

import java.util.List;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String matricula, String modelo, int numPuertas, List<Reparacion> historial) {
        super(matricula, modelo, historial);
        this.numPuertas = numPuertas;
    }
}