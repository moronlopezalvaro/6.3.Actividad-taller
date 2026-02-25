package mercedaws;

import java.util.*;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String matricula, String modelo, boolean tieneSidecar, List<Reparacion> historial) {
        super(matricula, modelo, historial);
        this.tieneSidecar = tieneSidecar;
    }
}