package udla.PvillotaMtorresDruizMcueva;


public class Habitacion {
    private int idHabitacion;
    private String tipoHabitacion;
    private double precio;
    private boolean disponible;
    private int capacidad;

    public Habitacion(int idHabitacion, String tipoHabitacion, double precio, boolean disponible, int capacidad) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.disponible = disponible;
        this.capacidad = capacidad;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void cambiarDisponibilidad(boolean estado) {
        this.disponible = estado;
    }

    public void mostrarDetallesHabitacion() {
        System.out.println("ID de la habitación: " + idHabitacion);
        System.out.println("Tipo: " + tipoHabitacion);
        System.out.println("Precio: $" + precio);
        System.out.println("Capacidad: " + capacidad + " persona(s)");
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}