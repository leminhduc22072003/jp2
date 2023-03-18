package Datvemaybay;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static PriorityQueue<Passenger> passengers = new PriorityQueue<>(Comparator.comparing(Passenger::getId));



    public static void addReservation(Scanner scanner) {
        System.out.print("Enter Reservation ID: ");
        String id = scanner.next();

        System.out.print("Enter Passenger Name: ");
        String name = scanner.next();

        System.out.print("Enter Address: ");
        String address = scanner.next();

        System.out.print("Enter Phone: ");
        String phone = scanner.next();

        System.out.print("Enter Date of Departure: ");
        String departureDate = scanner.next();

        System.out.print("Enter Date of Return: ");
        String returnDate = scanner.next();

        Passenger passenger = new Passenger(id, name, address, phone, departureDate, returnDate);
        passengers.add(passenger);



    }

    public static void modifyPassengerRecord(Scanner scanner) {
        System.out.print("Enter Passenger ID: ");
        String id = scanner.next();

        // Tìm kiếm hành khách trong hàng đợi
        Passenger passenger = null;
        for (Passenger p : passengers) {
            if (p.getId().equals(id)) {
                passenger = p;
                break;
            }
        }

        if (passenger != null) {
            System.out.println("Passenger Found:");
            System.out.println(passenger);

            System.out.print("Enter new Passenger Name: ");
            String name = scanner.next();

            System.out.print("Enter new Address: ");
            String address = scanner.next();

            System.out.print("Enter new Phone: ");
            String phone = scanner.next();

            System.out.print("Enter new Date of Departure: ");
            String departureDate = scanner.next();

            System.out.print("Enter new Date of Return: ");
            String returnDate = scanner.next();

            // Cập nhật thông tin hành khách
            passenger.setName(name);
            passenger.setAddress(address);
            passenger.setPhone(phone);
            passenger.setDepartureDate(departureDate);
            passenger.setReturnDate(returnDate);

            System.out.println("Passenger record updated successfully.");
        } else {
            System.out.println("Passenger not found.");
        }
    }

    public static void displayPassengerRecords() {
        System.out.println("Passenger Records:");
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }
}

