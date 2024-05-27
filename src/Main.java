import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear(2024);
        checkYear(2020);
        checkYear(2019);
        checkYear(2028);
        checkYear(2017);

        int osType = 0;
        int year = 2023;
        printDeviceVersion(osType, year);

        int days = calculateDistance(157);
        if (days > 0) {
            System.out.println("количество дней = " + days);
        } else {
            System.out.println("Доставки нет");

        }
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");

        }
    }

    public static void printDeviceVersion(int osType, int year) {
        if (year == 0 || year == 1) {
        if (osType < LocalDate.now().getYear() && year == 1) {
           System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (osType == LocalDate.now().getYear() && year == 1 ) {
            System.out.println("Установите версию иприложения для Android по ссылке");
        }
            if (osType < LocalDate.now().getYear() && year == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (osType == LocalDate.now().getYear() && year == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (year != 0 || year != 1) {
            throw new RuntimeException("Ошибка ввода. Такой операционной системы нет.");
        }
    }

    public static int calculateDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;

    }
}



