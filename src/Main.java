import java.time.LocalDate;

public class Main {

    public static void printLeapYear(int year) {
        System.out.println(year + " год - високосный год.");
    }

    public static void printNoLeapYear(int year) {
        System.out.println(year + " год - невисокосный год.");
    }

    public static void checkLeapYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            printLeapYear(year);
        } else {
            printNoLeapYear(year);
        }
    }

    public static void checkValidSystem(int system, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (system == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (system == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (system == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (system == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введены неверные данные");
        }
    }

    public static int checkDeliveryDistance(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDays + " день на доставку.");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDays++;
            System.out.println("Потребуется " + deliveryDays + " дня на доставку.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется " + deliveryDays + " дня на доставку.");
        } else {
            System.out.println("Доставки нет.");
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        System.out.println("Homework methods!");
        System.out.println("\nTask 1");

        checkLeapYear(2024);

        System.out.println("\nTask 2");

        checkValidSystem(1, 2015);

        System.out.println("\nTask 3");

        checkDeliveryDistance(95);

    }
}