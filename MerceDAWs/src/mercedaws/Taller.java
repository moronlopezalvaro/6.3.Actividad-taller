package mercedaws;

public class Taller {

    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    public void asignarReparacion(Vehiculo v, Reparacion r, Mecanico m) {
        m.reparar(r);
        v.getHistorial().add(r);
    }
}
