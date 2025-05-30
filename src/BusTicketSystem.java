//Crear una aplicación para comprar boletos de autobús. Considere el
//autobús como un objeto. Cada asiento es un objeto. El ticket es un
//objeto. El sistema tiene el siguiente menú de opciones:

// 1)Ver disponibilidad de asientos
//      Muestra todos los asientos ocupados y vacíos.
// 2)Reservar asiento
//      Reserva el asiento bloqueando para que nadie pueda tomarlo.
// 3)Desbloquear asiento
//      Elimina la reserva de un boleto dejándolo disponible.
// 4)Obtener el ticket o boleto
//      Genera un ticket del asiento o asientos reservados
// 5)Cancelar ticket
//      Libera el asiento y cancela el ticket colocando status cancelado
// 6)Salir

import java.util.*;

public class BusTicketSystem {
    public static void main(String[] args) {
        Bus bus = new Bus(40);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Bienvenido al sistema de compra de boletos de autobús");

        while (running) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1) Ver disponibilidad de asientos");
            System.out.println("2) Reservar asiento");
            System.out.println("3) Desbloquear asiento");
            System.out.println("4) Obtener el ticket o boleto");
            System.out.println("5) Cancelar ticket");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    bus.showSeatAvailability();
                    break;
                case "2":
                    System.out.print("Ingrese el número del asiento a reservar (1-" + bus.getTotalSeats() + "): ");
                    try {
                        int seatNumber = Integer.parseInt(scanner.nextLine());
                        boolean reserved = bus.reserveSeat(seatNumber);
                        if (reserved) {
                            System.out.println("Asiento " + seatNumber + " reservado correctamente.");
                        } else {
                            System.out.println("No se pudo reservar el asiento. Puede estar ocupado o ya reservado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Número de asiento inválido.");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese el número del asiento a desbloquear (1-" + bus.getTotalSeats() + "): ");
                    try {
                        int seatNumber = Integer.parseInt(scanner.nextLine());
                        boolean unlocked = bus.unlockSeat(seatNumber);
                        if (unlocked) {
                            System.out.println("Asiento " + seatNumber + " desbloqueado y está disponible.");
                        } else {
                            System.out.println("No se pudo desbloquear el asiento. Puede que no esté reservado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Número de asiento inválido.");
                    }
                    break;
                case "4":
                    List<Integer> seatsToTicket = new ArrayList<>();
                    System.out.println("Ingrese los números de los asientos reservados para generar el ticket separados por coma (ej. 1,2,5): ");
                    String[] seatsInput = scanner.nextLine().split(",");
                    boolean validSeats = true;
                    for (String s : seatsInput) {
                        try {
                            int seatNum = Integer.parseInt(s.trim());
                            if (!bus.isSeatReserved(seatNum)) {
                                System.out.println("Asiento " + seatNum + " no está reservado. No se puede generar ticket.");
                                validSeats = false;
                                break;
                            }
                            seatsToTicket.add(seatNum);
                        } catch (NumberFormatException e) {
                            System.out.println("Número de asiento inválido: " + s);
                            validSeats = false;
                            break;
                        }
                    }
                    if (validSeats && seatsToTicket.size() > 0) {
                        Ticket ticket = bus.generateTicket(seatsToTicket);
                        System.out.println("Ticket generado con ID: " + ticket.getTicketId());
                        System.out.println(ticket);
                    } else if (seatsToTicket.size() == 0) {
                        System.out.println("No se ingresaron asientos válidos para generar ticket.");
                    }
                    break;
                case "5":
                    System.out.print("Ingrese el ID del ticket a cancelar: ");
                    String ticketId = scanner.nextLine().trim();
                    boolean cancelled = bus.cancelTicket(ticketId);
                    if (cancelled) {
                        System.out.println("Ticket " + ticketId + " cancelado correctamente.");
                    } else {
                        System.out.println("No se encontró un ticket activo con ese ID.");
                    }
                    break;
                case "6":
                    System.out.println("Saliendo del sistema. Gracias.");
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

class Bus {
    private final int totalSeats;
    private final Map<Integer, Seat> seats;
    private final Map<String, Ticket> tickets;
    private int ticketCounter;

    public Bus(int totalSeats) {
        this.totalSeats = totalSeats;
        seats = new LinkedHashMap<>();
        tickets = new HashMap<>();
        ticketCounter = 1;
        for (int i = 1; i <= totalSeats; i++) {
            seats.put(i, new Seat(i));
        }
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    
    public void showSeatAvailability() {
        System.out.println("\nDisponibilidad de asientos:");
        for (Seat seat : seats.values()) {
            System.out.printf("Asiento %2d - %s\n", seat.getSeatNumber(), seat.getStatus().toString());
        }
    }

    public boolean reserveSeat(int seatNumber) {
        Seat seat = seats.get(seatNumber);
        if (seat == null) {
            System.out.println("Asiento no válido.");
            return false;
        }
        if (seat.getStatus() == SeatStatus.AVAILABLE) {
            seat.setStatus(SeatStatus.RESERVED);
            return true;
        }
        return false;
    }

    public boolean unlockSeat(int seatNumber) {
        Seat seat = seats.get(seatNumber);
        if (seat == null) {
            System.out.println("Asiento no válido.");
            return false;
        }
        if (seat.getStatus() == SeatStatus.RESERVED) {
            seat.setStatus(SeatStatus.AVAILABLE);
            return true;
        }
        return false;
    }

    public boolean isSeatReserved(int seatNumber) {
        Seat seat = seats.get(seatNumber);
        return seat != null && seat.getStatus() == SeatStatus.RESERVED;
    }

    public Ticket generateTicket(List<Integer> seatNumbers) {
        List<Seat> ticketSeats = new ArrayList<>();
        for (int seatNum : seatNumbers) {
            Seat seat = seats.get(seatNum);

            seat.setStatus(SeatStatus.OCCUPIED);
            ticketSeats.add(seat);
        }
        String ticketId = "T" + (ticketCounter++);
        Ticket ticket = new Ticket(ticketId, ticketSeats);
        tickets.put(ticketId, ticket);
        return ticket;
    }

    public boolean cancelTicket(String ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket == null || ticket.getStatus() == TicketStatus.CANCELLED) {
            return false;
        }
        for (Seat seat : ticket.getSeats()) {
            seat.setStatus(SeatStatus.AVAILABLE);
        }
        ticket.setStatus(TicketStatus.CANCELLED);
        return true;
    }
}

class Seat {
    private final int seatNumber;
    private SeatStatus status;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.status = SeatStatus.AVAILABLE;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}

enum SeatStatus {
    AVAILABLE("Disponible"),
    RESERVED("Reservado"),
    OCCUPIED("Ocupado");

    private final String description;

    SeatStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

class Ticket {
    private final String ticketId;
    private final List<Seat> seats;
    private TicketStatus status;

    public Ticket(String ticketId, List<Seat> seats) {
        this.ticketId = ticketId;
        this.seats = seats;
        this.status = TicketStatus.ACTIVE;
    }

    public String getTicketId() {
        return ticketId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(ticketId).append("\n");
        sb.append("Estado: ").append(status).append("\n");
        sb.append("Asientos:");
        for (Seat seat : seats) {
            sb.append(" ").append(seat.getSeatNumber());
        }
        return sb.toString();
    }
}

enum TicketStatus {
    ACTIVE,
    CANCELLED;

    @Override
    public String toString() {
        switch (this) {
            case ACTIVE:
                return "Activo";
            case CANCELLED:
                return "Cancelado";
            default:
                return super.toString();
        }
    }
}
