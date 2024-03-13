import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bilety wstępu do muzeum");
        System.out.print("Wprowadź nazwe zamieszkiwanego miasta: ");
        String city = scanner.nextLine();
        System.out.print("Wprowadź swój wiek: ");
        int age = scanner.nextInt();
        System.out.print("Czy dziś jest czwartek? (tak/nie): ");
        scanner.nextLine();
        String czyCzwartekStr = scanner.nextLine().toLowerCase();
        boolean czyCzwartek = czyCzwartekStr.equals("tak");
        double ticketPrice = calculateTicketPrice(city, age, czyCzwartek);
        System.out.println("Data: " + city + ", " + age + " years old, weekday Ticket price: " + ticketPrice + "PLN");
    }

    public static double calculateTicketPrice(String city, int age, boolean isThursday) {
        double basePrice = 40.0;
        double finalPrice = basePrice;
        if (age < 10) {
            System.out.println("Klient poniżej 10 lat. Wstęp wolny.");
            return 0.0;
        }
        if (age >= 10 && age <= 18) {
            System.out.println("Klient pomiędzy 10 a 18 lat. 50% zniżki.");
            finalPrice *= 0.5;
        }
        if (city.equalsIgnoreCase("Warszawa")) {
            System.out.println("Klient jest mieszkańcem Warszawy. Dodatkowa 10% zniżka.");
            finalPrice *= 0.9;
        }
        if (isThursday) {
            System.out.println("Klient odwiedza muzem w czwartek. Wstęp wolny.");
            return 0.0;
        }
        return finalPrice;
    }
}
