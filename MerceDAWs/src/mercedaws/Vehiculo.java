package mercedaws;

import java.util.List;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected List<Reparacion> historial;

    public Vehiculo(String matricula, String modelo, List<Reparacion> historial) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.historial = historial;
    }

    public List<Reparacion> getHistorial() {
        return historial;
    }
}