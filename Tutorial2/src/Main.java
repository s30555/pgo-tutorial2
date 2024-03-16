import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to the Museum Ticket Calculator!");
                System.out.print("Enter client's city: ");
                String city = scanner.nextLine();
                System.out.print("Enter client's age: ");
                int age = scanner.nextInt();
                System.out.print("Is today Thursday? (yes/no): ");
                scanner.nextLine();
                String isThursdayStr = scanner.nextLine().toLowerCase();
                boolean isThursday = isThursdayStr.equals("yes");
                double ticketPrice = calculateTicketPrice(city, age, isThursday);
                System.out.println("Data: " + city +", " + age +" years old, weekday Ticket price: " + ticketPrice + " PLN");

            }
            public static double calculateTicketPrice(String city, int age, boolean isThursday) {
                double basePrice = 40.0;
                double ageDiscount = applyAgeDiscount(age, basePrice);
                double cityDiscount = applyCityDiscount(city, ageDiscount);
                double thursdayDiscount = applyThursdayDiscount(isThursday, cityDiscount);
                return thursdayDiscount;
            }
            public static double applyAgeDiscount(int age, double price) {
                if (age < 10) {
                    System.out.println("Client is under 10 years old. Admission is free.");
                    return 0.0;
                } else if (age >= 10 && age <= 18) {
                    System.out.println("Client is between 10 and 18 years old. 50% discount applied.");
                    return price * 0.5;
                }
                return price;
            }
            public static double applyCityDiscount(String city, double price) {
                if (city.equalsIgnoreCase("Warsaw")) {
                    System.out.println("Client is a resident of Warsaw. Additional 10% discount applied.");
                    return price * 0.9;
                }
                return price;
            }
            public static double applyThursdayDiscount(boolean isThursday, double price) {
                if (isThursday) {
                    System.out.println("Client is visiting on Thursday. Admission is free.");
                    return 0.0;
                }
                return price;
            }
        }