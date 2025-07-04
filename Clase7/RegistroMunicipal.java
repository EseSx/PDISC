public class RegistroMunicipal {
    private Vehiculo[] listaVehiculos;

    public RegistroMunicipal() {
    }

    public RegistroMunicipal(Vehiculo[] listaVehiculo) {
        this.listaVehiculos = listaVehiculo;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

    public void mostrarLista() {
        for (Vehiculo rm : this.listaVehiculos) {
            rm.mostrarDatos();
        }
    }
}
