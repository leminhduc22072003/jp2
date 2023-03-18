package Datvemaybay;

import java.util.Scanner;

import static Datvemaybay.AirlineReservationSystem.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Airline Reservation System Menu:");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit.");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addReservation(scanner);
                    break;
                case 2:
                    modifyPassengerRecord(scanner);
                    break;
                case 3:
                    displayPassengerRecords();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
