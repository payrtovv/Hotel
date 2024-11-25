package udla.PvillotaMtorresDruizMcueva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        List<Reserva> reservas = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Reservas de Hotel ===");
            System.out.println("1. Mostrar  habitaciones disponibles");
            System.out.println("2. Buscar habitación");
            System.out.println("3. Crear una reserva");
            System.out.println("4. Mostrar reservas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    hotel.mostrarHabitaciones();
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la habitación que desea buscar: ");
                    int idHabitacion = scanner.nextInt();
                    scanner.nextLine();
                    Habitacion habitacion = hotel.buscarHabitacion(idHabitacion);
                    if (habitacion != null) {
                        System.out.println("Detalles de la habitación:");
                        habitacion.mostrarDetallesHabitacion();
                    } else {
                        System.out.println("No se encontró una habitación con el ID ingresado .");
                    }
                    break;
                case 3:
                    Reserva nuevaReserva = Reserva.crearReserva(hotel.getHabitaciones());
                    if (nuevaReserva != null) {
                        reservas.add(nuevaReserva);
                    }
                    break;
                case 4:
                    if (reservas.isEmpty()) {
                        System.out.println("No hay reservas registradas.");
                    } else {
                        System.out.println("Listado de reservas:");
                        for (Reserva reserva : reservas) {
                            System.out.println("-----------------------");
                            reserva.mostrarDetallesReserva();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo");
            }
        }
    }
}