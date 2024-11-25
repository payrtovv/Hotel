package udla.PvillotaMtorresDruizMcueva;


import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;

    public Hotel() {
        habitaciones = new ArrayList<>();
        listaHabitaciones();
    }

    private void listaHabitaciones() {
        for (int i = 1; i <= 15; i++) {
            habitaciones.add(new Habitacion(i+1000, "Individual", 50.0, true, 1));
        }
        for (int j = 16; j <= 25; j++) {
            habitaciones.add(new Habitacion(j+1000, "Doble", 80.0, true, 2));
        }
    }

    public Habitacion buscarHabitacion(int id) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getIdHabitacion() == id) {
                return habitacion;
            }
        }
        return null;
    }

    public void mostrarHabitaciones() {
        System.out.println("Listado de habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("-----------------------");
            habitacion.mostrarDetallesHabitacion();
        }
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
}