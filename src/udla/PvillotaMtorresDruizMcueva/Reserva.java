package udla.PvillotaMtorresDruizMcueva;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Reserva {
    private int idReserva;
    private Habitacion habitacionReservada;
    private String cliente;

    public Reserva(int idReserva, Habitacion habitacionReservada, String cliente) {
        this.idReserva = idReserva;
        this.habitacionReservada = habitacionReservada;
        this.cliente = cliente;
    }

    public static Reserva crearReserva(List<Habitacion> habitaciones) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int idReserva = random.nextInt(10000);
        System.out.println("Ingrese el ID de la habitación:");
        int idHabitacion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el cliente:");
        String cliente = scanner.nextLine();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getIdHabitacion() == idHabitacion && habitacion.isDisponible()) {
                habitacion.cambiarDisponibilidad(false);
                System.out.println("Reserva creada con éxito. ID de la reserva: " + idReserva);
                return new Reserva(idReserva, habitacion, cliente);
            }
        }

        System.out.println("No se pudo crear la reserva. La habitación no está disponible o no existe.");
        return null;
    }

    public void mostrarDetallesReserva() {
        System.out.println("ID de la reserva: " + idReserva);
        System.out.println("Cliente: " + cliente);
        habitacionReservada.mostrarDetallesHabitacion();
    }
}