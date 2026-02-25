package mercedaws;

import java.util.*;

public class Cliente {

    private String nombre;
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}